import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.*;
import java.io.IOException;
public class ChatDemo implements ActionListener, WindowListener{
  private JFrame frame;
  private JPanel p1;
  private JTextArea ta;
  private JTextField tf;
  private JButton btn1, btn2;
  private File file;
  public ChatDemo() {
    //create new file
    file = new File("ChatDemo.dat");

    // when opened file
    String txt = "";
    if(file.exists()){
        try(FileReader fr = new FileReader(file);){
            int ch;
            while((ch = fr.read()) != -1){
                txt += (char) ch;
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    frame = new JFrame();
    p1 = new JPanel();
    ta = new JTextArea(20, 45);
    tf = new JTextField(45);
    btn1 = new JButton("Submit");
    btn2 = new JButton("Reset");

    //set layout
    ta.setEditable(false);
    frame.setLayout(new BorderLayout());
    
    //add compo
    p1.add(btn1);
    p1.add(btn2);
    
    frame.add(ta, BorderLayout.NORTH);
    frame.add(tf, BorderLayout.CENTER);
    frame.add(p1, BorderLayout.SOUTH);
    
    ta.setText(txt);
    //add action
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    frame.addWindowListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
  @Override
    public void actionPerformed(ActionEvent a) {
        if(a.getSource() == btn1) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText()+"\n"+dtf.format(LocalDateTime.now())+tf.getText());
        }else if(a.getSource() == btn2){
           ta.setText("");
        }
        
    }
  @Override
    public void windowClosing(WindowEvent ev) {
        try(FileWriter fw = new FileWriter("ChatDemo.dat");){
            fw.write(ta.getText());
        } catch(IOException e){
            e.printStackTrace();
        }
    }
  @Override
    public void windowOpened(WindowEvent ev) {
    }
  @Override
    public void windowClosed(WindowEvent ev) {}
  @Override
    public void windowIconified(WindowEvent ev) {}
  @Override
    public void windowDeiconified(WindowEvent ev) {}
  @Override
    public void windowActivated(WindowEvent ev) {}
  @Override
    public void windowDeactivated(WindowEvent ev) {}
}
