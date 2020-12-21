/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:54+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise3_1.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T07:22:31+05:30
 */
 import java.util.Scanner; //This package for reading input
 public class Fibonacci {

     public static void main(String args[]) {
 	 Scanner sc = new Scanner(System.in);
 	 int n=sc.nextInt(); //Read an integer
         System.out.println(fib(n)); //Generate and print the n-th Fibonacci
                                      //number
     }
  static int fib(int n) {

 	if(n==1)
       return 0;
 	else if(n==2)
       return 1;
     return fib(n-1)+fib(n-2);
  }
 }
