package edu.ucsb.cs56.drawings.popi528.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Austin Liang 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	// Large black Watch in top left
        Watch w1 = new Watch(200, 200, 50, 50);
        g2.setColor(Color.BLACK); g2.draw(w1);
	
        // Make a squashed Watch and move it over
        Shape w2 = ShapeTransforms.scaledCopyOfLL(w1,0.75,0.5);
        w2 = ShapeTransforms.translatedCopyOf(w2,250,0);
        g2.setColor(Color.BLACK); g2.draw(w2);
	
        // Label the drawing
        g2.setColor(Color.BLACK);
        g2.drawString("A few Watches by Austin Liang", 20,20);

    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	 // Left
        Watch w1 = new Watch(75,75,50,75);
        g2.setColor(Color.RED); g2.draw(w1);
	
        // Middle
        Watch w2 = new Watch(225,225, 30, 20);
        g2.setColor(Color.BLUE); g2.draw(w2);
	
        // Right
        SmartWatch w3 = new SmartWatch(350,350, 40, 40);
        g2.setColor(Color.ORANGE); g2.draw(w3);
	
        // Label the drawing
        g2.setColor(Color.BLACK);
        g2.drawString("An few Watches and SmartWatches by Austin Liang", 20,20);
	
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// Large black SmartWatch in top left
        SmartWatch w1 = new SmartWatch(100, 100, 35,40);
        g2.setColor(Color.BLACK); g2.draw(w1);
	
        // Red watch on the bottom right
        Watch w2 = new Watch(400, 200, 80, 85);
        g2.setColor(Color.RED);
	Shape i2 = ShapeTransforms.rotatedCopyOf(w2, Math.PI/-2.0);
        g2.draw(i2);
	
	
        // Rotated blue SmartWatch in upper right
        SmartWatch w3 = new SmartWatch(400, 0, 125,125);
        g2.setColor(Color.BLUE);
        Shape i3 = ShapeTransforms.rotatedCopyOf(w3, Math.PI/-2.0);
        g2.draw(i3);
	
        // Label the drawing
        g2.drawString("A bunch of Watches and SmartWatches by Austin Liang", 20,20);
    }       
}
