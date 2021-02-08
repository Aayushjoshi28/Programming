package org.calculator;  
import java.util.*;  
class ArithmeticClass  
{  
 	int result;   	//Method for addition   	int add(int num1, int num2)  
 	{  
 	result = num1+num2;   	return result;  
 	}  
 	//Method for subtraction   	int subtract(int num1, int num2)  
 	{  
 	result = num1-num2;   	return result;  
 	}  
 	//Method for multiplication   	int multiply(int num1, int num2)  
 	{  
 	result = num1*num2;   	return result;  
 	}  
 	//Method for division   	float divide(int num1, int num2)  
 	{  
 	result = num1/num2;   	return result;  
 	}  
 	 
 	//Method for mod  
 	float mod(int num1, int num2)  
 	{  
 	result = num1%num2;   	return result;  
 	 
 	} 	 
}  
class PowerClass   
{  
    int result;  
 	//Method for square   	int square(int num1)  
 	{  
 	result = num1*num1;   	return result;  
 	}  
 	//Method for cube   	int cube(int num1)  
 	{  
 	result = num1*num1*num1;   	return result;  
 	}  
}  
    
import org.calculator.*;  
import java.util.*;  
public class DemoClass  
{  
    public static void main(String[] args)  
{  
        ArithmeticClass ar = new ArithmeticClass();  
        PowerClass pc = new PowerClass();  
 	    Scanner sc=new Scanner(System.in);  
        System.out.println("Enter two numbers: ");   	
        int x=sc.nextInt();   	
        int y=sc.nextInt();  
        System.out.println("Addition: "+ar.add(x,y)); ;  
        System.out.println("Subtraction: "+ar.subtract(x,y));  
        System.out.println("Multiplication: "+ar.multiply(x,y));  
        System.out.println("Division: "+ar.divide(x,y));  
        System.out.println("modulus: "+ar.mod(x,y));          
        System.out.println("\nEnter a number: ");   	
        int c=sc.nextInt();  
        System.out.println("Square: "+pc.square(c));          
        System.out.println("Cube: "+pc.cube(c));  
    }  
}  
