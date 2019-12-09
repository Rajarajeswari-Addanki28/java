// Demonstrate Labels
 import java.awt.*;
 import java.applet.*;
 /* <applet code="alll" width=300 height=200> </applet> */
public class alll extends Applet {
 public void init() { 
Label one = new Label("One"); 
Checkbox two = new Checkbox("Two"); 
TextArea three = new TextArea("Three");
Button four = new Button("Four");
 TextField five = new TextField("Five");
// add labels to applet window

 add(one);
 add(two);
 add(three);
add(four);
add(five);
}
}
