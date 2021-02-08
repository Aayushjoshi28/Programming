/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: hotel_info.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:25:33+05:30
 */



import java.util.*;
class Hotel
{
    Scanner s = new Scanner(System.in);
    String honame,ciname;
    int rc;
    void accept()
    {
        System.out.println("Enter Name Of the Hotel:");
        honame = s.nextLine();
        System.out.println("Enter Name Of the City:");
        ciname = s.nextLine();
        System.out.println("Enter the Room Charge :");
        rc=s.nextInt();
    }
    void display()
    {
        System.out.println(honame+" "+ciname+" "+rc);
    }
}

class hotel_info
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Hotels :");
        int n = s.nextInt();
        Hotel p[] = new Hotel[n];
        System.out.println("Enter The details of Hotels:");
        for(int i=0;i<n;i++)
        {
            p[i] = new Hotel();
            p[i].accept();
        }
        System.out.println("List Of Hotels:\n");
        sort(p,n);
        System.out.println("Sorted List(according to Room Charge.)");
        for(int i=0;i<n;i++)
        {
            p[i].display();
        }
    }

    static void sort(Hotel p[],int n)
    {
        Hotel temp = new Hotel();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(p[i].rc>p[j].rc)
                {
                    temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
    }
}
