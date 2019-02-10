package lab.polymorphism;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A few simple experiments with our utilities. Version 1.1 of February 2019.
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    for (Float i = Float.valueOf(2); i < 10; i++) {
      double root = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    BigInteger a = BigInteger.ONE;
    double root = MathUtils.squareRoot(a);
    pen.println("The square root of " + a + " seems to be " + root);
    pen.println(root + "^2 = " + (root * root));
    // for i

    BigDecimal b = BigDecimal.TEN;
    double root1 = MathUtils.squareRoot(b);
    pen.println("The square root of " + b + " seems to be " + root1);
    pen.println(root1 + "^2 = " + (root1 * root1));
    // for i
    
    for (double i = 2; i < 10; i++) {
      double root3 = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root3);
      pen.println(root3 + "^2 = " + (root3 * root3));
    } // for i

    for (Double i = Double.valueOf(2); i < 10; i++) {
      double root3 = MathUtils.squareRoot(i);
      pen.println("The square root of " + i + " seems to be " + root3);
      pen.println(root3 + "^2 = " + (root3 * root3));
    } // for i
    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
