package edu.ucsb.cs56.drawings.delinsun.advanced;

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
 * @author Delin Sun 
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few T-shirts.
     */
    
    public static void drawPicture1(Graphics2D g2) {
	    Tshirt t1 = new Tshirt(100,250,100,100);
	    g2.setColor(Color.CYAN); g2.draw(t1);
	
	
	// Make a black T-shirt that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape t2 = ShapeTransforms.scaledCopyOfLL(t1,0.5,0.5);
	t2 = ShapeTransforms.translatedCopyOf(t2,150,0);
	g2.setColor(Color.BLACK); g2.draw(t2);
	
	// Here's a T-shirt that's 4x as big (2x the original)
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
	
	// Draw two T-shirts with dots
	
	TshirtWithDots tw1 = new TshirtWithDots(50,350,40,75);
	TshirtWithDots tw2 = new TshirtWithDots(200,350,150,200);
	
	g2.draw(tw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(tw2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few T-shirts by Delin Sun", 20,20);
    }
    
    
    /** Draw a picture with a few T-shirts.
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some normal T-shirts.
	
	Tshirt large = new Tshirt(100,300,150,225);
	Tshirt smallCC = new Tshirt(20,50,30,40);
	Tshirt tallSkinny = new Tshirt(20,150,20,40);
	Tshirt shortFat = new Tshirt(20,250,20,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Tshirt h1 = new Tshirt(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black T-shirt that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a T-shirt that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two T-shirts with dots.
	
	TshirtWithDots tw1 = new TshirtWithDots(50,350,40,75);
	TshirtWithDots tw2 = new TshirtWithDots(200,350,200,100);
	
	g2.draw(tw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second T-shirt 45 degrees around its center.
	Shape tw3 = ShapeTransforms.rotatedCopyOf(tw2, Math.PI/4.0);
	
	g2.draw(tw3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of normal T-shirts and a few dots T-shirts by Delin Sun", 20,20);
    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of T-shirts by Delin Sun", 20,20);
	
	
	// Draw some T-shirts.
	
	Tshirt large = new Tshirt(100,300,225,150);
	TshirtWithDots smallCC = new TshirtWithDots(20,50,40,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
