/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-05T11:59:50+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Square_root.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-05T12:56:53+05:30
 */

import java.lang.*; //Math class is defined in this package
class Calculator {
  Calculator(double i) {
      double x = (double)Math.sqrt(i);
      System.out.println("Square root of"+" "+i+" "+"is"+" "+x);
  }
}

class Square_root {
  public static void main(String[] args) {
    Calculator a = new Calculator(4.0);
  }
}
