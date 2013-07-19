 <h1 align="center">Flight Club</h1>
 
<p align="center"><b>Change Log</b></p>
 
## /startup ##
 
### XCFrame ###
  
 - normalized indentation
 - added comments in main()
 - enabled use of balloon glider type via the command-line argument *(not working!)*
 - set AI defaults to have 1 less hang glider, and to include 1 balloon *(not working!)*
  
### ModelFrame ###
  
 - added code to play() so vario sounds would work
 - normalized indentation 
  
  
## /client ##
 
 - normalized indentation for classes: `Variomeer`, `XCModelViewer`, `XCModel`, `Task`, `XCCameraMan`, `GliderManager`, `GliderType`
 
### Variometer ###
 - changed file reference from .au to .wav to be compatible with new  play() code
  
### GliderManager ###

 - enabled Balloon glider-type 
 
  
## /framework3d ##

 - normalized indentation for classes: 	`ModelViewer`, `CameraMan`, `ModelCanvas`

 
## /task ##

  - normalized indentation for all classes (`Link`, `TaskDesigner`, `ParameterCanvas`, `Point`, `TaskApplet`, `FileFormatException`, `TaskFrame`)

### TaskDesigner ###

 - TODO: add missing bits or, in the meantime, add error handling to gracefully fail when someone tries to use them
 
 
 ## /data ##
 
  - normalized indentation for all classes (`Balloon`, `HangGlider`, `Paraglider`, `Person`, `Sailplane`)