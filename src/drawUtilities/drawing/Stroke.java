package drawUtilities.drawing;

import drawUtilities.brushes.Brush;

import java.awt.*;
import java.util.ArrayList;

public class Stroke implements DrawAction {
    private final ArrayList<Brush> brushes = new ArrayList<>();
    private boolean printed = false;
    @Override
    public void action(Graphics g, float alpha) {
        if(!this.printed)
            for (Brush b : brushes)
                b.draw(g, alpha);
    }

    public void addBrush(Brush brush){
        brushes.add(brush);
    }

    public void setPrinted(boolean printed) {
        this.printed = printed;
    }

    public boolean getPrinted(){
        return this.printed;
    }
}
