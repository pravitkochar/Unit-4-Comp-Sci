import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class MyFrame extends JFrame {

    JPanel panel = new JPanel();

    MyFrame() {

        JLabel l1 = new JLabel("111");
        l1.setName("111");
        l1.setOpaque(true);
        l1.setBackground(Color.MAGENTA);

        JLabel l2 = new JLabel("222");
        l2.setName("222");
        l2.setOpaque(true);
        l2.setBackground(Color.CYAN);

        JLabel l3 = new JLabel("333");
        l3.setName("333");
        l3.setOpaque(true);
        l3.setBackground(Color.YELLOW);

        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.addMouseListener(new MyMouseListener());
        panel.setName("panel");

        getContentPane().add(panel);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getButton() == MouseEvent.BUTTON3) { // BUTTON3 = right button
                Component c = panel.getComponentAt(e.getPoint()); // compare with panel.findComponentAt
                System.out.println("Open context menu for " + c.getName());
            }
        }
    }

    public static void main(String[] args) {

        new MyFrame();
    }
}