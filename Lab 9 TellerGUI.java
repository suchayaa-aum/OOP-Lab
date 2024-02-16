import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TellerGUI implements ActionListener {
    private JFrame f;
    private JTextField tf, tf4;
    private JPanel group1,group2,group3;
    private JLabel l1,l2,l3,l4;
    private JButton b1,b2,b3;
    public Account account;
    public TellerGUI() {
        //create frame panel label and TextField
        f = new JFrame("TellerGUI");
        group1 = new JPanel();
        group2 = new JPanel();
        group3 = new JPanel();
        account = new Account();
        account.balance = 6000;
        tf = new JTextField("6000");
        l1 = new JLabel("  Balance");
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2 = new JLabel("  Amount");
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3 = new JLabel(account.balance+"");
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        tf4 = new JTextField();
        b1 = new JButton("Deposit");
        b1.setFont(new Font("Tahoma", Font.BOLD, 14));
        b2 = new JButton("Withdraw");
        b2.setFont(new Font("Tahoma", Font.BOLD, 14));
        b3 = new JButton("Exit");
        b3.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        //set layout
        tf.setEditable(false);
        f.setLayout(new GridLayout(4,0));
        group1.setLayout(new GridLayout(1,2));
        group2.setLayout(new GridLayout(1,2));
        group3.setLayout(new FlowLayout());
        
        //add compo
        group1.add(l1);
        group1.add(tf);
    
        group2.add(l2);
        group2.add(tf4);
        
        group3.add(b1);
        group3.add(b2);
        group3.add(b3);
        
        f.add(group1);
        f.add(group2);
        f.add(group3);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 250);
        f.setVisible(true);
        
        //function 
        tf.setText(account.balance+"");
        //add action in button
        b1.addActionListener(this); b2.addActionListener(this); 
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a) {
        //withdraw
        if (a.getSource() == b2) {
            account.withdraw(Double.parseDouble(tf4.getText()));
            tf.setText(account.balance+"");
        }else if (a.getSource() == b1) {
            account.deposit(Double.parseDouble(tf4.getText()));
            tf.setText(account.balance+"");
        }else if (a.getSource() == b3) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TellerGUI();
    }
}
