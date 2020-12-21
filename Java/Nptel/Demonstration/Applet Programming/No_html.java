/**
 * @Author: Aayush Joshi SE4_14
 * @Date:   2020-10-04T11:18:25+05:30
 * @Email:  aayush.joshi_19@sakec.ac.in
 * @Project: Programming
 * @Filename: No_html.java
 * @Last modified by:   Aayush Joshi SE4_14
 * @Last modified time: 2020-10-04T11:25:19+05:30
 */

 // Simple Example of Applet with use of Appletviewer tool:
 import java.applet.Applet;
 import java.awt.Graphics;

 public class No_html extends Applet{
 	public void paint(Graphics g){
 		g.drawString("Hello world!",150,150);
 	}
 }

/*
 <applet code="No_html.class" width="300" height="300">
 </applet>
 */
