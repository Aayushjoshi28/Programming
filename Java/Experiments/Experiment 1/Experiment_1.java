/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Experiment_1.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:06:36+05:30
 */

//Java program to print prime numbers between n1 and n2
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Experiment_1
{
	public static void main(String[] args)
	{
		List<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n1 and n2:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if ((n1 >= 2 && n2 <= 100) && (n2-n1 >= 35))
		{
		    int count;
		    //loop for finding and printing all prime numbers between n1 and n2
		    for(int i = n1 ; i <= n2 ; i++)
		    {
			    //checking number is prime or not
			    count = 0;
			    for(int j = 1 ; j <= i ; j++)
			    {
			    	if(i % j == 0)
					    count = count+1;
		    	}
			    if(count == 2)
			        list.add(i);
		    }
		    int itemCount = list.size();
		    int Min = findMin(list);
		    int Max = findMax(list);
            System.out.println("\nLast number of a fibonacci series:" + findNthNumber(Min, Max, itemCount));
		}
		else
		{
		    System.out.println("\nWrong Input\nThe Constraints are:\n2<=n1,n2<=100\nn2-n1>=35\nInput w.r.t the constraints");
		}
		sc.close();
	}
	// function to find minimum value in an unsorted list in Java using Collection
    public static Integer findMin(List<Integer> list)
    {

        // check list is empty or not
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }

        // create a new list to avoid modification in the original list
        List<Integer> sortedlist = new ArrayList<>(list);

        // sort list in natural order
        Collections.sort(sortedlist);

        // first element in the sorted list would be minimum
        return sortedlist.get(0);
    }

    // function return maximum value in an unsorted list in Java using Collection
    public static Integer findMax(List<Integer> list)
    {

        // check list is empty or not
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }

        // create a new list to avoid modification in the original list
        List<Integer> sortedlist = new ArrayList<>(list);

        // sort list in natural order
        Collections.sort(sortedlist);

        // last element in the sorted list would be maximum
        return sortedlist.get(sortedlist.size() - 1);
    }
    // Function to return the Nth number of the modified Fibonacci series where A and B are the first two terms
    static int findNthNumber(int A, int B, int N)
    {

        // To store the current element which is the sum of previous two elements of the series
        int sum = 0;

        // This loop will terminate when the Nth element is found
        for (int i = 2; i < N; i++)
        {
            sum = A + B;

            A = B;

            B = sum;
        }

        // Return the Nth element
        return sum;
    }


}
