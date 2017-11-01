package edu.ucsb.cs56.drawings.porter_haet.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class RomanNumeralV extends RomanNumeral {

    protected RomanNumeralV(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    protected GeneralPath getGeneralPath() {
        GeneralPath V = new GeneralPath();

        double x1 = x;
        double y1 = y;
        double x2 = x + width/2;
        double y2 = y + height;
        Line2D line = new Line2D.Double(x1, y1, x2, y2);

        V.append(line, false);

        x1 = x2;
        y1 = y2;
        x2 = x + width;
        y2 = y;
        line = new Line2D.Double(x1, y1, x2, y2);

        V.append(line, false);

        return V;
    }
}
