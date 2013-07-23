/*
 * @(#)ModelViewerThin.java (part of 'Flight Club')
 * 
 * This code is covered by the GNU General Public License
 * detailed at http://www.gnu.org/copyleft/gpl.html
 *	
 * Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
 * Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
 */
package flightclub.startup;

import java.awt.event.KeyEvent;

public interface ModelViewerThin {
    public void start();
    public void stop();
    public boolean handleEvent (KeyEvent e);
    public void init(ModelEnv x);
}
