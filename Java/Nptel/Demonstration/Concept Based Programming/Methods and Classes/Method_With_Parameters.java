/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T12:39:27+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Method_With_Parameters.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T13:55:56+05:30
 */

class Circle {
  double x,y; //The co ordinates of the center
  double r; //The radius

  //Method that returns the circumference
  double circumference() {
    return 2*3.14159*r;
  }
  //Method that returns area
  double area() {
    return (22/7)*r*r;
  }
  void setCircle(double a,double b,double c) {
    x = a; //set center x-coordinate
    y = b; //set center y-coordinate
    r = c; //set radius
  }
}

//The following class declare an object of type Circle
class Method_With_Parameters {
  public static void main(String args[]) {
    Circle c1 = new Circle();
    Circle c2 = new Circle();
    //Intialize the circles
    c1.setCircle(5.0,4.0,3.0);
    c2.setCircle(6.0,5.0,2.0);
    System.out.println("Circumference circle 1:"+" "+c1.circumference());
    System.out.println("Area circle 1:"+" "+c1.area());
    System.out.println("Circumference circle 2:"+" "+c2.circumference());
    System.out.println("Area circle 2:"+" "+c2.area());
  }
}
