package edu.ucsb.cs56.drawings.ankushrayabhari.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.geom.Rectangle2D;
import java.awt.geom.CubicCurve2D;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.drawings.ankushrayabhari.simple.Circle;

/**
   A vector drawing of a cake that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Ankush Rayabhari
   @version for CS56, F17, UCSB

*/
public class CakeWithCandles extends Cake {
    /**
       Constructor

       @param x x coord of lower left corner of cake
       @param y y coord of lower left corner of cake
       @param width width of the cake
       @param height height of cake
    */
    public CakeWithCandles(double x, double y, double width, double height)
    {
        super(x, y, width, height * 0.75);

        Rectangle2D.Double candle1 = new Rectangle2D.Double(x + width*0.05, y - height * 0.25, width*0.2, height*0.25);
        Rectangle2D.Double candle2 = new Rectangle2D.Double(x + width - width*0.25, y - height * 0.25, width*0.2, height*0.25);
        Rectangle2D.Double candle3 = new Rectangle2D.Double(x + width/2 - width*0.1, y - height * 0.25, width*0.2, height*0.25);

        GeneralPath cakePath = this.get();
        cakePath.append(candle1, false);
        cakePath.append(candle2, false);
        cakePath.append(candle3, false);
    }
}
