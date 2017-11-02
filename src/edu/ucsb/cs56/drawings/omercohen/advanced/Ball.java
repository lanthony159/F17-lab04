package edu.ucsb.cs56.drawings.omercohen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves           
import java.awt.Shape; // general class for shapes                              

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**                                                                             
   A vector drawing of a house that implements                                  
   the Shape interface, and so can be drawn, as well as                         
   rotated, scaled, etc.                                                        
                                                                                
   @author Phill Conrad                                                         
   @version for CS56, W16, UCSB                                                 
                                                                                
*/
public class Ball extends GeneralPathWrapper  implements Shape
{
    /**                                                                         
    Constructor                                                              
                                                                             
    @param x x coord of lower left corner of ball                           
    @param y y coord f lower left corner of ball                          
    @param radius of the ball          
    */
    public Ball(double x, double y, double d)
    {

	// Rather than having to scale at the end, we can just                  
	// draw things the right way to begin with, using the                   
	// x, y, width and height.   If you haven't already                     
	// hard coded a particular drawing, this may be an easier               
	// way.                                                                 

	//double firstStoryHeight = .75 * height;
	//double roofHeight = height - firstStoryHeight;

	//double firstStoryUpperLeftY = y + roofHeight;
     
	// Make the first story 
	double r = d/2; 

     Ellipse2D.Double main_ball  =
         new Ellipse2D.Double(x, y, d, d);
     
     Ellipse2D.Double air_valve = new 
	 Ellipse2D.Double(x + r-r/17,y+r-r/17, d/17, d/17); 
     // make the roof.   Remember that y goes DOWN the page,                 
     // so we ADD to y to get a "lower" value on the scree                                         

     GeneralPath ball_out  = this.get();
     ball_out.append(main_ball, false);
     ball_out.append(air_valve, false);
     
    }
}