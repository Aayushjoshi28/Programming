/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-13T07:11:37+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Prime.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-13T07:24:38+05:30
 */

//input given from command prompt i.e java Prime 6

class Prime {
  public static void main(String args[])  {
    int num;
    boolean isPrime = true;
    num = Integer.parseInt(args[0]);
    for(int i=2; i<=num/2; i++) {
      if((num%i) == 0)  {
        isPrime = false;
        break;
      }
    }
    if(isPrime) {
      System.out.println("Prime");
    }
    else  {
      System.out.println("Not Prime");
    }
  }
}
