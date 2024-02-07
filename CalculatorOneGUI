import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    public CalculatorOneGUI(){
    //create frame and label
        JFrame frame = new JFrame("เครื่องคิดเลข");
        JPanel panel = new JPanel();
        
    //create textfield
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
                
    //create button
        JButton bn1 = new JButton("บวก");
        bn1.setFont(new Font("Tahoma", Font.BOLD, 16));
        JButton bn2 = new JButton("ลบ");
        bn2.setFont(new Font("Tahoma", Font.BOLD, 16));
        JButton bn3 = new JButton("คูณ");
        bn3.setFont(new Font("Tahoma", Font.BOLD, 16));
        JButton bn4 = new JButton("หาร");
        bn4.setFont(new Font("Tahoma", Font.BOLD, 16));
        
    //add component
        frame.setLayout(new GridLayout(4, 1));
        frame.add(tf1);
        frame.add(tf2);
        panel.setLayout(new FlowLayout());
        panel.add(bn1);
        panel.add(bn2);
        panel.add(bn3);
        panel.add(bn4);
        frame.add(panel);
        frame.add(tf3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
