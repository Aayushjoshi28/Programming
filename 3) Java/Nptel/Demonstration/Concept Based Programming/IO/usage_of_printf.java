/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-12T07:42:19+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: usage_of_printf.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-12T08:02:17+05:30
 */
import java.util.*;
class usage_of_printf {
  public static void main(String[] args)  {
    int x = 100;
    System.out.printf("Printing simple integer: x = %d\n",x);

    //this will print upto 2 decimal places
    System.out.printf("Formatted with precison: PI = %.2f\n",Math.PI);

    float n = 5.2f;
    //automatically appends zero to the rightmost part of decimal
    System.out.printf("Formatted to specific width: n = %.4f\n",n);

    float m = 2324435.3f;
    //here number is Formatted from right margin and occupies width of 2- characters
    System.out.printf("Formatted to right margin: m = %20.4f\n",m);
  }
}
