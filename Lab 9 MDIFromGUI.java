import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    public MDIFromGUI() {
        //create
        JFrame f = new JFrame("MDIFromGUI");
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("View");
        JMenu mi1 = new JMenu("New");
        JMenuItem mi2 = new JMenuItem("Open");
        JMenuItem mi3 = new JMenuItem("Save");
        JMenuItem mi4 = new JMenuItem("Exit");
        JMenuItem mia1 = new JMenuItem("Window");
        JMenuItem mia2 = new JMenuItem("Message");
        //create desktop and internalframe
        
        
        //add compo
        f.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        m1.add(mi1); m1.addSeparator();
        m1.add(mi2); m1.addSeparator();
        m1.add(mi3); m1.addSeparator();
        m1.add(mi4);
        mi1.add(mia1); mi1.addSeparator(); mi1.add(mia2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800,600);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MDIFromGUI();
        }
}
