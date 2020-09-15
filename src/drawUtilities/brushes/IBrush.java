package drawUtilities.brushes;

import java.awt.*;

public interface IBrush {
    void draw();
    void setBrushType(BrushType brushType);
    void setBrushColor(Color color);
    void setBrushSize(int size);
    int getBrushSize();
    BrushType getBrushType();
    Color getBrushColor();
}
