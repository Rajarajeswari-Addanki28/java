// Demonstrate BorderLayout.
 import java.awt.*;
 import java.applet.*; 
import java.util.*; 
/* <applet code="BorderLayoutDemo" width=400 height=200> </applet> */
public class BorderLayoutDemo extends Applet {
 public void init() 
{
 setLayout(new BorderLayout());
add(new Button("This is across the top."), BorderLayout.NORTH);
 add(new Label("The footer message might go here."), BorderLayout.SOUTH); add(new Button("Right"), BorderLayout.EAST);

add(new Checkbox("check"), BorderLayout.WEST);
String msg = "HELLO";
add(new TextArea(msg), BorderLayout.CENTER);
}
}
