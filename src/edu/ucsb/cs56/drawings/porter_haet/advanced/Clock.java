package edu.ucsb.cs56.drawings.porter_haet.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

/**
 A Clock (wrapper around a General Path, implements Shape)

 This represents a basic clock.

 @author Porter Haet
 @version for CS56, F17, UCSB

 */
public class Clock extends GeneralPathWrapper implements Shape {

    /**
     * The Clock constructor, creates a new clock at (x, y), with width and height
     * @param x The x coordinate
     * @param y The y coordinate
     * @param width The width
     * @param height The height
     */
    public Clock(double x, double y, double width, double height) {

        GeneralPath clock = new GeneralPath();
        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, width, height);

        clock.append(ellipse2D, false);

        double rnW = width/10;
        double rnH = height/10;
        for (int i = 1; i <= 12; i++) {
            double radians = i * (2*Math.PI) / 12;

            double rnX = (x + width/2) + width*Math.sin(radians)*.4;
            double rnY = (y + height/2) - width*Math.cos(radians)*.4;
            Shape s = new RomanNumeralNumber(i, rnX - rnW/2, rnY - rnH/2, rnW, rnH);

            clock.append(s, false);
        }

        

        this.set(clock);

    }
}
