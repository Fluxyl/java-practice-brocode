package tutorials;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraphicsFrame extends JFrame {
    
    // Constructor
    GraphicsFrame() {
        GraphicsPanel gPanel = new GraphicsPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(gPanel);
        this.pack();

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
