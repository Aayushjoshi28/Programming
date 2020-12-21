/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T12:21:18+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Multi_class_Shapes.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T12:35:39+05:30
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

class Box {
  double width;
  double height;
  double depth;

  double area() {
    double a;
    a = ((width*height) + (height*depth) + (width*depth));
    return a;
  }

  double volume() {
    double v;
    v = width*height*depth;
    return v;
  }
}

class Multi_Class_Shapes {
  public static void main(String args[]) {
    Circle c = new Circle();
    Box b = new Box();
    //Intialize the circle
    c.x = 3.0;
    c.y = 4.0;
    c.r = 5.0;
    //Intialize the Box
    b.width = 3.0;
    b.height = 4.0;
    b.depth = 5.0;
    System.out.println("Circumference Of Circle:"+" "+c.circumference());
    System.out.println("Area of Circle:"+" "+c.area());
    System.out.println("Area of Box:"+" "+b.area());
    System.out.println("Volume of Box:"+" "+b.volume());
  }
}
