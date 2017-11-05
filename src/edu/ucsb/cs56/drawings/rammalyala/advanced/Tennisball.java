package edu.ucsb.cs56.drawings.rammalyala.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**                                                                                                         
   A Tennisball                                                                                                  
                                                                                                            
   @author Ram Malyala                                                                                     
   @version for CS56, F17, UCSB                                                                             
                                                                                                            
*/
public class Tennisball extends Ball implements Shape
{
    /**                                                                                                     
     * Constructor for objects of class Tennisball                                                           
     */
    public Tennisball(double x, double y, double diameter)
    {
        // construct the basic ball shell                                                                  
        super(x,y,diameter);

        // get the GeneralPath that we are going to append stuff to                                         
        GeneralPath gp = this.get();


	// line through the ball
	Line2D.Double mid_line = new Line2D.Double(x + diameter/2, y, x + diameter/2, y + diameter);

	// add the line to the rest of the ball to make it a tennisball  
        GeneralPath whole_ball = this.get();
        whole_ball.append(mid_line, false);
    }
}
