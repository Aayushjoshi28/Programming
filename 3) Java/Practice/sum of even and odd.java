import java.util.Scanner;
public class Sum_Odd_Even
{
    public static void main(String[] args)
    {
        int n, sume = 0, sumo = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumo = sume + a[i];
            }
            else
            {
                sumo = sumo + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sume);
        System.out.println("Sum of Odd Numbers:"+sumo);
    }
}
