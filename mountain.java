/*<applet code="mountain" width="2000" height="900"></applet>*/
import java.awt.*;
import java.applet.*;
public class mountain extends Applet
{
String msg;
   public void init()
  {
  msg="initialization";
 setBackground(Color.orange);
 
   }
 public void start()
  {
  msg="started";
   }
  public void paint(Graphics g)
  {
    
    g.setColor(Color.black);
  g.drawLine(100,400,400,100);
    g.drawLine(400,100,700,400);
    g.drawLine(500,400,800,100);
    g.drawLine(800,100,1100,400);
     
   g.setColor(Color.blue);
   g.drawArc(400,40,90,30,45,90);
   g.drawOval(1100,600,500,200);
   g.drawOval(1200,700,80,30);
   g.drawLine(1300,800,1100,600);


  
   }
public void stop()
  {
  msg="stopped";
   }


 

}
