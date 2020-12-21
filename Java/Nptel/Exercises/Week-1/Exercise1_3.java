import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   int sum=0;
//Use for or while loop do the operation
	   int twice = 2*n;
	   int i = 0;
	   while(i<=twice)
       {
         if((i%3==0))
         {
             sum = sum + i;
         }
         i = i + 2;
       }
	   System.out.print(sum);
	}
}