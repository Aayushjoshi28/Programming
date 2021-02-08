import java.util.Scanner;  
import java.lang.*;  
abstract class Shape  {  
    float pi=3.14f;  
    abstract void area();  
    Double area;  
} 

class Circle extends Shape  {  
    Double radius;  
    Circle()  {  
 	    Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the radius of circle : ");   	
        radius = sc.nextDouble();  
    }  
    void area()  {  
 	    area=Math.PI*radius*radius;  
        System.out.print("Area of circle is : " +area);  
    }  
}  
 
class Rectangle extends Shape  
{  
    Double length,breadth;  
    Rectangle()  
    {  
 	    Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the lenght and breadth of rectangle : ");          
        length = sc.nextDouble();  
 	    breadth = sc.nextDouble();  
    }  
    void area()  {  
 	    area= length*breadth;  
        System.out.print("Area of Rectangle is : " +area);  
    }  
}  
  
class Triangle extends Shape  
{  
    Double base,height;  
    Triangle()  {  
 	    Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the base and height of Triangle : ");   	
        base = sc.nextDouble();   	
        height = sc.nextDouble();  
    }  
    void area()  {  
 	    area= 0.5*base*height;  
        System.out.print("Area of Triangle is : " +area);  
    }  
}  
  
public class Main  {  
    public static void main(String args[])  {  
 	int choice;  
 	Scanner sc=new Scanner(System.in);          
 	System.out.println("1.Circle\n2.Rectangle\n3.Triangle  ");          
 	System.out.println("Enter your choice : ");   
 	choice=sc.nextInt();  
    System.out.println("...................................");  
 	switch(choice)  {  
 	    case 1: System.out.println("Area of Circle: ");   	
 	            Circle c = new Circle();  
                c.area();  
                System.out.print("\n.................................\n");  
 	            break;  
 	    case 2: System.out.println("Area of Rectange : ");   	
 	            Rectangle r=new Rectangle();  
                r.area();  
                System.out.print("\n.................................\n");  
 	            break;  
 	    case 3: System.out.println("Area of triangle: ");   	
 	            Triangle t=new Triangle();  
                t.area();  
                System.out.println("\n.................................\n");  
 	            break;  
 	    default: System.out.println("Invalid choice");  
    }  
  }  
}  
