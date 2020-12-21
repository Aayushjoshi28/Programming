import java.util.Scanner;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws Exception
	{
		int n,sum=0,d;
		DataInputStream din=new DataInputStream(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number to print in words:");
	  int n = sc.nextInt();
	  while(n>0)
	  {
   		d=n%10;
	    sum=sum*10 + d;
	    n=n/10;
    }
	  n=sum;
	  while(n>0)
	  {
	  	d=n%10;
	    switch(d)
	    {
				case 0:
  			System.out.println("Zero");
        break;
        case 1:
				System.out.println("One");
        break;
        case 2:
        System.out.println("Two");
        break;
        case 3:
        System.out.println("Three");
        break;
        case 4:
        System.out.println("Four");
        break;
        case 5:
        System.out.println("Five");
        break;
        case 6:
        System.out.println("Six");
        break;
        case 7:
        System.out.println("Seven");
        break;
        case 8:
        System.out.println("Eight");
        break;
        case 9:
        System.out.println("Nine");
        break;
        default:
        System.out.print("invalid input");
	    }
	    n=n/10
		}
	}
}
