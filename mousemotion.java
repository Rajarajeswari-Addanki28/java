/*<applet code="mousemotion" width="1000" height="1000" ></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mousemotion extends Applet implements MouseMotionListener
{
 String msg="HELLO";
  int x=100,y=200;
   int p1,p2;
  public void init()
{
   addMouseMotionListener(this);
  
}
 
public void mouseDragged(MouseEvent ob)
{
   msg="mouse dragged";
   x=350;
   y=600;
 p1=ob.getX();
   p2=ob.getY();
   repaint();
    }
public void mouseMoved(MouseEvent ob)
{
   msg="mouse moved";
   x=700;
   y=200;
 p1=ob.getX();
   p2=ob.getY();
   repaint();
    }
   public void paint(Graphics g)
{
    g.drawString(msg,x,y);
    showStatus("mouse coordinates"+p1+","+p2);
}
}
