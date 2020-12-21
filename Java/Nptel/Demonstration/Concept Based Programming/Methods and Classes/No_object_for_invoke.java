/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-05T11:09:52+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: No_object_for_invoke.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-05T11:13:14+05:30
 */
class A {
  A() {
    this(5);
    System.out.println("hello a");
  }
  A(int x) {
    System.out.println(x);
  }
}

class No_object_for_invoke {
  public static void main(String args[]) {
    A a = new A();
  }
}
