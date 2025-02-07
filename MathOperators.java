/**
 * The MathOperators program implements an application that
 * performs basic math operations including addition, subtraction,
 * multiplication, division, exponents, and square roots.
 *
 * <p>This class demonstrates proper JavaDoc formatting and usage of
 * various math operations.</p>
 *
 * @author Val I
 * @version 1.0
 * @since 2025-02-06
 */
public final class MathOperators {

    /**
     * This is a private constructor to satisfy style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method that performs various math operations.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        // Addition
        System.out.println("4 + 2 =" + (4.0 + 2.0));
        // Subtraction
        System.out.println("10 - 3 = " + (10.0 - 3.0));
        // Multiplication
        System.out.println("3 * 5 = " + (3.0 * 5.0));
        // Division with integers
        System.out.println("9 / 3 = " + (9 / 3));
        // Division with floats
        System.out.println("2 / 3 = " + (2.0f / 3.0f));
        // Division with double
        System.out.println("2 / 3" + (2.0 / 3.0));
        // Exponents to 2
        System.out.println("2^2 = " + Math.pow(2.0, 2));
        // Exponents to 3
        System.out.println("2^3 = " + Math.pow(2.0, 3));
        // Square Root
        System.out.println("√16 = " + Math.sqrt(16.0));
    }
}
