package program.mvc;

import drawUtilities.brushes.Brush;
import drawUtilities.brushes.NormalBrush;
import drawUtilities.drawing.Stroke;
import java.io.Serializable;
import java.util.Stack;

public class ModelProject implements Serializable {
    private String projectName = "untitled";
    private final Stack<Stroke> strokes = new Stack<>();
    private final Stack<Stroke> strokesRedo = new Stack<>();
    private Stroke actualStroke = new Stroke();
    private Brush selectedBrush = new NormalBrush();

    public void newStroke(){
        // create Empty Stroke
        new Rewritable(this::undo, this::redo);
    }

    private void undo(){
    }

    private void redo(){

    }

    public void setProjectName(String projectName){
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}
