package edu.ucsb.cs56.drawings.delinsun.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;


public class Tshirt extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of lower left corner of Tshirt
       @param y y coord of lower left corner of Tshirt
       @param width width of the Tshirt
       @param height of Tshirt
    */
    public Tshirt(double x, double y, double width, double height)
    {

        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.

	double bodyPartWidth = 0.6 * width;

        double bodyUpper = y - height;

        // Make the body part of the Tshirt

        Rectangle2D.Double bodyTshirt =
            new Rectangle2D.Double(x, bodyUpper ,
                                   bodyPartWidth, height);

	double arm1Height = bodyUpper + height/5.0;
        Line2D.Double leftArm1 =
            new Line2D.Double (x - width/3.0, arm1Height,
                               x , bodyUpper);

	Line2D.Double leftArm2 = 
	    new Line2D.Double (x - width/3.0, arm1Height + height/4.0,
			       x , bodyUpper + height/4.0);

	Line2D.Double leftArm3 =
            new Line2D.Double (x - width/3.0, arm1Height,
                               x - width/3.0, arm1Height + height/4.0);

	Line2D.Double rightArm1 =
            new Line2D.Double (x + width/3.0 + 0.6*width, arm1Height,
                               x + 0.6*width, bodyUpper);

        Line2D.Double rightArm2 =
            new Line2D.Double (x + width/3.0 + 0.6*width, arm1Height + height/4.0,
                               x + 0.6*width, bodyUpper + height/4.0);

        Line2D.Double rightArm3 =
            new Line2D.Double (x + width/3.0 + 0.6*width, arm1Height,
                               x + width/3.0 + 0.6*width, arm1Height + height/4.0);

	Ellipse2D.Double neckline = 
	    new Ellipse2D.Double (x + 0.6*width/4.0,bodyUpper,
			    0.6*width/2.0, height/5.0);

        GeneralPath wholeHouse = this.get();
        wholeHouse.append(bodyTshirt, false);
        wholeHouse.append(leftArm1, false);
	wholeHouse.append(leftArm2, false);
	wholeHouse.append(leftArm3, false);
	wholeHouse.append(rightArm1, false);
        wholeHouse.append(rightArm2, false);
        wholeHouse.append(rightArm3, false);
	wholeHouse.append(neckline, false);
    }
}

