<h1 align="center">Flight Club</h1>

<p align="center"><b>To-Do List</b></p>

<p align="center">Created by Dan Burton <danb@dircon.co.uk>, 28 Jul 2002</p>
<p align="center">Latest update 31 Jul 2002</p>

## TODO ##
*This is the original "to-do" list created by Dan Burton and posted alongside his source code.  I may update this at some point.*

### Priority 1 ###

* Terrain !? => finish TaskDesigner

* Shadows (flow smoothly over terrain, folding around hills, get depth
  sort sorted)

* Collision detection

* Database backend for league table

### Priority 2 ###

* Sink (simply rectangles)

* Blue thermals (still use Cloud but shape3d = null).

* Balloons

* Thermal cycle...

  1. Bubble starts lifting
  2. Thermal column reaches from ground up to cloud.
  3. No longer fed from the ground

  Add stages 1 and 3 to the current model.

* Vector maps (I've fudged this with view #5)

* Menus (eg. press <1> for para, <2> for hang or <3> for sail) - form
  based ?

* Fast depth sort

* Exploding wings/pilots - fall with acceleration g then bounce

### Priority 3 ###

* Total energy: ke + pe = constant. Already written code for this. Dig
  it out of the old version. (~year 2000 ?)

* A snazzy wrapper to f:X->Y that does caching, linear and cubic interpolation
  and screen IO. Use for thermal noise, lapse rate, glider polar...

* Lens flare !

* Wave clouds

* Two/three celled clouds. NB. just one thermal column.

* Cloud algebra. May add two clouds and get a bigger cloud. The shape
  is not important. *Bigger* is what counts ! A Cu-Nim may have the
  same shape; the size and the big blue hole of sink that surrounds it
  is what makes it stand out !

* Depth of convection -> stratus clouds 

* Perl 6 gives you the big knob - Larry Wall

## DONE ##

* Add 'people' to the landscape to give a sense of scale (cf
  architectural drawings). Reuse the pilot. Make people lean as they
  follow roads. (15 Sep 2002)

* Tidy up Object3d.addWire(...). It is very confusing ! Also, may pass
  in float[][] for a list of points. Also, for a square, say, we
  should only need to pass in four points, not five ! (15 Aug 2002)

* Clock, ModelViewer - FRAME_RATE vs timePerFrame - tune the two
  according to CPU performance. We need this so all clients keep their
  model time in synch for network game. (11 Aug 2002)

* Object3d - convert point from a vector to an array (use
  System.copyArray() as in demo wire frame applet). (07 Aug 2002)