/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T06:36:14+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: While.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T06:52:29+05:30
 */
class While_loop {
  public static void main(String[] args) {
      int count = 1;
      System.out.println("Printing First 10 odd numbers");
      while(count<11)  {
        System.out.println(" "+((2*count)-1));
        count++;
      }
  }
}
