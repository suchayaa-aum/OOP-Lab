import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JDesktopPane dkpane;
    private JInternalFrame f1,f2,f3;
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
        dkpane = new JDesktopPane();
        f1 = new JInternalFrame("Aplication 01",true,true,true,true);
        f2 = new JInternalFrame("Aplication 02",true,true,true,true);
        f3 = new JInternalFrame("Aplication 03",true,true,true,true);
        // set desktop and internalframe
        f1.getContentPane().add(new JPanel());
        f1.setSize(220, 180);
        f1.setVisible(true);
        
        f2.getContentPane().add(new JPanel());
        f2.setSize(220, 180);
        f2.setVisible(true);
        
        f3.getContentPane().add(new JPanel());
        f3.setSize(320, 200);
        f3.setVisible(true);
        
        dkpane.setBackground(Color.red);
        
        //pikad
        f1.setLocation(20,350);
        f2.setLocation(150,100);
        f3.setLocation(360,300);
        dkpane.add(f1);
        dkpane.add(f2);
        dkpane.add(f3);

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
        //add desktoppane
        this.setSize(800,600);
        f.add(dkpane);
    }
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {MDIFromGUI frame = new MDIFromGUI(); });
    }
}

