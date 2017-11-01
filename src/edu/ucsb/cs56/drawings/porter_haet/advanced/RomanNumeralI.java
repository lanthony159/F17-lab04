package edu.ucsb.cs56.drawings.porter_haet.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class RomanNumeralI extends RomanNumeral {

    protected RomanNumeralI(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    protected GeneralPath getGeneralPath() {
        GeneralPath I = new GeneralPath();

        double x1 = x + width/2;
        double y1 = y;
        double x2 = x1;
        double y2 = y + height;
        Line2D line = new Line2D.Double(x1, y1, x2, y2);

        I.append(line, false);

        return I;
    }
}
