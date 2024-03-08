import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener{
    private JFrame f;
    private JTextField tf1,tf2 ,tf3;
    private JPanel group1,group2,group3,group4;
    private JLabel l1,l2,l3,l4;
    private JButton b1,b2;
    private Student stu;
    private File file;
    public StudentView() {
        //create frame panel label and TextField
        f = new JFrame();
        group1 = new JPanel();
        group2 = new JPanel();
        group3 = new JPanel();
        group3 = new JPanel();
        tf3 = new JTextField(stu.getMoney());
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Money");
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        
        //set layout
        tf3.setEditable(false);
        f.setLayout(new GridLayout(4,0));
        group1.setLayout(new GridLayout(1,2));
        group2.setLayout(new GridLayout(1,2));
        group3.setLayout(new GridLayout(1,2));
        group4.setLayout(new FlowLayout());
        
        //add compo
        group1.add(l1);
        group1.add(tf1);
    
        group2.add(l2);
        group2.add(tf2);
        
        group2.add(l3);
        group2.add(tf3);
        
        group4.add(b1);
        group4.add(b2);
        
        f.add(group1);
        f.add(group2);
        f.add(group3);
        
        //create file
        file = new File("StudentM.dat");
        if(file.exists()){
            
        }
        try(FileInputStream thor = new FileInputStream(file);ObjectInputStream objthor = new ObjectInputStream(thor);){
            stu = (Student) objthor.readObject();
        }catch(IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException c) { // class Student not found
            c.printStackTrace();
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 250);
        f.setVisible(true);
        
        //add action in button
        b1.addActionListener(this); b2.addActionListener(this); 
        
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
}
