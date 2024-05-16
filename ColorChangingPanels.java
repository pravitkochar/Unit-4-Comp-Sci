import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ColorChangingPanels extends JFrame {

    public ColorChangingPanels() {
        setTitle("Color Changing Panels");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(2, 2));
        add(mainPanel);

        for (int i = 0; i < 4; i++) {
            JPanel panel = new ColorPanel(Color.WHITE);
            mainPanel.add(panel);
        }
    }

    private class ColorPanel extends JPanel {

        private Color originalColor;

        public ColorPanel(Color color) {
            this.originalColor = color;
            setBackground(color);

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    toggleColor();
                }
            });
        }

        private void toggleColor() {
            if (getBackground().equals(originalColor)) {
                setBackground(Color.RED); // Change to your predetermined color
            } else {
                setBackground(originalColor);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChangingPanels example = new ColorChangingPanels();
            example.setVisible(true);
        });
    }
}