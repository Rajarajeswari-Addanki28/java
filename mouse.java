/*<applet code="mouse" width="1000" height="1000" ></applet>*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouse extends Applet implements MouseListener
{
 String msg="HELLO";
  int x=100,y=200;
   int p1,p2;
  public void init()
{
   addMouseListener(this);
   
}
 public void mouseEntered(MouseEvent ob)
{
   msg="mouse entered into applet";
   x=200;
   y=500;
   p1=ob.getX();
   p2=ob.getY();
   repaint();
    }

  public void mouseClicked(MouseEvent ob)
{
   msg="mouse clicked on applet";
   x=300;
   y=200;
 p1=ob.getX();
   p2=ob.getY();
   repaint();
    }

public void mousePressed(MouseEvent ob)
{
   msg="mouse pressed";
   x=100;
   y=400;
  p1=ob.getX();
   p2=ob.getY();
   repaint();
    }
 public void mouseReleased(MouseEvent ob)
{
   msg="mouse released";
   x=300;
   y=300;
 p1=ob.getX();
   p2=ob.getY();
   repaint();
    }

  public void mouseExited(MouseEvent ob)
{
   msg="mouse  exited";
   x=250;
   y=600;
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
