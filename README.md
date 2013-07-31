<h1 align="center">Flight Club</h1>

<p align="center"><b>An arcade-style 3D gliding simulator</b></p>

<p align="center">
<img src="https://raw.github.com/Wingman4l7/flightclub/master/screenshot_v3_02_09.png" alt="from v3_02_09"/>
</p>

## About ##

This arcade-style 3D gliding simulator was written by the late Dan Burton.  His original website is available [from the Internet Archive] [archive].  The networking code for multiplayer and the code for the paraglider & pilot shapes were written by Artem Nikulchev (<jaguart@paragliding.ru>), a paraglider pilot from Moscow.

After his website went offline I decided that I couldn't abide by such a sleek little game slipping into obscurity.  I have resurrected it here, and have applied some basic fixes to get it working again.  *(See the [changelog] [CL_sublink] for details.)*

[archive]: http://web.archive.org/web/20050620075430/http://www.danb.dircon.co.uk/hg/hg.htm
[CL_sublink]: https://github.com/Wingman4l7/flightclub#changelog

### Versions ###

There were two versions:

  - `hg_src_3_01` : this was the "old" version with just hang gliders, a simple task, fewer camera views, etc.
  - `xc_src_3_02_09` : this was the newest version, with sailplanes and paragliders *(and balloons)* added, more camera angles, a competition "task", etc.

The newer version is the version that is under active development here.  I will upload the older, simpler version's source code  *(for use in school projects, etc.)* and a stand-alone executable JAR file of same, in the near future.

### Features ###

 - 3 different types of glider: hangglider, paraglider,and sailplane -- and a hot air balloon!
 - Network play!
 - Task building tool!
 - *Other things!*

### Coming Soon ###

 - *Who knows?  Maybe a stereoscopic 3D version?*

### Changelog ###

To see the fixes & new features I've applied to the original source code, view the [changelog](https://github.com/Wingman4l7/flightclub/blob/master/CHANGELOG.md).

These are the main fixes:

 - got the vario sounds working
 - enabled the balloon glider type *(but not in the command-line arguments)*
 - mucked with the directory paths so a stand-alone executable JAR would work *(not committed yet!)*

## Compiling / Running / Playing ##

### How To Compile ###

This was compiled successfully with Java version 1.7.0_25 *(Java Development Kit SE 7 Update 25)*.  I believe it has compiled successfully with previous versions.
Some of the classes "use or ovveride a deprecated API"; also, "some input files use unchecked or unsafe operations."  It works fine though.  :)

*Compile instructions coming soon!*

I've packaged up some JAR files that run stand-alone for those who just wish to play with the last stable build or the latest experimental build.  These should run fine if you have Java installed.  You can [download Java here](http://java.com/en/download/index.jsp).  I will upload these to GitHub soon!

### How To Run ###
 
The `XCFrame` class in `/startup/` implements Flight Club as an application.  It reads parameters in from the command line:

`java flightclub/startup/XCFrame [task] [pilot_type] [host:port] [pgs hgs sps]`

<!--- balloon glider type does not have a command-line parameter yet-->

All the parameters are optional. If none are passed in the game loads defaults as follows: 
 - `task` = default
 - `pilot_type` = 1 (hg)
 - `host:port` = null *(ie. single player mode)*
 - pgs = 2, hgs = 4, sps = 2 *(the numbers of each type of AI glider)*

The last two parameters are mutually exclusive. Either we connect to a game server or we create a number of AI gliders.

Alternatively, you can just double-click on the stand-alone executable to run it.  If you wish to use a non-default task or host / connect to a network game:
`java -jar Flight_Club_3_02_xx.jar  [parameters]`
   
### How To Play ###

For game controls, objectives, and tips, view the [instructions](https://github.com/Wingman4l7/flightclub/blob/master/INSTRUCTIONS.md).

## License ##

Dan Burton [licensed this source code] [license_ref] under version 2 of the [GNU General Public License] [GNU_GPL].  Although I might personally choose to release source code under a diferent license (like [Creative Commons](http://creativecommons.org/licenses/)), let's say that all this is under the GPL too, for simplicity's sake.

[license_ref]: http://web.archive.org/web/20050620075430/http://www.danb.dircon.co.uk/hg/hg.htm#dev
[GNU_GPL]: http://www.gnu.org/licenses/old-licenses/gpl-2.0.html

## Donations ##

If you appreciate my continued support & development of this game, you can send Bitcoin donations to: `1F7kfMNUNQy8e52RHnQAWYXeaYfzFqHJAZ`

*Quick reference:* $1 USD is currently: <img src="http://btcticker.appspot.com/mtgox/1.00usd.png">

Alternatively, you can use [Gittip](https://www.gittip.com/Wingman4l7/).

As the original author [Dan Burton said] [donate_quotes]:

>"Earn yourself some "kharma in the dharma" - make a donation to support Flight Club. [...] Remember, *open-source* means free in the sense of free speech not free beer."

[donate_quotes]: http://web.archive.org/web/20050620075430/http://www.danb.dircon.co.uk/hg/hg.htm#donations
