package edu.ucsb.cs56.drawings.porter_haet.advanced;

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
 * @author Porter Haet
 * @version for UCSB CS56, F17
 */

public class AllMyDrawings
{

    /** Draw a picture with a few clocks
     */
    
    public static void drawPicture1(Graphics2D g2) {

		Clock clock = new GrandFatherClock(100, 0, 100, 300, 6,15);
		g2.setColor(Color.BLACK);
		g2.draw(clock);

		Clock clock2 = new GrandFatherClock(200, 150, 100, 200, 4, 45);
		g2.setColor(Color.BLUE);
		g2.draw(clock2);

		Clock clock3 = new GrandFatherClock(300, 50, 100, 250, 3, 25);
		g2.setColor(Color.RED);
		g2.draw(clock3);

		Clock clock4 = new GrandFatherClock(400, 350, 100, 300, 2, 15);
		g2.setColor(Color.GREEN);
		g2.draw(clock4);

		Clock clock5 = new GrandFatherClock(100, 550, 100, 150, 7, 25);
		g2.setColor(Color.GRAY);
		g2.draw(clock5);

		Clock clock6 = new GrandFatherClock(320, 250, 100, 200, 8, 25);
		g2.setColor(Color.PINK);
		g2.draw(clock6);

		g2.setColor(Color.BLACK);
		g2.drawString("The most beautiful collection of grandfather clocks I have ever seen by Porter Haet", 20,20);
    }
    
    
    /** Draw a picture with some clocks and grandfather clocks
     */
    public static void drawPicture2(Graphics2D g2) {
    	Stroke original = g2.getStroke();
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);


		Color c1 = Color.BLACK;
		Color c2 = Color.PINK;
		for (double y = 0; y < 700; y += 100) {
			int hour = (int) (12*Math.random()), minute = (int) (60*Math.random());
			Clock clock = new Clock(0, y, 100, 100, hour, minute);

			double mix = y/700;

			Color c = new Color((int) (c1.getRed() * mix + c2.getRed() * (1-mix)),
					(int) (c1.getGreen() * mix + c2.getGreen() * (1-mix)),
					(int) (c1.getBlue() * mix + c2.getBlue() * (1-mix)),
                    255
					);

			g2.setStroke(thick);
			g2.setColor(c);
			g2.draw(clock);
		}

		c1 = Color.BLUE;
		c2 = Color.RED;
		for (double y = 0; y < 700; y += 100) {
			int hour = (int) (12*Math.random()), minute = (int) (60*Math.random());
			Clock clock = new Clock(540, y, 100, 100, hour, minute);

			double mix = y/700;

			Color c = new Color((int) (c1.getRed() * mix + c2.getRed() * (1-mix)),
					(int) (c1.getGreen() * mix + c2.getGreen() * (1-mix)),
					(int) (c1.getBlue() * mix + c2.getBlue() * (1-mix)),
					255
			);

			g2.setStroke(thick);
			g2.setColor(c);
			g2.draw(clock);
		}

		int hour = (int) (12*Math.random()), minute = (int) (60*Math.random());
		Clock grand = new GrandFatherClock(250, 0, 100, 600, hour, minute);
		g2.draw(grand);


		hour = (int) (12*Math.random());
		minute = (int) (60*Math.random());
		grand = new GrandFatherClock(450, 50, 100, 300, hour, minute);
		g2.draw(grand);

    	g2.setStroke(original);
    	g2.setColor(Color.BLACK);
		g2.drawString("An assortment of clocks and grandfather clocks", 250,20);
    }
    
    /** Draw a different picture with the grandfather clocks as hands
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
		// label the drawing
	
		g2.drawString("Grandfather clocks as hands by Porter Haet", 20,20);

		int hour = (int) (12*Math.random()), minute = (int) (60*Math.random());
		Clock clock = new Clock(80, 0, 480, 480, hour, minute);

		Clock hand = new GrandFatherClock(80 + 480/2 - 25, 480/2 - 480*.1, 50, 480*.2, hour, minute);
		double radians = Clock.radians(hour, minute);
		Shape shape = ShapeTransforms.rotatedCopyOf(hand, radians);
		shape = ShapeTransforms.translatedCopyOf(shape, 480*.1*Math.sin(radians), -480*.1 * Math.cos(radians));
		g2.draw(shape);

		hand = new GrandFatherClock(80 + 480/2 - 25, 480/2 - 480*.2, 50, 480*.4, hour, minute);
		radians = Clock.radians(minute);
		shape = ShapeTransforms.rotatedCopyOf(hand, radians);
		shape = ShapeTransforms.translatedCopyOf(shape, 480*.2*Math.sin(radians), -480*.2 * Math.cos(radians));
		g2.draw(shape);

		g2.draw(clock);


    }
}
