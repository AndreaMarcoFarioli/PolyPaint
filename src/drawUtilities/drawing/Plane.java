package drawUtilities.drawing;

import java.awt.*;
import java.util.ArrayList;


public class Plane implements DrawActionPlane {
    private final ArrayList<DrawAction> strokeList;
    public Plane(ArrayList<DrawAction> arrayList){
        this.strokeList = arrayList;
    }
    public Plane(){
        this.strokeList = new ArrayList<>();
    }
    @Override
    public void actionPlane(Graphics g, float alpha) {
        for(DrawAction drawAction : strokeList){
            drawAction.action(g, alpha);
        }
    }

    public ArrayList<DrawAction> getStrokeList() {
        return strokeList;
    }
}
