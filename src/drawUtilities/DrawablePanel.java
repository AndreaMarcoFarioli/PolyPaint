package drawUtilities;

import javax.swing.*;
import java.awt.*;

public class DrawablePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(new Color(255,255,255));
        Graphics2D g2 = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        g2.drawOval(10,10,30,30);
    }
}
