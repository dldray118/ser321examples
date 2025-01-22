import java.io.*;

/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

    private int numerator, denominator;

    public Fraction() {
        numerator = 1;  // Default value
        denominator = 1;  // Default value
    }

    public void print() {
        System.out.print(numerator + "/" + denominator);
    }

    public void setNumerator(int n) {
        numerator = n;
    }

    public void setDenominator(int d) {
        denominator = d;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public static void main(String[] args) {
        Fraction fraction = new Fraction();

        try {
            if (args.length >= 2) {
                fraction.setNumerator(Integer.parseInt(args[0]));
                fraction.setDenominator(Integer.parseInt(args[1]));
            } else if (args.length == 1) {
                fraction.setNumerator(Integer.parseInt(args[0]));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid argument(s). Using default values: numerator=1, denominator=1");
        }

        if (fraction.getDenominator() == 0) {
            System.out.println("Denominator cannot be zero.");
        } else {
            System.out.print("Fraction: ");
            fraction.print();
            System.out.println();
        }
    }
    
}

