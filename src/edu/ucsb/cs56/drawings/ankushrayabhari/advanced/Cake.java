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
public class Cake extends GeneralPathWrapper implements Shape {
    /**
       Constructor

       @param x x coord of lower left corner of cake
       @param y y coord of lower left corner of cake
       @param width width of the cake
       @param height height of cake
    */
    public Cake(double x, double y, double width, double height)
    {
        double icingRadius = 0.25 * 0.25 * height;

        Rectangle2D.Double cakeRect = new Rectangle2D.Double(x, y, width, height);

        Circle icing1 = new Circle(x + icingRadius, y + height/2, icingRadius);
        Circle icing2 = new Circle(x + width/2, y + height/2, icingRadius);
        Circle icing3 = new Circle(x + width - icingRadius, y + height/2, icingRadius);

        CubicCurve2D.Double loop1 = new CubicCurve2D.Double(x, y, x+width/4, y+10, x+width/4, y+10, x+width/2, y);
        CubicCurve2D.Double loop2 = new CubicCurve2D.Double(x + width/2, y, x + 3*width/4, y+10, x + 3*width/4, y + 10, x + width, y);

        GeneralPath cakePath = this.get();
        cakePath.append(loop1, false);
        cakePath.append(loop2, false);
        cakePath.append(cakeRect, false);
        cakePath.append(icing1, false);
        cakePath.append(icing2, false);
        cakePath.append(icing3, false);
    }
}
