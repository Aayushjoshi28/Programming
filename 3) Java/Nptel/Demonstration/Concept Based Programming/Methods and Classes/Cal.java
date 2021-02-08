/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-05T12:24:02+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Cal.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-05T12:31:03+05:30
 */
 import java.lang.*; //Math class is defined in this package
 import java.util.Scanner;
 class Cal {
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the no:");
     double x = sc.nextDouble();
     System.out.println("The Square root is:"+" "+Math.sqrt(x));
   }
 }
