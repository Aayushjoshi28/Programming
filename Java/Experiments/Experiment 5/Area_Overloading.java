/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Area_Overloading.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:27:44+05:30
 */


import java.util.Scanner;
class Overloadarea
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Area_Overloading
{
     public static void main(String args[])
	{

       Overloadarea ob = new Overloadarea();
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the side of square:");
       float side = sc.nextFloat();
       ob.area(side);
       System.out.print("Enter the length and Breadth of rectangle:");
       float length = sc.nextFloat();
       float breadth = sc.nextFloat();
	   ob.area(length,breadth);
       System.out.print("Enter the radius of circle:");
       double radius = sc.nextDouble();
	   ob.area(radius);
    }
}
