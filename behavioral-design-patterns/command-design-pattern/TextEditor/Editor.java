//invoker

import java.util.ArrayDeque;

public class Editor implements EditorActions{
    ArrayDeque<Command> commandHistoryStack;
    public Editor(){
        this.commandHistoryStack=new ArrayDeque<>();
    }

    @Override
    public void executeCommand(Command command) {
        command.execute();
        commandHistoryStack.push(command);
        System.out.println("Document Text: "+command.getDocument().getText());
    }

    @Override
    public void undo() {
        if(!commandHistoryStack.isEmpty()){
            Command command = commandHistoryStack.pop();
            command.undo();
            System.out.println("Undo -> Document Text: "+command.getDocument().getText());
        }
    }

}
