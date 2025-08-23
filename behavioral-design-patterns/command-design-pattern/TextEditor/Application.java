public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Document document = new Document();

        editor.executeCommand(new WriteCommand(document, "Hello World!"));
        editor.executeCommand(new DeleteCommand(document, 3));

        editor.executeCommand(new CopyCommand(document, 1,5));
        editor.executeCommand(new PasteCommand(document));

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();



    }
}
