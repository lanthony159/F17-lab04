package edu.ucsb.cs56.drawings.guanguangua.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a four-pointed Star that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Guancheng Ren 
   @version for CS56, F17, UCSB
   
*/
public class Star extends GeneralPathWrapper implements Shape
{
    /**
       @param x x coord of center of the star
       @param y y coord of center of the star
       @param radius the length from the center to any four point of the star
    */
    
    // the value of sideLength / radius, sqrt(3) - 1
    // Used to determine the point locations
    private static final double ratio = 0.73205080756;
    private static final double Sin30Ratio = ratio / 2;
    private static final double RemainRatio = 1 - Sin30Ratio;
    
    public Star(double x, double y, double radius)
    {
        //    /\
        //   <  >
        //    \/
        // Four-pointed star, angle at each point is 60
        
        // The length of each side of the star
        
        double lineLength = radius * ratio;
	
        // Coordinate for four pointy points would be (begin at top point, clockwise)
        // (x, y + radius), (x + radius, y), (x, y - radius), (x - radius, y)
        
        // Coordinate for the rest four points would be (begin top left, clockwise)
        // (x - radius * Sin30Ratio, y + radius * Sin30Ratio), (x + radius * Sin30Ratio, y + radius * Sin30Ratio)
        // (x + radius * Sin30Ratio, y - radius * Sin30Ratio), (x - radius * Sin30Ratio, y - radius * Sin30Ratio)

        
        // Draw the lines clockwisely
        // Line2D.Double(double x1, double y1, double x2, double y2)
        Line2D.Double line1 = new Line2D.Double(x - radius * Sin30Ratio, y + radius * Sin30Ratio, 
                                                x, y + radius);
        
        Line2D.Double line2 = new Line2D.Double(x, y + radius, 
                                                x + radius * Sin30Ratio, y + radius * Sin30Ratio);
        
        Line2D.Double line3 = new Line2D.Double(x + radius * Sin30Ratio, y + radius * Sin30Ratio, 
                                                x + radius, y);
        
        Line2D.Double line4 = new Line2D.Double(x + radius, y, 
                                                x + radius * Sin30Ratio, y - radius * Sin30Ratio);
        
        Line2D.Double line5 = new Line2D.Double(x + radius * Sin30Ratio, y - radius * Sin30Ratio, 
                                                x, y - radius);
        
        Line2D.Double line6 = new Line2D.Double(x, y - radius, 
                                                x - radius * Sin30Ratio, y - radius * Sin30Ratio);
        
        Line2D.Double line7 = new Line2D.Double(x - radius * Sin30Ratio, y - radius * Sin30Ratio, 
                                                x - radius, y);
        
        Line2D.Double line8 = new Line2D.Double(x - radius, y, 
                                                x - radius * Sin30Ratio, y + radius * Sin30Ratio);
        
        // put the whole star together
	
        GeneralPath wholeStar = this.get();
        wholeStar.append(line1, false);
        wholeStar.append(line2, false);
        wholeStar.append(line3, false);
        wholeStar.append(line4, false);
        wholeStar.append(line5, false);
        wholeStar.append(line6, false);
        wholeStar.append(line7, false);
        wholeStar.append(line8, false);

    }
}
