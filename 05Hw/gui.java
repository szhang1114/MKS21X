import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends temp implements ActionListener{
    private Container pane;

    private JButton b, b2;
    private JLabel l;
    private JTextField t;
    private JCheckBox c;
 
  //CONSTRUCTOR SETS EVERYTHING UP
  public Window2() {
     this.setTitle("My first GUI");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  //NOTE!! THIS CAN BE CHANGED (see below)
    
     b = new JButton("toC");
     b2 = new Jbutton("toF");
     l = new JLabel("This is AWESOME! (lies)",null,JLabel.CENTER);
     t = new JTextField(12);
     pane.add(l);
     pane.add(b);
     pane.add(b2);
     pane.add(t);
 }

  //MAIN JUST INSTANTIATES + MAKE VISIBLE
  public static void main(String[] args) {
     Window2 g = new Window2();
     g.setVisible(true);
  }
}
