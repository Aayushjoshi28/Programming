import java.util.Scanner;
public class Exercise1_4 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        int result=0;
        int sum=0,remainder;
		int orin = n;
		while(orin != 0)
        {
          remainder = orin%10;
          sum += Math.pow(remainder,3);
          orin = orin/10;
        
        }
		
		if(sum == n)
        {
          result = 1;
          System.out.print(result);
        }
		else
        {
          System.out.print(result);
        }
    }
}