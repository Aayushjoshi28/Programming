/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T07:06:24+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: for_loop_with_break.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T07:09:37+05:30
 */

class for_loop_with_break {
  public static void main(String[] args)  {
    for( int i=1;i<11;i++)  {
      if(i%10==0) break;
      System.out.println("i:"+i);
    }
    System.out.println("loop complete.");
  }
}
