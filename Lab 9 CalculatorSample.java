import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    public class CalculatorSample implements ActionListener {
        private JFrame frame;
        private JPanel panel1,panel2;
        private JTextField tf;
        private JButton bn1,bn2,bn3,bn4,bn5,bn6,bn7,bn8,bn9,bn10,bn11,bn12,bn13,bn14,bn15,bn16;
        
        public CalculatorSample(){
        //create frame label and TextField
        frame = new JFrame("My Calculator");
        panel1 = new JPanel();
        panel2 = new JPanel();
        tf = new JTextField();
        //create Button
        bn1 = new JButton("0");
        bn2 = new JButton("c");
        bn3 = new JButton("=");
        bn4 = new JButton("/");
        bn5 = new JButton("1");
        bn6 = new JButton("2");
        bn7 = new JButton("3");
        bn8 = new JButton("*");
        bn9 = new JButton("4");
        bn10 = new JButton("5");
        bn11 = new JButton("6");
        bn12 = new JButton("-");
        bn13 = new JButton("7");
        bn14 = new JButton("8");
        bn15 = new JButton("9");
        bn16 = new JButton("+");
        //set layout
        frame.setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(4,4));
        panel2.setLayout(new BorderLayout());
        //add button component
        panel1.add(bn13);
        panel1.add(bn14);
        panel1.add(bn15);
        panel1.add(bn16);
        
        panel1.add(bn9);
        panel1.add(bn10);
        panel1.add(bn11);
        panel1.add(bn12);
        
        panel1.add(bn5);
        panel1.add(bn6);
        panel1.add(bn7);
        panel1.add(bn8);

        panel1.add(bn1);
        panel1.add(bn2);
        panel1.add(bn3);
        panel1.add(bn4);
        
        //add frame and panel component
        panel2.add(tf, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 260);
        frame.setVisible(true);
        //handler link
        bn1.addActionListener(this); bn2.addActionListener(this); bn3.addActionListener(this); bn4.addActionListener(this);
        bn5.addActionListener(this); bn6.addActionListener(this); bn7.addActionListener(this); bn8.addActionListener(this);
        bn9.addActionListener(this); bn10.addActionListener(this); bn11.addActionListener(this); bn12.addActionListener(this);
        bn13.addActionListener(this); bn14.addActionListener(this); bn15.addActionListener(this); bn16.addActionListener(this);
        }    
        //event
        double num1 = 0, num2 = 0,  result = 0;
        char operator;
        @Override
        public void actionPerformed(ActionEvent a) {
            if (a.getSource() == bn16){
                num1 = Double.parseDouble(tf.getText());
                operator = '+';
                tf.setText(""); 
            }else if (a.getSource() == bn12) {
                num1 = Double.parseDouble(tf.getText());
                operator = '-';
                tf.setText("");
            }else if (a.getSource() == bn8) {
                num1 = Double.parseDouble(tf.getText());
                operator = '*';
                tf.setText("");
            }else if (a.getSource() == bn4) {
                num1 = Double.parseDouble(tf.getText());
                operator = '/';
                tf.setText("");
            }else if (a.getSource() == bn15) {
                tf.setText(tf.getText()+"9");
            }else if (a.getSource() == bn14) {
                tf.setText(tf.getText()+"8");
            }else if (a.getSource() == bn13) {
                tf.setText(tf.getText()+"7");
            }else if (a.getSource() == bn11) {
                tf.setText(tf.getText()+"6");
            }else if (a.getSource() == bn10) {
                tf.setText(tf.getText()+"5");
            }else if (a.getSource() == bn9) {
                tf.setText(tf.getText()+"4");
            }else if (a.getSource() == bn7) {
                tf.setText(tf.getText()+"3");
            }else if (a.getSource() == bn6) {
                tf.setText(tf.getText()+"2");
            }else if (a.getSource() == bn5) {
                tf.setText(tf.getText()+"1");
            }else if (a.getSource() == bn1) {
                tf.setText(tf.getText()+"0");
            }else if (a.getSource() == bn2) {
                tf.setText("");
            }else if (a.getSource() == bn3) {
                num2 = Double.parseDouble(tf.getText());
                switch(operator) {
                case'+':
                    result = num1 + num2;
                    break;
                case'-':
                    result = num1 - num2;
                    break;
                case'*':
                    result = num1 * num2;
                    break;
                case'/':
                    result = num1 / num2;
                    break;
            }
                tf.setText(result+"");
            }
            
    }
    public static void main(String[] args) {
        new CalculatorSample();
        }
}
