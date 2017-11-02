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
	// construct the basic house shell
	super(x,y,d);
	
	double r = d/2; 
      	GeneralPath gp = this.get();
	
	Line2D.Double horiz_line =
            new Line2D.Double (x, y+r, x+d, y + r); 
                              
	Line2D.Double vert_line = new Line2D.Double (x + r, y , x + r, y +d); 

	//Line2D.Double diag_line_1 = new Line2D.Double(
	//Line2D.Double top_left_angle_line = new Line2D.Double(x+r/2, y+r/2, x+r/2-(r/2*.7071), y + r/2 - (r/2*.7071)); 
	//Line2D.Double top_right_angle_line = new Line2D.Double(x + r + r/2, y + r/2, x+r/2+(r/2*.7071), y + r/2 - (r/2*.7071)); 
	//Line2D.Double top_connector_line = new Line2D.Double(x + r/2, y + r/2, x + r + r/2, y+r/2); 
	//Ball basket_ball = new Ball(x,y,r); 
	
	
	// Make three windows, spaced like this, where w=width/10.0;
	// | +--+ +--+ +--+ |
	// | |  | |  | |  | |
	// | +--+ +--+ +--+ |
	// |w 2w w 2w w w2 w|
	//
	// The top of window will be at y + 0.5*height and the
	// height of the window is 0.25height;
	/*
	double w = 0.10 * width;
	double winTop = y + 0.5 * height;
	Rectangle2D.Double win1 =
	    new Rectangle2D.Double(x + w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win2 =
	    new Rectangle2D.Double(x + 4.0*w, winTop, 2.0 * w, winHt);
	Rectangle2D.Double win3 =
	    new Rectangle2D.Double(x + 7.0*w, winTop, 2.0 * w, winHt);
	*/
	// add the windows to the house
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath ball_out  = this.get();
        ball_out.append(horiz_line, false);
        ball_out.append(vert_line, false);
	
	//ball_out.append(top_left_angle_line, false); 
	//ball_out.append(top_right_angle_line, false);
        //ball_out.append(top_connector_line, false);
	//wholeHouse.append(win3, false); 
    }    
}
