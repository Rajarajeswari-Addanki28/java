/*<applet code="drawline" width="700" height="800"></applet>*/
import java.awt.*;
import java.applet.*;
public class drawline extends Applet
{
String msg;
   public void init()
  {
  msg="initialization";
 setBackground(Color.green);
 setForeground(Color.red);
   }
 public void start()
  {
  msg="started";
   }
  public void paint(Graphics g)
  {
    
   g.drawString("hello",100,200);
  g.setColor(Color.black);
    g.drawLine(150,200,50,250);
  g.setColor(Color.blue);
     g.drawLine(150,200,250,300);
  g.setColor(Color.white);
   g.drawLine(150,200,270,50);
   g.setColor(Color.pink);
    g.drawLine(150,200,0,0);
 
   }
public void stop()
  {
  msg="stopped";
   }


 

}
