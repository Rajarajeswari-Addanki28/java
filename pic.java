/*<applet code="pic" width="1000" height="1000"></applet>*/
import java.awt.*;
import java.applet.*;
public class pic extends Applet
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
    
  
  
     
     g.drawLine(0,0,700,0);
   
    g.drawLine(700,0,700,500);
    g.drawLine(0,500,700,500);
      g.drawLine(0,0,0,500);

g.setColor(Color.red);
  g.drawLine(200,100,500,100);
    g.drawLine(500,100,500,400);
    g.drawLine(500,400,200,400);
    g.drawLine(200,100,200,400);


  g.setColor(Color.blue);
     g.drawOval(200,100,300,300);


   g.setColor(Color.white);
  g.drawOval(139,38,423,423);
g.setColor(Color.yellow);
     g.drawLine(350,250,700,0);
     g.drawLine(350,250,700,500);
     g.drawLine(350,250,0,500);
     g.drawLine(350,250,0,0);
   }
public void stop()
  {
  msg="stopped";
   }


 

}
