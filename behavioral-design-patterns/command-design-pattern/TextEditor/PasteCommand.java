public class PasteCommand implements Command {
    private Document document;
    private int undoPaste;
    
    public PasteCommand(Document document){
        this.document=document;
    }

    @Override
    public void execute() {
        String prevText=document.getText();
        document.paste();
        String afterPaste = document.getText();
        this.undoPaste=afterPaste.length()-prevText.length();
    }

    @Override
    public void undo() {
        document.delete(undoPaste);
    }
    
    @Override
    public Document getDocument(){
        return this.document;
    }
}
