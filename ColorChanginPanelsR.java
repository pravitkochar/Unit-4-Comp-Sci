import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class ColorChanginPanelsR extends JFrame{
    public ColorChanginPanelsR(){
        setTitle("Changes Color on Tap");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
public static void main(String[] args) {{
        ColorChanginPanelsR example = new ColorChanginPanelsR();
        example.setVisible(true);
    }
}
}