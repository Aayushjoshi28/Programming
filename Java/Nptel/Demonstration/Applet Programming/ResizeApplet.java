/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-03T23:02:05+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Demo3.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-03T23:16:03+05:30
 */
 import java.applet.Applet;
 import java.awt.Graphics;

 public class ResizeApplet extends Applet{
  public void init() {
        /*
        *To resize an apple window use
        *void resize(int x,int y) method for applet class.
        */
        resize(300,300);
  }
 	public void paint(Graphics g){
 		g.drawString("Window resized to 300,300",50,50);
 	}
 }
