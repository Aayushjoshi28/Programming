/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-05T11:04:06+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: invoke_class.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-05T11:08:34+05:30
 */
class A {
  void m() {
    System.out.println("hello m");
  }
  void n() {
    System.out.println("hello n");
    this.m();
  }
}

class invoke_class {
  public static void main(String args[]) {
    A a = new A();
    a.n();
  }
}
