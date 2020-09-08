package program.mvc;

import java.lang.reflect.InvocationTargetException;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void start(){
        try {
            view.invokeAndWait();
        } catch (InvocationTargetException | InterruptedException e) {
            e.printStackTrace();
        }
        view.setShowItemsClickEvent((event)->{

        });
    }
}
