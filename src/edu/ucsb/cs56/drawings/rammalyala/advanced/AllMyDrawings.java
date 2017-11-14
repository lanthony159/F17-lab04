package edu.ucsb.cs56.drawings.rammalyala.advanced;

import java.awt.Graphics2D;
import java.awt.Shape;// general class for shapes
import java.awt.geom.Ellipse2D;
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Ram Malyala 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few balls 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Ball b1 = new Ball(200,200,15);
	g2.setColor(Color.CYAN); g2.draw(b1);
	
	// Make a black black ball that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a ball that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two volleyballs
	
	Volleyball v1 = new Volleyball(100,100,20);
	Volleyball v2 = new Volleyball(300,300,25);
	
	g2.draw(v1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(v2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few balls by Ram Malyala", 20,20);
    }
    
    
    // Draw another picture with balls, includes a rotated one
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some balls.
		
	Ball b1 = new Ball(100,250,40);
	g2.setColor(Color.GREEN); g2.draw(b1);
	
	// Make a black ball that's half the size, 
	// and moved over 350 pixels in x direction
	Shape b2 = ShapeTransforms.scaledCopyOfLL(b1,0.5,0.5);
	b2 = ShapeTransforms.translatedCopyOf(b2,350,0);
	g2.setColor(Color.BLACK); g2.draw(b2);
	
	// Here's a ball that's 4x as big (2x the original)
	// and moved over 200 more pixels to right.
	b2 = ShapeTransforms.scaledCopyOfLL(b2,4,4);
	b2 = ShapeTransforms.translatedCopyOf(b2,200,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(b2); 
	
	// Draw two volleyballs
	
	Volleyball v1 = new Volleyball(250,350,30);
	Volleyball v2 = new Volleyball(80,80,50);
	
	g2.draw(v1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second ball 45 degrees around its center.
	Shape v3 = ShapeTransforms.rotatedCopyOf(v2, Math.PI/4.0);
	
	g2.draw(v3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("More balls by Ram Malyala", 20,20);
    }
    
    /** Draw a different picture with a big and a small volleyball
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Even more balls by Ram Malyala", 20,20);
	
	
	// big and small volleyball
	
	Volleyball big = new Volleyball(100,50,150);
	Volleyball small = new Volleyball(20,50,20);
	
	g2.setColor(Color.GREEN);     g2.draw(big);
	g2.setColor(Color.GREEN);   g2.draw(small);
	
    }       
}
