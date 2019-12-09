/*<applet code="box" width="700" height="800"></applet>*/
import java.awt.*;
import java.applet.*;
public class box extends Applet
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
 
     g.drawLine(100,100,100,300);
   g.drawLine(100,300,300,300);
    g.drawLine(300,300,300,100);
   g.drawLine(300,100,100,100);
 
   }
public void stop()
  {
  msg="stopped";
   }


 

}
