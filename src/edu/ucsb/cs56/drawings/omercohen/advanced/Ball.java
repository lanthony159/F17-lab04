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

     double r = d/2; 

     Ellipse2D.Double main_ball  =
         new Ellipse2D.Double(x, y, d, d);
     
     Ellipse2D.Double air_valve = new 
     Ellipse2D.Double(x + r-r/17,y+r-r/17, d/17, d/17); 

     GeneralPath ball_out  = this.get();
     ball_out.append(main_ball, false);
     ball_out.append(air_valve, false);
     
    }
}