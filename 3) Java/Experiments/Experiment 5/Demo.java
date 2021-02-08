/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-17T10:37:50+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Demo.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-01T22:13:51+05:30
 */

import java.util.*;
class Player
{
    Scanner s = new Scanner(System.in);
    String pname,tname;
    int ba;
    void accept()
    {
        System.out.println("Enter Name Of the Player:");
        pname =s.nextLine();
        System.out.println("Enter Name Of the Team:");
        tname =s.nextLine();
        System.out.println("Enter BATTING SCORE :");
        ba=s.nextInt();
    }
    void display()
    {
        System.out.println(pname+" "+tname+" "+ba);
    }
}

class Demo
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of players :");
        int n = s.nextInt();
        Player p[] = new Player[n];
        System.out.println("Enter The details of Player:");
        for(int i=0;i<n;i++)
        {
            p[i] = new Player();
            p[i].accept();
        }
        System.out.println("List Of Players:\n");
        sort(p,n);
        System.out.println("Sorted List(according to Batting avg.)");
        for(int i=0;i<n;i++)
        {
            p[i].display();
        }
    }

    static void sort(Player p[],int n)
    {
        Player temp = new Player();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(p[i].ba>p[j].ba)
                {
                    temp=p[i];
                    p[i]=p[j];
                    p[j]=temp;
                }
            }
        }
    }
}
