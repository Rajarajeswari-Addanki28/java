/*<applet code="t_c" width="700" height="800"></applet>*/
import java.awt.*;
import java.applet.*;
public class t_c extends Applet
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
 showStatus("status");
 g.drawRoundRect(100,100,100,100,100,100);
g.fillRoundRect(100,100,100,100,100,100);
 
   }
public void stop()
  {
  msg="stopped";
   }
}
