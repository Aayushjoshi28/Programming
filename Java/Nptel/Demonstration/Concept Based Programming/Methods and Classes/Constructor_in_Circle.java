/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T12:49:52+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Constructor_in_Circle.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T13:55:45+05:30
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
   //Constructor
   Circle(double x,double y,double z) {
     this.x = x; //set center x-coordinate
     this.y = y; //set center y-coordinate
     this.r = z; //set radius
   }
 }

 //The following class declare an object of type Circle
 class Constructor_in_Circle {
   public static void main(String args[]) {
     Circle c1 = new Circle(5.0,4.0,3.0);
     Circle c2 = new Circle(6.0,5.0,2.0);
     System.out.println("Circumference circle 1:"+" "+c1.circumference());
     System.out.println("Area circle 1:"+" "+c1.area());
     System.out.println("Circumference circle 2:"+" "+c2.circumference());
     System.out.println("Area circle 2:"+" "+c2.area());
   }
 }
