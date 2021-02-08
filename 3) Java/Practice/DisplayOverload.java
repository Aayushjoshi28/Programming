/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-09-25T14:07:41+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: DisplayOverload.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-01T22:04:27+05:30
 */



import java.util.Scanner;

class OverloadingDisplay {
        void display(int a){
            System.out.println("The user entered a Integer");
            System.out.println("The Integer entered by user is:"+" "+a);
    }

        void display(String a){
            System.out.println("The user entered a String");
            System.out.println("The String entered by user is:"+" "+a);
    }
        void display(float a){
            System.out.println("The user entered a Decimal");
            System.out.println("The Decimal entered by user is:"+" "+a);
    }

}
class DisplayOverload
{
    public static void main(String args[])
    {
        OverloadingDisplay ob = new OverloadingDisplay();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer:"+" ");
        int num = sc.nextInt();
        ob.display(num);
        System.out.print("Enter a Decimal:"+" ");
        float fnum = sc.nextFloat();
        ob.display(fnum);
        System.out.print("Enter a String:"+" ");
        String str = sc.next();
        ob.display(str);
    }
}
