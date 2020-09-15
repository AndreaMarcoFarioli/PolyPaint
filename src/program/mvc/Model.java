package program.mvc;

import drawUtilities.drawing.LayerGroup;

import javax.swing.event.EventListenerList;

public class Model {
    private EventListenerList
            eventListenerList   = new EventListenerList();
    private String
            filename;
    private LayerGroup
            layerGroup          = new LayerGroup();
    private int
            mainLayer           = 0;

    private boolean
            drawItemsShow       = false;
    private boolean
            layerFrameShow      = false;
    private boolean
            planeFrameShow      = false;
    private int planeFrameShowIndex;

    public void createProject(){

    }

    public void addLayerChangedListener(){

    }

    public void removeLayerChangedListener(){

    }

    public void fireAll(){

    }

    public void fireLayerChanged(){

    }

    public void fireStateLayerFrameChanged(){

    }

    public void fireStatePlaneFrameChanged(){
        
    }

}
