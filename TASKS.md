<h1 align="center">Flight Club</h1>

<p align="center"><b>Creating Task Maps</b></p>


### About ###

There is a task building tool included in this game.  This is pretty neat, because it allows you to build competition tasks that you can challenge yourself with, and it keeps the game fresh from a multiplayer perspective.  It also opens the doors to the possibility of creating online leaderboards for certain task "maps".

### How To Run ###

The command is: `java flightclub/task/TaskFrame` to run the Task Designer.

*[WRITE INFO HERE on how it loads / saves tasks]*
   
### Stability ###
After a quick test, I noticed the following:

 - `parseFile()` doesn't look like it has any code to handle roads *(and maybe not hills either)*
 - likewise, trying to construct hills or roads in the Task Designer throws a whole bunch of exceptions
 - `taskID` is hard-coded to `t001.task`, which means that the Open button only works for that filename; that also means that the Task Designer can only save to that filename
