package drawUtilities.brushes;

import java.awt.*;

enum BrushType {
    Square,
    Rectangle,
    Circle,
    Oval
}

public abstract class Brush implements IBrush {
    private int brushSize;
    private Color brushColor;
    private BrushType brushType;

    @Override
    public BrushType getBrushType() {
        return this.brushType;
    }

    @Override
    public void setBrushType(BrushType brushType) {
        this.brushType = brushType;
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
}
