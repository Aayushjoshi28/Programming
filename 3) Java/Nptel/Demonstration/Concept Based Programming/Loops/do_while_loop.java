/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T06:42:52+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: do_while.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T06:52:37+05:30
 */
class do_while_loop  {
  public static void main(String[] args)  {
    int count = 1;
    System.out.println("Printing First 10 odd numbers");
    do  {
      System.out.print(" "+ 2*count);
      count++;
    } while(count<11);
  }
}
