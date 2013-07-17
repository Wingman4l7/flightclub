/*
 * @(#)ModelFrame.java (part of 'Flight Club')
 * 
 * This code is covered by the GNU General Public License
 * detailed at http://www.gnu.org/copyleft/gpl.html
 *	
 * Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
 * Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
 */
package flightclub.startup;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.sound.sampled.*;

/**
   This class displays a ModelViewer in a frame. Thus we may run a
   model as a stand alone application rather than an applet.  

   Ths task has crept in here. Oops - I'm in a muddle with my
   constructor chaining again. I wanted to keep the task in the sub
   class XCFrame.
*/
public class ModelFrame extends Frame implements ModelEnv { 
    ModelViewerThin modelViewerThin = null;
    String task; 
    int pilotType;
    String hostPort;
    int[] typeNums; //ditto

    public ModelFrame(String modelViewerClassName, String title, int width, int height, 
					  String task, int pilotType, String hostPort, int[] typeNums) {
		super(title);

		try {
			Class c = Class.forName(modelViewerClassName);
			this.modelViewerThin = (ModelViewerThin) c.newInstance();
		} catch (Exception e) {
			System.out.println(e);
			System.exit(1);
		}

		this.task = task;
		this.pilotType = pilotType;
		this.hostPort = hostPort;
		this.typeNums = typeNums;

		setSize(width, height);
		setLayout(new BorderLayout());
		add("Center", (Panel) modelViewerThin);
		validate();
		show(); // this call has been deprecated!

		modelViewerThin.init((ModelEnv) this);
		modelViewerThin.start();

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				modelViewerThin.stop();
				System.exit(0);
			}
			});

		this.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				ModelFrame.this.modelViewerThin.handleEvent(e);
			}
			public void keyReleased(KeyEvent e){
				ModelFrame.this.modelViewerThin.handleEvent(e);
			}
			});
    }
	
    public Image getImage(String s) {
		return Toolkit.getDefaultToolkit().getImage(s);
    }
	
    public void play(String s) {
		InputStream path = getClass().getResourceAsStream("/" + s);
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(path));
			clip.start();
		}
		catch (Exception e) {
			String msg = "Error playing sound: " + s + "\n";
			System.out.println(msg + e.toString());
		}
    }

    /**
		Reads a file; the file name should be relative to current directory. 
	*/
    public InputStream openFile(String name) {
		File f;
		FileInputStream is = null;
		String dir = System.getProperty("user.dir");

		try {
			f = new File(dir, name);
			is = new FileInputStream(f);
			return is;
		} catch (Exception e) {
			String msg = "Error opening file. Dir: " + dir + ", name: " + name + "\n";
			System.out.println(msg + e.toString());
		} 
		return null;
    }

    public String getTask() { return task; }
    public int getPilotType() { return pilotType; }
    public String getHostPort() { return hostPort; }
    public int[] getTypeNums() { return typeNums; }
}
