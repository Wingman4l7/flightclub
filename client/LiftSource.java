/*
  LiftSource.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
*/
package flightclub.client;

interface LiftSource {
    float[] getP();
    public float getLift(float[] p);
    public boolean contains(float[] p);
    public boolean isActive();
    public boolean isActive(float t);
    public float getLift();
}
