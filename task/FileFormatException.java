/*
  @(#)FileFormatException.java (part of 'Flight Club')
	
  This code is covered by the GNU General Public License
  detailed at http://www.gnu.org/copyleft/gpl.html
	
  Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
  Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
*/

package flightclub.task;

import java.io.*;

public class FileFormatException extends IOException {
	/** 
		This exception may be thrown by parsers. 
	*/
    public FileFormatException(String s) { 
		super(s); 
	}
}
