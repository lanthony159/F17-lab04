
package edu.ucsb.cs56.drawings.hding.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 A vector drawing of a light stand that implements
 the Shape interface, and so can be drawn, as well as
 rotated, scaled, etc.
 
 @author Peter Ding
 @version for CS56, F17, UCSB
 
 */
public class LightStand extends GeneralPathWrapper implements Shape
{
    /**
     Constructor
     
     @param x x coord of upper left corner of stand
     @param y y coord of upper left corner of stand
     @param width width of the light
     @param height of light
     */
    public LightStand(double x, double y, double width, double height)
    {
        
        //declare dimensions
        
        double panel_width = width;
        double panel_height = height/3;
        double pillar_width = width/5;
        double pillar_height = height/3*2;
        double base_width = width;
        double base_height = height/20;
        
        // Make the panel
        
        Rectangle2D.Double panel = new Rectangle2D.Double(x,y,panel_width, panel_height);
        
        // Make the pillar
        
        Rectangle2D.Double pillar = new Rectangle2D.Double(x+2*pillar_width,y+panel_height, pillar_width, pillar_height);
        
        //Make the base
        Rectangle2D.Double base = new Rectangle2D.Double( x, y+height, base_width, base_height);
        
        // put the whole stand together
        
        GeneralPath stand = this.get();
        stand.append(base, false);
        stand.append(pillar, false);
        stand.append(panel, false);
    }
}
