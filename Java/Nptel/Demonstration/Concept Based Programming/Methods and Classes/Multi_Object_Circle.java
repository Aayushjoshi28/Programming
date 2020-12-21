/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T11:52:24+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Multi_Object_Circle.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T13:56:15+05:30
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
}

//The following class declare an object of type Circle
class Multi_Object_Circle {
  public static void main(String args[]) {
    Circle c1 = new Circle();
    Circle c2 = new Circle();
    //Intialize the circles
    c1.x = 5.0;
    c1.y = 6.0;
    c1.r = 10.0;
    c2.x = 16.0;
    c2.y = 18.0;
    c2.r = 9.0;
    System.out.println("Circumference circle 1:"+" "+c1.circumference());
    System.out.println("Area circle 1:"+" "+c1.area());
    System.out.println("Circumference circle 2:"+" "+c2.circumference());
    System.out.println("Area circle 2:"+" "+c2.area());
  }
}
