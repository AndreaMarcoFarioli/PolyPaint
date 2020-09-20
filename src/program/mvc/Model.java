package program.mvc;

import drawUtilities.drawing.LayerGroup;

import javax.swing.event.EventListenerList;

public class Model {
    private LayerGroup
            layerGroup          = new LayerGroup();
    private int
            mainLayer           = 0;

    private final ModelInterface
            modelInterface;
    private ModelProject
            modelProject;
    private int planeFrameShowIndex;

    public Model(){
        modelInterface = ModelInterface.getInterface();
        System.out.println(modelInterface);
    }

    public void setDrawItemsShow(boolean drawItemsShow) {
        modelInterface.setDrawItemsShow(drawItemsShow);
    }

    public void setLayerFrameShow(boolean layerFrameShow) {
        modelInterface.setLayerFrameShow(layerFrameShow);
    }

    public void setPlaneFrameShow(boolean planeFrameShow) {
        modelInterface.setPlaneFrameShow(planeFrameShow);
    }

    public boolean isLayerFrameShow() {
        return modelInterface.isLayerFrameShow();
    }

    public boolean isDrawItemsShow() {
        return modelInterface.isDrawItemsShow();
    }

    public boolean isPlaneFrameShow() {
        return modelInterface.isPlaneFrameShow();
    }

    public ModelProject getModelProject() {
        return modelProject;
    }


}
