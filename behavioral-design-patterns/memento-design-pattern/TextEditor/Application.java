public class Application {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        textEditor.setText("Hello World!");
        Memento currentState = textEditor.createMemento();
        history.saveState(currentState);
        System.out.println("Current text state: "+textEditor.getText());

        textEditor.setText("Hello World2!");
        currentState = textEditor.createMemento();
        history.saveState(currentState);
        System.out.println("Current text state: "+textEditor.getText());

        textEditor.setText("Hello World3!");
        currentState = textEditor.createMemento();
        history.saveState(currentState);
        System.out.println("Current text state: "+textEditor.getText());

        Memento prevState = history.undo();
        if(prevState!=null) textEditor.restore(prevState);
        System.out.println("After Undo: "+textEditor.getText());

        prevState = history.undo();
        if(prevState!=null) textEditor.restore(prevState);
        System.out.println("After Undo: "+textEditor.getText());

        
        Memento nextState = history.redo();
        if(nextState!=null) textEditor.restore(nextState);
        System.out.println("After Redo: "+textEditor.getText());

        prevState = history.undo();
        if(prevState!=null) textEditor.restore(prevState);
        System.out.println("After Undo: "+textEditor.getText());

        nextState = history.redo();
        if(nextState!=null) textEditor.restore(nextState);
        System.out.println("After Redo: "+textEditor.getText());

        nextState = history.redo();
        if(nextState!=null) textEditor.restore(nextState);
        System.out.println("After Redo: "+textEditor.getText());
    }
}
