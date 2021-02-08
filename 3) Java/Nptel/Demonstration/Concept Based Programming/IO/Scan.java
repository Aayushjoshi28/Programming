/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-12T22:44:33+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Scan.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-12T22:47:36+05:30
 */
import java.util.Scanner;

class Scan {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      if(a>b) {
        System.out.printf("Between %d and %d, maximum is %d \n",a,b,a);
      }
      else  {
        System.out.printf("Between %d and %d, maximum is %d \n",a,b,b);
      }
  }
}
