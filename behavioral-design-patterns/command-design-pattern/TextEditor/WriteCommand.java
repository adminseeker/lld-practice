public class WriteCommand implements Command {
    private Document document;
    private String text;

    public WriteCommand(Document document, String text){
        this.document=document;
        this.text=text;
    }

    @Override
    public void execute() {
        document.write(text);
    }

    @Override
    public void undo() {
        document.delete(text.length());
    }

    @Override
    public Document getDocument(){
        return this.document;
    }
}
