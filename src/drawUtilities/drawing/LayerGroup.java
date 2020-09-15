package drawUtilities.drawing;

import java.awt.*;
import java.util.ArrayList;

public class LayerGroup implements DrawActionLayer {
    private ArrayList<DrawActionPlane> planeArrayList = new ArrayList<>(1);
    private float alpha = 1;
    public LayerGroup(Plane[] planes){
        for(Plane p : planes){
            System.out.println(p.toString());
        }
    }
    public LayerGroup(Plane first){
        this(new Plane[]{ first });
    }
    public LayerGroup(){
        this(new Plane());
    }

    @Override
    public void actionLayer(Graphics g) {
        for(DrawActionPlane plane : planeArrayList){
            plane.actionPlane(g, alpha);
        }
    }

    public ArrayList<DrawActionPlane> getPlaneArrayList() {
        return this.planeArrayList;
    }

    public void addLayer(){
        this.planeArrayList.add(new Plane());
    }

    public void deleteLayer(int index){
        this.planeArrayList.remove(index);
    }
}
