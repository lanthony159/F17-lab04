package edu.ucsb.cs56.drawings.porter_haet.advanced;

import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;

public class RomanNumeralX extends RomanNumeral {

    protected RomanNumeralX(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    protected GeneralPath getGeneralPath() {
        GeneralPath X = new GeneralPath();

        double x1 = x;
        double y1 = y;
        double x2 = x + width;
        double y2 = y + height;
        Line2D line = new Line2D.Double(x1, y1, x2, y2);

        X.append(line, false);

        x1 = x + width;
        y1 = y;
        x2 = x;
        y2 = y + height;
        line = new Line2D.Double(x1, y1, x2, y2);

        X.append(line, false);
        return X;
    }
}
