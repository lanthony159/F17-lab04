package edu.ucsb.cs56.drawings.rammalyala.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**                                                                                                         
   A Volleyball                                                                                                  
                                                                                                            
   @author Ram Malyala                                                                                     
   @version for CS56, F17, UCSB                                                                             
                                                                                                            
*/
public class Volleyball extends Ball implements Shape
{
    /**                                                                                                     
     * Constructor for objects of class Tennisball                                                           
     */
    public Volleyball(double x, double y, double diameter)
    {
        // construct the basic ball shell                                                                  
        super(x,y,diameter);

        // get the GeneralPath that we are going to append stuff to                                         
        GeneralPath gp = this.get();


	// line through center of the ball
	Line2D.Double mid_line = new Line2D.Double(x + diameter/2, y, x + diameter/2, y + diameter);

	// line through ball halfway between center and left edge  
	double chord_length = 2 * Math.sqrt(Math.pow(diameter/2,2) -  Math.pow(diameter/4,2));
	Line2D.Double left_line = new Line2D.Double(x + diameter/4, y + (diameter - chord_length)/2, x + diameter/4, y + (diameter - chord_length)/2 + chord_length);

	// line through ball halfway between center and right edge
	Line2D.Double right_line = new Line2D.Double(x + 3 * diameter/4, y + (diameter - chord_length)/2, x + 3 * diameter/4, y + (diameter - chord_length)/2 + chord_length);

	// add the lines to the rest of the ball to make it a volleyball  
        GeneralPath whole_ball = this.get();
        whole_ball.append(mid_line, false);
	whole_ball.append(left_line, false);
	whole_ball.append(right_line, false);
    }
}
