package drawUtilities.brushes;

import java.awt.*;

public interface IBrush {
    void draw(Graphics graphics, float alpha);
    void setBrushColor(Color color);
    void setBrushSize(int size);
    int getBrushSize();
    Color getBrushColor();
}
