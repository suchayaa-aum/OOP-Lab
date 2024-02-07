import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    public CalculatorTwoGUI() {
        //create frame label and TextField
        JFrame frame = new JFrame("My Calculator");
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JTextField tf = new JTextField();
        //create Button
        JButton bn1 = new JButton("0");
        JButton bn2 = new JButton("c");
        JButton bn3 = new JButton("=");
        JButton bn4 = new JButton("/");
        JButton bn5 = new JButton("1");
        JButton bn6 = new JButton("2");
        JButton bn7 = new JButton("3");
        JButton bn8 = new JButton("*");
        JButton bn9 = new JButton("4");
        JButton bn10 = new JButton("5");
        JButton bn11 = new JButton("6");
        JButton bn12 = new JButton("-");
        JButton bn13 = new JButton("7");
        JButton bn14 = new JButton("8");
        JButton bn15 = new JButton("9");
        JButton bn16 = new JButton("+");
        //set layout
        frame.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(4,4));
        panel2.setLayout(new BorderLayout());
        //add button component
        panel.add(bn13);
        panel.add(bn14);
        panel.add(bn15);
        panel.add(bn16);
        
        panel.add(bn9);
        panel.add(bn10);
        panel.add(bn11);
        panel.add(bn12);
        
        panel.add(bn5);
        panel.add(bn6);
        panel.add(bn7);
        panel.add(bn8);

        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bn4);
        
        //add frame and panel component
        panel2.add(tf, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 260);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
