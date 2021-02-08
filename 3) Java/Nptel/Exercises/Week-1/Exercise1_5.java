import java.util.Scanner;
public class Exercise1_5{
    public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
      //define size of array
        s = input.nextInt();
     //The array is defined "arr" and inserted marks into it of integer type.
        int[] arr = new int[s];   
      
	       for(i=0;i<arr.length;i++)
	       {
        	  arr[i]=input.nextInt();
	       }
         int max = 0;
         result = arr[0]; 
      for(i=0;i<arr.length;i++)
      {
        if(max<=arr[i])
        {
          result = arr[i];
        }
        max = max + arr[i];  
      }
      System.out.println(result);
      mark_avg = max/s;
      System.out.println(mark_avg);
  }
}