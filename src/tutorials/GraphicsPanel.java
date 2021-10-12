package tutorials;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;

public class GraphicsPanel extends JPanel {

    GraphicsPanel() {
        this.setPreferredSize(new Dimension(500, 500));

    }

    public void paint(Graphics g) {
        // Cast to Graphics2D
        Graphics2D g2D = (Graphics2D) g;


        // Change Brush Size, Color, & Draw Line
        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.BLUE);
        g2D.drawLine(0, 0, 500, 500);

        // Draw Pink Rectangle in Middle
        g2D.setPaint(Color.PINK);
        g2D.setStroke(new BasicStroke(3));
        g2D.drawRect(100, 100, 300, 200);

        // Draw even smaller Rectangle in Middle of prev w/ fill
        g2D.setPaint(Color.MAGENTA);
        g2D.fillRect(150, 150, 200, 100);

        // Draw Circle that's red lined
        g2D.setPaint(Color.RED);
        g2D.drawOval(350, 100, 100, 100);

        // Draw Arc
        g2D.drawArc(0, 0, 300, 100, 0, 180);

        // Draw Polygon || BUT requires array of points (xPoints, yPoints, nPoints)
        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};

        g2D.drawPolygon(xPoints, yPoints, 3);


        // Draw String
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("BootyHole", 150, 345);


    }

}
