package program.mvc;

import java.io.*;

public class ModelInterface implements Serializable {
    private boolean
            drawItemsShow       = false;
    private boolean
            layerFrameShow      = false;
    private boolean
            planeFrameShow      = false;
    private static final File
            saveFile            = new File("data/interface.save.bin");


    public static File getSaveFile() {
        return saveFile;
    }

    public static ModelInterface getInterface(){
        ModelInterface modelInterface;
        try {
            FileInputStream fileInputStream = new FileInputStream(saveFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            modelInterface = (ModelInterface) objectInputStream.readObject();
            System.out.println("Saved");
        }catch (Exception e){
            modelInterface = new ModelInterface();
            System.out.println("New");
        }
        return modelInterface;
    }

    public void save(){
        try {
            if(!saveFile.exists()) {
                var ignored = saveFile.createNewFile();
            }
            OutputStream fileOutputStream = new FileOutputStream(saveFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDrawItemsShow(boolean drawItemsShow) {
        this.drawItemsShow = drawItemsShow;
        save();
    }

    public void setLayerFrameShow(boolean layerFrameShow) {
        this.layerFrameShow = layerFrameShow;
        save();
    }

    public void setPlaneFrameShow(boolean planeFrameShow) {
        this.planeFrameShow = planeFrameShow;
        save();
    }

    public boolean isLayerFrameShow() {
        return layerFrameShow;
    }

    public boolean isDrawItemsShow() {
        return drawItemsShow;
    }

    public boolean isPlaneFrameShow() {
        return planeFrameShow;
    }

    @Override
    public String toString() {
        return "ModelInterface{" +
                "drawItemsShow=" + drawItemsShow +
                ", layerFrameShow=" + layerFrameShow +
                ", planeFrameShow=" + planeFrameShow +
                '}';
    }
}
