public class CopyCommand implements Command {
    private Document document;
    private int start;
    private int end;

    public CopyCommand(Document document, int start, int end){
        this.document=document;
        this.start=start;
        this.end=end;
    }

    @Override
    public void execute() {
        document.copy(start, end);
    }

    @Override
    public void undo() {
        
    }

    @Override
    public Document getDocument(){
        return this.document;
    }
}
