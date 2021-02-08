import java.util.Scanner;
import java.applet.Applet;
import java.awt.Graphics;

public class Sum extends Applet{
	public void paint(Graphics g){
		g.drawString("Summation of two numbers",100,100);
		int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        g.drawString("Enter The First Number",100,115);
        num1 = sc.nextInt();
		g.drawString("The First Number is:"+" "+num1,100,130);
        g.drawString("Enter The Second Number: ",100,145);
        num2 = sc.nextInt();
        g.drawString("The Second Number is:"+" "+num2,100,160);
        sum = num1 + num2;
        g.drawString("Summation is:"+" "+sum,100,175);
	}
}
