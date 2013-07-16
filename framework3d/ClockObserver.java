/*
  @(#)ClockObserver.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2002 Dan Burton <danb@dircon.co.uk>
*/
package flightclub.framework3d;
/**
   This interface is for objects that do stuff when the clock
   ticks. We pass the current model time and the amount of model time
   until the next tick each time we call tick.  
*/
public interface ClockObserver {
    public void tick(float t, float dt);
}
