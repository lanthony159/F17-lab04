package edu.ucsb.cs56.drawings.popi528.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   
      
   @author Austin Liang
   @version for CS56, F11, UCSB
   
*/
public class Watch extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of watch
       @param y y coord of lower left corner of watch
       @param width width of the watch
       @param height of watch 
    */
    public Watch(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.


	// declare the size and location of the upper and lower watch band
        double upperband_h = 1.5 * height;
        double upperband_w = 0.75 * width;
        
        double lowerband_h = 2.45 * height;
        double lowerband_w = 0.75 * width;

	// declare the size and location of the hole on the lower watch band
        double hole_h = 0.3 * height;
        double hole_w = 0.5 * width;

	// Add the Watch shell and WatchBand and WatchBand hole

        Rectangle2D.Double body = 
            new Rectangle2D.Double(x, y ,
				   width, height);
        
        Rectangle2D.Double upperband = 
            new Rectangle2D.Double(x + 0.125 * width, y - upperband_h ,
				   upperband_w, upperband_h);
        
        Rectangle2D.Double lowerband = 
            new Rectangle2D.Double(x + 0.125 * width, y + height,
				   lowerband_w, lowerband_h);
        
        Rectangle2D.Double hole1 = 
            new Rectangle2D.Double(x + 0.25 * width, y + 0.225 * lowerband_h + 0.7*height,
				   hole_w, hole_h);
        
        Rectangle2D.Double hole2 = 
            new Rectangle2D.Double(x + 0.25 * width, y + 2 * (0.225 * lowerband_h) + hole_h + 0.7*height,
				   hole_w, hole_h);
        
        Rectangle2D.Double hole3 = 
            new Rectangle2D.Double(x + 0.25 * width, y + 3 * (0.225 * lowerband_h) + 2 * hole_h + 0.7*height,
				   hole_w, hole_h);

        // put the whole watch together
	
        GeneralPath wholeWatch = this.get();
        wholeWatch.append(body, false);
        wholeWatch.append(upperband, false);
	wholeWatch.append(lowerband, false);
        wholeWatch.append(hole1, false);
	wholeWatch.append(hole2, false);
	wholeWatch.append(hole3, false);

    }
}
