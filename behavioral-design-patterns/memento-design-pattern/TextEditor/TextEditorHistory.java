import java.util.ArrayDeque;

public class TextEditorHistory {
    private ArrayDeque<Memento> undoStack;
    private ArrayDeque<Memento> redoStack;

    public TextEditorHistory(){
        this.undoStack=new ArrayDeque<>();
        this.redoStack=new ArrayDeque<>();
    }

    public void saveState(Memento memento){
        undoStack.push(memento);
        redoStack.clear();
    }

    public Memento undo(){
        if(undoStack.size()>1){
            redoStack.push(undoStack.pop());
            return undoStack.peek();
        }
        return null;
    }

    public Memento redo(){
        if(!redoStack.isEmpty()){
            Memento redoState = redoStack.pop();
            undoStack.push(redoState);
            return redoState;
        }
        return null;
    }
}
