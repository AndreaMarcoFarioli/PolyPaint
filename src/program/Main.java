package program;

import program.mvc.Controller;
import program.mvc.Model;
import program.mvc.View;

public class Main {
    public static void main(String[] args) {
        View v = new View();
        Model model = new Model();
        Controller controller = new Controller(model, v);
        controller.start();
    }
}
