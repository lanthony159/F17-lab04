package edu.ucsb.cs56.drawings.ankushrayabhari.advanced;

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
 * @author Ankush Rayabhari
 * @version for UCSB CS56, W16
 */

public class AllMyDrawings
{
    /** Draw a picture with a few cakes
     */

    public static void drawPicture1(Graphics2D g2) {
		Cake cake = new Cake(100,250,50,75);
		g2.setColor(Color.BLUE);
		g2.draw(cake);

		Shape movedCake = ShapeTransforms.scaledCopyOfLL(cake,0.5,0.5);
		movedCake = ShapeTransforms.translatedCopyOf(movedCake,150,0);
		g2.setColor(Color.BLACK);
		g2.draw(movedCake);

		movedCake = ShapeTransforms.scaledCopyOfLL(movedCake,4,4);
		movedCake = ShapeTransforms.translatedCopyOf(movedCake,150,0);
		Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);
		Stroke orig = g2.getStroke();
		g2.setStroke(thick);
		g2.setColor(new Color(0x002FA7));
		g2.draw(movedCake);

		CakeWithCandles cakeWithCandles = new CakeWithCandles(170,250,50,75);
		g2.setColor(Color.BLUE);
		g2.draw(cakeWithCandles);

		// Make a black house that's half the size,
		g2.setStroke(orig);
		g2.setColor(Color.BLACK);
		g2.drawString("Cakes by Ankush Rayabhari", 20,20);
    }


    /** Draw a picture with a few cakes
     */
    public static void drawPicture2(Graphics2D g2) {
		CakeWithCandles cake1 = new CakeWithCandles(100,250,50,75);
		CakeWithCandles cake2 = new CakeWithCandles(300,50,40,30);
		CakeWithCandles cake3 = new CakeWithCandles(20,150,20,40);
		CakeWithCandles cake4 = new CakeWithCandles(400,250,40,20);
		g2.setColor(Color.BLUE);
		g2.draw(cake1);

		g2.setColor(Color.RED);
		g2.draw(cake2);

		g2.setColor(Color.YELLOW);
		g2.draw(cake3);

		g2.setColor(Color.GREEN);
		g2.draw(cake4);

		// Make a black house that's half the size,
		g2.setColor(Color.BLACK);
		g2.drawString("Cakes with candles by Ankush Rayabhari", 20,20);
    }

    /** Draw a different picture with a few cakes.
     */

    public static void drawPicture3(Graphics2D g2) {
    	Shape cake1 = new CakeWithCandles(100,250,225,150);
		Shape cake2 = new CakeWithCandles(20,50,40,30);
		cake1 = ShapeTransforms.rotatedCopyOf(cake1, Math.PI/3.0);

		g2.setColor(Color.RED);
		g2.draw(cake1);
		g2.setColor(Color.GREEN);
		g2.draw(cake2);



		g2.setColor(Color.BLACK);
		g2.drawString("Various Cakes by Ankush Rayabhari", 20,20);
    }
}
