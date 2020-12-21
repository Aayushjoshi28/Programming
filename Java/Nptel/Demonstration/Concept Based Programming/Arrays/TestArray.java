import java.util.Scanner;
class TestArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value"+" "+(i+1)+":"+" ");
			a[i] = sc.nextInt();

		}
		float sum = 0,avg;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		avg = sum/a.length;
		System.out.println("Average =" + avg);
	}
}