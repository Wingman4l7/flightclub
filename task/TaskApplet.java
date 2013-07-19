/*
  @(#)TaskApplet.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
*/

package flightclub.task;

import java.applet.*;
import java.io.*;

public class TaskApplet extends Applet implements TaskEnv {

    public void init() {
		TaskDesigner td;
		this.add(td = new TaskDesigner());
		td.init(this);
    }

    public InputStream openFile(String name) {
		return null;
	}
}
