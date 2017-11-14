package edu.ucsb.cs56.drawings.rammalyala.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves                   
import java.awt.Shape; // general class for shapes                                      

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**                                                                                     
   A vector drawing of a ball that implements                                          
   the Shape interface, and so can be drawn, as well as                                 
   rotated, scaled, etc.                                                                
                                                                                        
   @author Ram Malyala                                                                 
   @version for CS56, F17, UCSB                                                         
                                                                                        
*/
public class Ball extends GeneralPathWrapper implements Shape
{
    /**                                                                                 
       Constructor                                                                      
                                                                                        
       @param x x coord of leftmost part of ball                                   
       @param y y coord of upmost part of ball                                   
       @param diameter of ball                                                  

    */
    public Ball(double x, double y, double diameter)
    {

	//use ellipse with equal height and width to make a circle that will be a ball
	Ellipse2D.Double ball_circle = new Ellipse2D.Double(x,y,diameter,diameter);
           

        //put together ball using the circle created above
	
        GeneralPath whole_ball = this.get();
        whole_ball.append(ball_circle, false);
  
    }
}
    

