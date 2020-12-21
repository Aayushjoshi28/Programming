/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-03T23:27:05+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Printing_Input.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-03T23:32:39+05:30
 */

 import java.applet.Applet;
 import java.awt.Graphics;

 public class Printing_Input extends Applet{
 	public void paint(Graphics g){

    int x = 0;
    int y = 0;
    String msg = "";

    x = Integer.parseInt(getParameter("xPosition"));
    y = Integer.parseInt(getParameter("yPosition"));
    msg = getParameter("msg");

 		g.drawString(msg, x, y);
 	}
 }
