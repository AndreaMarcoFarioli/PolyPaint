package drawUtilities.brushes;

import java.awt.*;

public class NormalBrush extends Brush {
    public NormalBrush(){
        this(3, Color.black);
    }

    private NormalBrush(int brushSize, Color color){
        super(brushSize, color);
    }

    @Override
    public void draw(Graphics graphics, float alpha) {
        Color c = new Color(getBrushColor().getRed(), getBrushColor().getGreen(), getBrushColor().getBlue(), alpha);
        graphics.setColor(c);
        graphics.fillOval(getPosition().x, getPosition().y, getBrushSize(), getBrushSize());
    }

    @Override
    public Brush clone() {
        return new NormalBrush(getBrushSize(), getBrushColor());
    }
}
