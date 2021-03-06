/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T14:53:37+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Constructor_Overloading_Circle_With_this.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T14:58:10+05:30
 */

 class Circle {
   double x,y;
   double r;
 //"this" syntax should appear only as the first statement in a Constructor
 //The Constructor where we passed three values
   Circle (double x,double y,double r) {
     this.x = x;
     this.y = y;
     this.r = r;
   }
 //The Constructor where we passed only radius and the co-ordinates are pre inputed
   Circle (double r) {
     this(0.0,0.0,r);
   }
 //The Constructor where we passed one of the circle
   Circle (Circle c) {
     this(c.x,c.y,c.r);
   }
 //The Constructor where all the values are pre inputed
   Circle () {
     this(0.0,0.0,1.0);
   }

   double circumference() {
     return 2*3.14159*r;
   }
   double area() {
     return (22/7)*r*r;
   }
 }

 class Constructor_Overloading_Circle_With_this {
   public static void main(String args[]) {
     Circle c1 = new Circle(3.0,4.0,5.0);
     Circle c2 = new Circle(6.0);
     Circle c3 = new Circle(c1);
     Circle c4 = new Circle();
     System.out.println("Circumference Circle 1"+" "+c1.circumference());
     System.out.println("Area Circle 1"+" "+c1.area());
     System.out.println();
     System.out.println("Circumference Circle 2"+" "+c2.circumference());
     System.out.println("Area Circle 2"+" "+c2.area());
     System.out.println();
     System.out.println("Circumference Circle 3"+" "+c3.circumference());
     System.out.println("Area Circle 3"+" "+c3.area());
     System.out.println();
     System.out.println("Circumference Circle 4"+" "+c4.circumference());
     System.out.println("Area Circle 4"+" "+c4.area());
   }
 }
