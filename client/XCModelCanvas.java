/*
 * @(#)XCModelCanvas.java (part of 'Flight Club')
 * 
 * This code is covered by the GNU General Public License
 * detailed at http://www.gnu.org/copyleft/gpl.html
 *	
 * Flight Club docs located at http://www.danb.dircon.co.uk/hg/hg.htm
 * Copyright 2001-2003 Dan Burton <danb@dircon.co.uk>
 */

package flightclub.client;

import flightclub.framework3d.*;

class XCModelCanvas extends ModelCanvas {
    XCModelViewer xcModelViewer;
    public XCModelCanvas(XCModelViewer xcModelViewer) {
		super(xcModelViewer);
		this.xcModelViewer = xcModelViewer;
    }

    protected void paintModel() {
		super.paintModel();
		XCModel m = xcModelViewer.xcModel;
		if (m.mode == XCModel.USER) {
				m.compass.draw(graphicsBuffer);
				m.slider.draw(graphicsBuffer);
			}
    }
}
