/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T06:58:37+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: for_loop_with_continue.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T07:04:34+05:30
 */
class for_loop_with_continue  {
  public static void main(String[] args)  {
    for(int i=0; i<10 ; i++)  {
      System.out.print(i + " ");
      if(i%2==0) continue;
      System.out.println(" ");
    }
  }
}
