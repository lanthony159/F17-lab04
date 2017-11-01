package edu.ucsb.cs56.drawings.guanguangua.advanced;

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
 * @author Guancheng Ren
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few stars and zoom/move them
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Star s1 = new Star(100,250,50);
	g2.setColor(Color.MAGENTA); g2.draw(s1);
        
    ShootingStar s2 = new ShootingStar(200, 400, 60);
    g2.setColor(Color.RED); g2.draw(s2);
        
    // Make a black shooting star that's half the size of s2, 
	// and moved over 150 pixels in x direction, -200 in y direction
	
	Shape s3 = ShapeTransforms.scaledCopyOfLL(s2,0.5,0.5);
	s3 = ShapeTransforms.translatedCopyOf(s3,150,-200);
	g2.setColor(Color.BLACK); g2.draw(s3);
    
    // Make a yellow star that's 1.5 times the size of s1, 
	// and moved over 100 pixels in x direction, -120 in y direction
    Shape s4 = ShapeTransforms.scaledCopyOfLL(s1,1.5,1.5);
	s4 = ShapeTransforms.translatedCopyOf(s4,100,-120);
	g2.setColor(Color.YELLOW); g2.draw(s4);
        
    Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	
	// Labeling the drawing
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few shooting stars (or Ninja frisbees) by Guancheng Ren", 20,20);
    }
    
    
    /** Draw a picture with a few concentric stars and rotate them
     */
    public static void drawPicture2(Graphics2D g2) {
	
    int x = 640 / 2, y = 480 / 2;
	// Draw some stars and shooting stars.
	
	Star large = new Star(x,y,215);
	Star middle = new Star(x,y,150);
	Star small = new Star(x,y,75);
	ShootingStar center = new ShootingStar(x,y,40,250,270,250);
	
	g2.setColor(Color.RED);     g2.draw(large);
	// Rotate the large star 45 degrees around its center.
	Shape a = ShapeTransforms.rotatedCopyOf(large, Math.PI/4.0);
    g2.draw(a);
        
	g2.setColor(Color.GREEN);   g2.draw(middle);
    // Rotate the middle size star 45 degrees around its center.
	Shape b = ShapeTransforms.rotatedCopyOf(middle, Math.PI/4.0);
    g2.draw(b);
    
	g2.setColor(Color.BLUE);    g2.draw(small);
    // Rotate the small size star 45 degrees around its center.
	Shape c = ShapeTransforms.rotatedCopyOf(small, Math.PI/4.0);
    g2.draw(c);
    
	g2.setColor(Color.MAGENTA); g2.draw(center);
	
	
    // Change the thickness of the line
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
        
    Stroke orig=g2.getStroke();
	// Label the drawing
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few concentric stars (or Ninja frisbees) by Guancheng Ren", 20,20);
    }
    
    /** Draw a different picture with many shooting stars falling
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Many falling stars by Guancheng Ren", 20,20);
	
	
	// Create a list of ShootingStar.
    ShootingStar[] list = new ShootingStar[10];
    
    for (int i = 0; i < 10; ++i) {
        // Generate the x,y coordinate, and radius of each shooting star
        int x = (int) (Math.random() * 45) + 45 * i + 35;
        int y = (int) (Math.random() * 80) + 100;
        int r = (int) (Math.random() * 48 + 7);
        list[i] = new ShootingStar(x, y, r);
    }
    
    // Temporary Shape array for rotating the shooting stars
	Shape[] temp = new Shape[10];
    
    for (int i = 0; i < 10; ++i){
        temp[i] = ShapeTransforms.rotatedCopyOf(list[i], Math.PI/0.75);
    }
        
    // Paint the stars
    for (int i = 0; i < 10; ++i){
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        Color ran = new Color(r,g,b);
        g2.setColor(ran);
        g2.draw(temp[i]);
        
    }
    
    
    }       
}
