package edu.ucsb.cs56.drawings.porter_haet.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.GeneralPath;

public abstract class RomanNumeral extends GeneralPathWrapper implements Shape {

    double x, y, width, height;

    RomanNumeral(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.set(getGeneralPath());
    }

    protected abstract GeneralPath getGeneralPath();
}
