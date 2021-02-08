import java.applet.Applet;
import java.awt.Graphics; 
public class Home extends Applet  {  
  public void paint(Graphics g)  {    		
      int x[]={100,150,200};   		
      int y[]={150,20,150};  
      g.drawPolygon(x,y,3);  
      g.drawRect(100,150,100,150);  
      g.drawRect(200,150,200,150);  
      g.drawRect(130,180,40,120);  
      g.drawLine(400,150,400,20);  
      g.drawLine(150,20,400,20);  
      g.drawOval(260,180, 80,80);  
      g.drawString("Harsh Shah",250,100);  
  }  
}  
