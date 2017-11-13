package edu.ucsb.cs56.drawings.omercohen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D; 

/**
   A House
      
   @author Omer Cohen
   @version for CS56, W16, UCSB
   
*/
public class Basketball  extends Ball implements Shape
{
    /**
     * Constructor for objects of class CoffeeCup
     */
    public Basketball(double x, double y, double d)
    {
	super(x,y,d);
	
	double r = d/2; 
      	GeneralPath gp = this.get();
	
	Line2D.Double horiz_line =
            new Line2D.Double (x, y+r, x+d, y + r); 
                              
	Line2D.Double vert_line = new Line2D.Double (x + r, y , x + r, y +d); 

        GeneralPath ball_out  = this.get();
        ball_out.append(horiz_line, false);
        ball_out.append(vert_line, false);
	
    }    
}
