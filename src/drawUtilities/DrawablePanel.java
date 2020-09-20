package drawUtilities;

import drawUtilities.drawing.LayerGroup;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawablePanel extends JPanel {
    private LayerGroup layerGroup;
    private boolean singleRefresh = false;
    public void setLayerGroup(LayerGroup layerGroup){
        this.layerGroup = layerGroup;
    }
    @Override
    protected void paintComponent(Graphics g) {
        if(singleRefresh)
            super.paintComponent(g);
        setBackground(new Color(255,255,255));
        Graphics2D g2 = (Graphics2D)g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHints(rh);
        if (layerGroup != null){
            layerGroup.actionLayer(g);
        }
        setClickableEvent();
    }

    public void setSingleRefresh(boolean singleRefresh) {
        this.singleRefresh = singleRefresh;
    }

    private void setClickableEvent(){
        super.addMouseListener(new MouseAdapter() {
            private boolean inClick = false;

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                inClick = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(inClick) {
                    inClick = false;
                    System.out.println(
                            new Point(
                                    Math.min(Math.max(e.getPoint().x, 0), getSize().width),
                                    Math.min(Math.max(e.getPoint().y, 0), getSize().height)
                            )
                    );
                }
            }
        });
    }
}