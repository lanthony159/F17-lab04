package edu.ucsb.cs56.drawings.porter_haet.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

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
     * @param hour The hour on the clock
     * @param minute The minute on the clock
     */
    public Clock(double x, double y, double width, double height, int hour, int minute) {

        GeneralPath clock = new GeneralPath();
        Ellipse2D ellipse2D = new Ellipse2D.Double(x, y, width, height);

        clock.append(ellipse2D, false);

        double centerX = x + width/2;
        double centerY = y + height/2;
        double rnW = width/10;
        double rnH = height/10;
        for (int i = 1; i <= 12; i++) {
            double radians = radians(i, 0);

            double rnX = centerX + width*Math.sin(radians)*.4;
            double rnY = centerY - width*Math.cos(radians)*.4;
            Shape s = new RomanNumeralNumber(i, rnX - rnW/2, rnY - rnH/2, rnW, rnH);

            clock.append(s, false);
        }

        double handX = centerX + width*Math.sin(radians(hour, minute)) * .2;
        double handY = centerY - height*Math.cos(radians(hour, minute)) * .2;
        Line2D hand = new Line2D.Double(centerX, centerY, handX, handY);
        clock.append(hand, false);


        handX = centerX + width*Math.sin(radians(minute)) * .35;
        handY = centerY - height*Math.cos(radians(minute)) * .35;
        hand = new Line2D.Double(centerX, centerY, handX, handY);
        clock.append(hand, false);
        this.set(clock);

    }


    private static double radians(int hour, int minute) {
        return hour * (2 * Math.PI) / 12 + radians(minute) / 60;
    }

    private static double radians(int minute) {
        return minute * (2*Math.PI) / 60;
    }
}
