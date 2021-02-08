/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T15:04:22+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Main.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T15:24:19+05:30
 */



import java.util.*;
import java.lang.*;

class Complexnumber
{
    double real, img;

    void number(double r, double i)
    {
        this.real = r;
        this.img = i;
    }

    static Complexnumber sum(Complexnumber c1, Complexnumber c2)
    {
        Complexnumber temp = new Complexnumber();
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;
    }

}

class Complex_Addition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the complex number:");

        String cmp1[];
        double a1=0.0;
        double b1=0.0;

        System.out.print("Enter The first complex number:");
        String s1 = sc.nextLine();
        cmp1 = s1.split(" ");
        if(cmp1.length==0)
        {
            a1=0.0;
            b1=0.0;
        }
        else if (cmp1.length==1)
        {
            a1 = Double.parseDouble(cmp1[0]);
            b1 = Double.parseDouble(cmp1[0]);
        }
        else
        {
            a1 = Double.parseDouble(cmp1[0]);
            b1 = Double.parseDouble(cmp1[1]);
        }

        String cmp2[];
        double a2=0.0;
        double b2=0.0;

        System.out.print("Enter The Second complex number:");
        String s2 = sc.nextLine();
        cmp2 = s2.split(" ");
        if(cmp2.length==0)
        {
            a2=0.0;
            b2=0.0;
        }
        else if (cmp2.length==1)
        {
            a2 = Double.parseDouble(cmp2[0]);
            b2 = Double.parseDouble(cmp2[0]);

        }
        else
        {
            a2 = Double.parseDouble(cmp2[0]);
            b2 = Double.parseDouble(cmp2[1]);
        }

        Complexnumber c1 = new Complexnumber();
        c1.number(a1,b1);

        Complexnumber c2 = new Complexnumber();
        c2.number(a2,b2);

        Complexnumber temp = Complexnumber.sum(c1,c2);

        System.out.println("");
        System.out.println("c3 = c1 + c2 ");
        System.out.println("The Sum of two Complex number is:"+temp.real+"+"+temp.img+" i");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("c1 = c1 + c2");
        c1.real=temp.real;
        c1.img=temp.img;
        System.out.println("c1 ="+c1.real+"+"+c1.img+"i");
    }
}
