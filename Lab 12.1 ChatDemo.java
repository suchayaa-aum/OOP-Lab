import java.awt.*;
import javax.swing.*;
public class ChatDemo{
  private JFrame frame;
  private JPanel p1;
  private JTextArea ta;
  private JTextField tf;
  private JButton btn1, btn2;
  public ChatDemo() {
    frame = new JFrame();
    p1 = new JPanel();
    ta = new JTextArea();
    tf = new JTextField();
    btn1 = new JButton("Submit");
    btn2 = new JButton("Reset");

    //set layout
    ta.setEditable(false);
    frame.setlayout(new GridLayout(3,0));
    
  }
}
