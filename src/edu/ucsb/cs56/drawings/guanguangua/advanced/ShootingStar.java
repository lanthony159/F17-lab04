package edu.ucsb.cs56.drawings.guanguangua.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

/**
   A House
      
   @author Guancheng Ren
   @version for CS56, F17, UCSB
   
*/
public class ShootingStar extends Star implements Shape
{
    /**
       @param x x coord of center of the star
       @param y y coord of center of the star
       @param radius the length from the center to any four point of the star
       @param length1 length for the top line after the star
       @param length2 length for the middle line after the star
       @param length3 length for the bottom line after the star
    */
    public ShootingStar(double x, double y, double radius, double length1, double length2, double length3)
    {
	// construct the basic Star shell
	super(x, y, radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make three lines, spaced like this
	//    /\   ----
    //   <  >   ----
    //    \/   ----


        
    Line2D.Double tail1 = new Line2D.Double(x + 1.25 * radius, y + 0.8 * radius, 
                                            x + 1.25 * radius + length1, y + 0.8 * radius);
        
    Line2D.Double tail2 = new Line2D.Double(x + 1.35 * radius, y, 
                                            x + 1.35 * radius + length2, y);
        
    Line2D.Double tail3 = new Line2D.Double(x + 1.25 * radius, y - 0.8 * radius, 
                                            x + 1.25 * radius + length3, y - 0.8 * radius);
	
    
	
	// add the tails to the star
	
        GeneralPath wholeStar = this.get();
        wholeStar.append(tail1, false);
        wholeStar.append(tail2, false);
        wholeStar.append(tail3, false);

    }
     /**
       @param x x coord of center of the star
       @param y y coord of center of the star
       @param radius the length from the center to any four point of the star
       
       The length of the tails of the star is by default 2 * radius
    */
    public ShootingStar(double x, double y, double radius) {
        this(x, y, radius, 2 * radius, 2 * radius, 2 * radius);
    }
}
