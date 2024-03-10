import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame f;
    private JTextField tf1,tf2 ,tf3;
    private JPanel group1,group2,group3,group4;
    private JLabel l1,l2,l3;
    private JButton b1,b2;
    private Student stu;
    private File file;
    public StudentView() {
        stu = new Student();
        //create file
        file = new File("StudentM.dat");
        if (file.exists()){
            try(FileInputStream thor = new FileInputStream(file);ObjectInputStream objthor = new ObjectInputStream(thor);){
                stu = (Student) objthor.readObject();
            }catch(IOException e){
                e.printStackTrace();
            } catch (ClassNotFoundException c) { // class Student not found
                c.printStackTrace();
            }
        }
        //create frame panel label and TextField
        f = new JFrame();
        group1 = new JPanel();
        group2 = new JPanel();
        group3 = new JPanel();
        group3 = new JPanel();
        group4 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Money");
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        
        //set layout
        tf3.setEditable(false);
        f.setLayout(new GridLayout(4,1));
        group1.setLayout(new GridLayout(1,2));
        group2.setLayout(new GridLayout(1,2));
        group3.setLayout(new GridLayout(1,2));
        group4.setLayout(new FlowLayout());
        
        //add compo
        group1.add(l1);
        group1.add(tf1);
    
        group2.add(l2);
        group2.add(tf2);
        
        group3.add(l3);
        group3.add(tf3);
        
        group4.add(b1);
        group4.add(b2);

        f.add(group1);
        f.add(group2);
        f.add(group3);
        f.add(group4);
        
        tf1.setText(stu.getID()+"");
        tf2.setText(stu.getName()+"");
        tf3.setText(stu.getMoney()+"");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 250);
        f.setVisible(true);
        
        //add action in button
        b1.addActionListener(this); b2.addActionListener(this); f.addWindowListener(this);
        
    }
        public void actionPerformed(ActionEvent a) {
        //withdraw
        if (a.getSource() == b2) {
            stu.setMoney(stu.getMoney()-100);
            tf3.setText(stu.getMoney()+"");
        }else if (a.getSource() == b1) {
            stu.setMoney(stu.getMoney()+100);
            tf3.setText(stu.getMoney()+"");
        }
        }
        public void windowClosing(WindowEvent ev) {
            stu.setID(Integer.parseInt(tf1.getText()));
            stu.setName(tf2.getText());
            stu.setMoney(Integer.parseInt(tf3.getText()));
            try(FileOutputStream fout = new FileOutputStream("StudentM.dat"); ObjectOutputStream oout = new ObjectOutputStream(fout);){
                oout.writeObject(stu);
            }catch (IOException i) {
                i.printStackTrace();
            }
            
        }
        public void windowOpened(WindowEvent ev) {
        }
        public void windowClosed(WindowEvent ev) {
        }
        public void windowIconified(WindowEvent ev) {}
        public void windowDeiconified(WindowEvent ev) {}
        public void windowActivated(WindowEvent ev) {}
        public void windowDeactivated(WindowEvent ev) {}
}
