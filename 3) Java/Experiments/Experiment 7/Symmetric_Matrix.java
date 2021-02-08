/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Symmetric_Matrix.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:28:26+05:30
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Symmetric_Matrix 
{
	public static void main(String args[])throws IOException
	{
		// create buffer class object.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// enter how many elements you have to enter.
		System.out.print("Enter the value of m for m x m matrix: ");
		int m=Integer.parseInt(br.readLine());
		int A[][]=new int[m][m];
		int elements = m*m;
		// Check for rows and column.
		if(m>2 && m<10)
		{
			// enter the elements here.
			System.out.println("\nInput the"+" "+elements+" "+"elements of the Matrix :");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print("Enter the elements : ");
					A[i][j]=Integer.parseInt(br.readLine());
				}
			}

			// here the original matrix.
			System.out.println("\nThe Original Matrix is : ");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(A[i][j]+"\t");
				}
				System.out.println();
			}

			// check weather matrix is symmetric or not.
			int flag = 0;
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(A[i][j] != A[j][i])
					{
						// When elements do not matched.
						flag = 1;
						break;
					}
				}
			}
			// check for symmetric or not.
			if(flag == 1)
				System.out.println("\nThe given Matrix is Not Symmetric");
			else
				System.out.println("\nThe given Matrix is Symmetric");
		}
		else
		System.out.println("The Matrix Size is Out Of Range....");
	}
}
