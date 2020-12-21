/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-03T23:07:41+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: Demo4.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-03T23:24:00+05:30
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BackgrndColor extends Applet {
  public void init() {
    //Here we change the default grey color background of
    //applet to yellow background
    setBackground(Color.YELLOW);
    resize(500,500);
  }

  public void paint(Graphics g) {
    g.drawString("Applet background Change Example",0,50);
  }
}
