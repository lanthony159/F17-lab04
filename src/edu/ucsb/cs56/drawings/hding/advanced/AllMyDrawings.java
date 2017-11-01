package edu.ucsb.cs56.drawings.hding.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few houses 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	LightStand t1 = new LightStand(500,300,20,100);
	g2.setColor(Color.CYAN); g2.draw(t1);
	
	// Make a black house that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); g2.draw(t2);
	
	// Here's a house that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	t2 = ShapeTransforms.scaledCopyOfLL(t2,4,4);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(t2); 
	
	// Draw two houses with Windows
	
	TrafficLight hw1 = new TrafficLight(50,350,10,75);
	TrafficLight hw2 = new TrafficLight(200,350,30,140);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Lights by Peter Ding", 20,20);
    }
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some coffee cups.
	
	TrafficLight large = new TrafficLight(100,50,20,150);
	TrafficLight smallCC = new TrafficLight(20,50,3,30);
	TrafficLight tallSkinny = new TrafficLight(20,150,4,40);
	TrafficLight shortFat = new TrafficLight(20,250,4,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Traffic Light by Peter Ding", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Traffic Light by Peter Ding", 20,20);
	
	
	// Draw some coffee cups.
	
	TrafficLight large = new TrafficLight(100,50,30,150);
	TrafficLight smallCC = new TrafficLight(20,50,4,30);
Shape h3 = ShapeTransforms.scaledCopyOfLL(large,0.5,0.5);
Shape h2 = ShapeTransforms.translatedCopyOf(large,150,0);
g2.draw(h2);
h3 = ShapeTransforms.rotatedCopyOf(h3, Math.PI/4.0);
g2.draw(h3);
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
