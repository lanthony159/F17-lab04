package edu.ucsb.cs56.drawings.porter_haet.advanced;

import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.HashMap;
import java.util.Map;

public class RomanNumeralNumber extends GeneralPathWrapper implements Shape {

    public RomanNumeralNumber(int number, double x, double y, double w, double h) {
        GeneralPath numbers = new GeneralPath();

        String letters = getLetters(number);

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            double rw = w/letters.length();
            double rh = h;
            double rx = x + i*rw;
            double ry = y;
            if (letter == 'I') {
                numbers.append(new RomanNumeralI(rx, ry, rw, rh), false);
            }
            else if (letter == 'V') {
                numbers.append(new RomanNumeralV(rx, ry, rw, rh), false);
            }
            else if (letter == 'X') {
                numbers.append(new RomanNumeralX(rx, ry, rw, rh), false);
            }
            else {
                System.out.println("Unknown RomanNumeral character: " + letter);
            }
        }

        this.set(numbers);
    }


    private static String getLetters(int number) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Sorry no time for closed form solution
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "IIX");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(11, "XI");
        map.put(12, "XII");

        return map.getOrDefault(number, "");
    }
}
