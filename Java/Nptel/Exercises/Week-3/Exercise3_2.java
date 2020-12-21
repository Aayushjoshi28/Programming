/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-22T23:36:58+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Exercise3_2.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-15T07:23:00+05:30
 */
 import java.util.Scanner;

  public class Circle extends Point{

      public static void main(String[] args) {

 	 Scanner sc = new Scanner(System.in);
 	 Point c=new Point(); //Create a point center
 	 c.x=sc.nextDouble();
 	 c.y=sc.nextDouble();
 	 Point p=new Point();  //Create a point on circumference
 	 p.x=sc.nextDouble();
 	 p.y=sc.nextDouble();
 	 Circle c1=new Circle(); //Create an object of class Circle
 	 c1.distance(c,p);  //Calcualte radius of the circle

   }

 }

 //Complete the code segment to define a class Point with variable x,y and method distance() that calculates the distance between two points.
 //Note: Pass objects of type class Point as argument in distance() method.
 class Point {
   double x;
   double y;

   void distance(Point p1, Point p2) {
     double dist = Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
     System.out.print(dist);
   }
 }
