/*
  Hill.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
*/
package flightclub.client;

public class Hill implements LiftSource {
    public float[] getP() {return new float[] {0, 0, 0};}
    public float getLift(float[] p) {return 0;}
    public float getLift(){return 0;}	
    public boolean contains(float[] p){return false;}
    public boolean isActive(){return true;}
    public boolean isActive(float t) {return true;}
    Circuit getCircuit() { return new Circuit(2); }
}
