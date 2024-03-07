import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
public class ChatDemo implements ActionListener, WindowListener{
  private JFrame frame;
  private JPanel p1;
  private JTextArea ta;
  private JTextField tf;
  private JButton btn1, btn2;
  public ChatDemo() {
    frame = new JFrame();
    p1 = new JPanel();
    ta = new JTextArea(45, 20);
    tf = new JTextField(45);
    btn1 = new JButton("Submit");
    btn2 = new JButton("Reset");

    //set layout
    ta.setEditable(false);
    frame.setLayout(new GridLayout(3,0));
    p1.setLayout(new FlowLayout());
    
    //add compo
    p1.add(btn1);
    p1.add(btn2);
    
    frame.add(ta);
    frame.add(tf);
    frame.add(p1);
    
    //add action
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    frame.addWindowListener(this);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 250);
    frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == btn1) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            System.out.print(dtf.format(LocalDateTime.now()));
        }
        
    }
    public void windowClosing(WindowEvent ev) {
        System.exit(0);
    }
    public void windowOpened(WindowEvent ev) {}
    public void windowClosed(WindowEvent ev) {}
    public void windowIconified(WindowEvent ev) {}
    public void windowDeiconified(WindowEvent ev) {}
    public void windowActivated(WindowEvent ev) {}
    public void windowDeactivated(WindowEvent ev) {}
}
