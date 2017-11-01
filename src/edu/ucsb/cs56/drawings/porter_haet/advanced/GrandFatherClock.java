package edu.ucsb.cs56.drawings.porter_haet.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

public class GrandFatherClock extends Clock {

    /**
     * The GrandFatherClock constructor, creates a new clock at (x, y), with width and height
     *
     * @param x      The x coordinate
     * @param y      The y coordinate
     * @param width  The width
     * @param height The height
     * @param hour   The hour on the clock
     * @param minute The minute on the clock
     */
    public GrandFatherClock(double x, double y, double width, double height, int hour, int minute) {
        super(x + width/4, y + height/8, width/2, height/4, hour, minute);

        GeneralPath path = this.get();

        Rectangle2D body = new Rectangle2D.Double(x, y, width, height);

        path.append(body, false);

        this.set(path);


    }
}
