public class DeleteCommand implements Command {
    private Document document;
    private int n;
    private String text;

    public DeleteCommand(Document document, int n){
        this.document=document;
        this.n=n;
        this.text="";
    }

    @Override
    public void execute() {
        String textNow = document.getText();
        text=textNow.substring(textNow.length()-n,textNow.length());
        document.delete(n);
        
    }

    @Override
    public void undo() {
        document.write(text);
    }

    @Override
    public Document getDocument(){
        return this.document;
    }
}
