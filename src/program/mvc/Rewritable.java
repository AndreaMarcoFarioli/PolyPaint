package program.mvc;

import javax.swing.*;
import java.util.Stack;

public class Rewritable {
    private static final Stack<Rewritable> rewritables = new Stack<>();
    private static final Stack<Rewritable> rewritablesRedo = new Stack<>();

    private final Runnable redoAction;
    private final Runnable undoAction;

    public static void undoRewritable(){
        if(rewritables.size() > 0) {
            Rewritable rewritable;
            rewritablesRedo.push(rewritable = rewritables.pop());
            rewritable.undo();
        }
    }

    public static void redoRewritables(){
        if(rewritablesRedo.size() > 0){
            Rewritable rewritable;
            rewritables.push(rewritable = rewritablesRedo.pop());
            rewritable.redo();
        }
    }

    public Rewritable(Runnable undo, Runnable redo){
        redoAction = redo;
        undoAction = undo;
        rewritables.push(this);
    }

    public void undo(){
        undoAction.run();
    }
    public void redo(){
        redoAction.run();
    }
}
