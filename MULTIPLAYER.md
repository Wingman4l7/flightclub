<h1 align="center">Flight Club</h1>

<p align="center"><b>Multiplayer Play</b></p>

## NOTE: THIS IS A DRAFT! ##

### Starting A Game Server ###
			
Command-line arguments from `startup/XCFrame.java`: 			
			
`XCFrame [task] [pilot_type] [host:port] [pgs hgs sps bls]`

All the parameteres are optional. If none are passed in the game loads defaults as follows: 
 - `task` = default
 - `pilot_type` = 1 (hg)
 - `host:port` = null *(ie. single player mode)*
 - pgs = 2, hgs = 4, sps = 2 *(the numbers of each type of AI glider)* <!--- bls = 1 -->

The last two parameters are mutually exclusive. Either we connect to a game server or we create a number of AI gliders.

### Server Commands ###

Commands from `server/XCGameServer.java`:

 - `QUIT`: break;
 - `TEST`: client sends "+OK" and `flush()`
 - `KILLALL`: sends `disconnectAllXCClient()`
 - `LAUNCH`: *not sure... starts the game?* <!---
String tmp = nextLine.substring(nextLine.indexOf(":")+2 ,nextLine.length());
gliderType = parseInt(tmp);
XCGameServer.sendToAll(myID, nextLine);
-->
 - `WARM_FRONT`: secret code to shut down the server <!--- disconnectAllXCClient(); & stop() -->
 
Any other command is just "mirrored" to the other player's consoles, with your ID preprended *(I think)*.  <!--- XCGameServer.sendToAll(myID, nextLine); -->
