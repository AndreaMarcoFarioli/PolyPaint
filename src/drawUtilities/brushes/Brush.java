package drawUtilities.brushes;

import java.awt.*;

public abstract class Brush implements IBrush {
    private int brushSize;
    private Color brushColor;
    private Point position;

    protected Brush(int brushSize, Color brushColor){
        this.brushColor = brushColor;
        this.brushSize = brushSize;
    }


    @Override
    public void setBrushColor(Color color) {
        this.brushColor = color;
    }

    @Override
    public void setBrushSize(int size) {
        this.brushSize = size;
    }

    @Override
    public int getBrushSize() {
        return this.brushSize;
    }

    @Override
    public Color getBrushColor() {
        return this.brushColor;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public Point getPosition() {
        return position;
    }

    public void setBrushDynamic(Brush brush){
        this.brushSize = brush.brushSize;
        this.brushColor = brush.brushColor;
    }

    public abstract Brush clone();
}
