
package edu.ucsb.cs56.drawings.hding.advanced;
import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
/**
 A Traffic Light
 
 @author Peter Ding
 @version for CS56, F17, UCSB
 
 */
public class TrafficLight extends LightStand implements Shape
{
    /**
     * Constructor for objects of class TrafficLight
     */
    public TrafficLight(double x, double y, double width, double height)
    {
        // construct the basic LightStand shell
        super(x,y,width,height);
        
        // get the GeneralPath that we are going to append stuff to
        GeneralPath gp = this.get();
        
        double signal_radius = .3 * width;
        // create 3 signal lights 
        Ellipse2D.Double signal1 =
        new Ellipse2D.Double(x + width/2-signal_radius/2, y + height/10-signal_radius, signal_radius, signal_radius);
        Ellipse2D.Double signal2 =
        new Ellipse2D.Double(x + width/2-signal_radius/2,y + 2*height/10-signal_radius, signal_radius, signal_radius);
        Ellipse2D.Double signal3 =
        new Ellipse2D.Double(x + width/2-signal_radius/2, y + 3*height/10-signal_radius, signal_radius, signal_radius);
        //add them to the figure
        GeneralPath stand = this.get();
        stand.append(signal1, false);
        stand.append(signal2, false);
        stand.append(signal3, false);
    }
}
