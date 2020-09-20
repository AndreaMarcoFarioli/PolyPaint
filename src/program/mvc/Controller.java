package program.mvc;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void start(){
        try {
            this.view.invokeAndWait();
        } catch (InvocationTargetException | InterruptedException e) {
            e.printStackTrace();
        }

        fetchInterface();
        fetchEvents();
    }

    public void fetchInterface(){
        view.setItemPanelVisible(model.isDrawItemsShow());
    }

    public void fetchEvents(){
        view.setShowItemsClickEvent((actionEvent)->{
            model.setDrawItemsShow(!model.isDrawItemsShow());
            // PROVVISORIO
            view.setItemPanelVisible(model.isDrawItemsShow());
            System.out.println(model.isDrawItemsShow());
        });
    }
}
