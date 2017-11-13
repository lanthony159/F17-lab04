package edu.ucsb.cs56.drawings.omercohen.advanced;
import java.lang.Math; 
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
	
	Ball b1  = new Ball(100,100,100);
	 g2.draw(b1);
	}
    
    
    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {
	Basketball b2 = new Basketball(100,100,100); 
	g2.draw(b2); 

    }
    
    /** Draw a different picture with a few houses and coffee cups
     */
    
    public static void drawPicture3(Graphics2D g2) {
	Basketball b3 = new Basketball(300,300,50);
	Basketball b4 = new Basketball(10,10,20);
	Basketball b5 = new Basketball(50,50,100);
	
	
	g2.draw(b3);

	g2.setColor(Color.RED);	
	//g2.fill(b4);
	//g2.setColor(Color.BLACK); 
	g2.draw(b4);
	
	g2.setColor(Color.ORANGE);
	g2.draw(b5);


	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL); 
	
	Stroke orig=g2.getStroke();                                                                                                 
        g2.setStroke(thick);                                                                                                        
        g2.setColor(new Color(0x0F2FA7));                                                                                           
        g2.draw(b3);  
	
	g2.setColor(Color.GREEN);//#FFA500  
	Basketball b7 = new Basketball(350,20 ,45);
	g2.rotate(Math.toRadians(45)); 
	g2.draw(b7);
    }       
}