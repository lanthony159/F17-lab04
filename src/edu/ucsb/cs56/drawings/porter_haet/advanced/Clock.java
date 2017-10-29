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

        for (int i = 1; i <= 12; i++) {

        }

        this.set(clock);

    }
}
