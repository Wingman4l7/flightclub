/*
  @(#)Link.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
*/

package flightclub.task;

import java.awt.*;

public class Link {
    Point a, b;

    public Link(Point a, Point b) {
		this.a = a;
		this.b = b;
    }

    public void draw(Graphics g) {
		g.drawLine((int) a.x,(int) a.y,(int) b.x,(int) b.y);
    }
    
    public void highLight(Graphics g) {
		int mx,my;
		mx=(int) (a.x+b.x)/2;
		my=(int) (a.y+b.y)/2;
		g.drawOval(mx-5,my-5,10,10);
    }

}
