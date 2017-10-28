package edu.ucsb.cs56.drawings.delinsun.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A T-shirt

   @author Delin Sun
   @version for CS56, F17, UCSB

*/
public class TshirtWithDots extends Tshirt implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public TshirtWithDots(double x, double y, double width, double height)
    {
        super(x,y,width,height);

        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();

        double w = 0.10 * 0.6*width;
        double winTop = y - 0.5 * height;

        Ellipse2D.Double dot1 =
            new Ellipse2D.Double(x + w+0.025*width, winTop, 0.05*width, 0.05*width);
        Ellipse2D.Double dot2 =
            new Ellipse2D.Double(x + 4.0*w+0.025*width,
			    winTop, 0.05*width, 0.05*width);
        Ellipse2D.Double dot3 =
            new Ellipse2D.Double(x + 7.0*w+0.025*width,
			    winTop, 0.05*width, 0.05*width);

	Ellipse2D.Double dot4 =
            new Ellipse2D.Double(x + 2.5*w+0.025*width,
			    winTop-1.5*w, 0.05*width, 0.05*width);
        Ellipse2D.Double dot5 =
            new Ellipse2D.Double(x + 5.5*w+0.025*width,
			    winTop-1.5*w, 0.05*width, 0.05*width);

        Ellipse2D.Double dot6 =
            new Ellipse2D.Double(x + 4.0*w+0.025*width,
			    winTop-3.0*w, 0.05*width, 0.05*width);

	Ellipse2D.Double dot7 =
            new Ellipse2D.Double(x + 2.5*w+0.025*width,
                            winTop+1.5*w, 0.05*width, 0.05*width);
        Ellipse2D.Double dot8 =
            new Ellipse2D.Double(x + 5.5*w+0.025*width,
                            winTop+1.5*w, 0.05*width, 0.05*width);

        Ellipse2D.Double dot9 =
            new Ellipse2D.Double(x + 4.0*w+0.025*width,
                            winTop+3.0*w, 0.05*width, 0.05*width);


        GeneralPath wholeHouse = this.get();
        wholeHouse.append(dot1, false);
        wholeHouse.append(dot2, false);
        wholeHouse.append(dot3, false);
	wholeHouse.append(dot4, false);
        wholeHouse.append(dot5, false);
        wholeHouse.append(dot6, false);
	wholeHouse.append(dot7, false);
        wholeHouse.append(dot8, false);
        wholeHouse.append(dot9, false);
    }
}

