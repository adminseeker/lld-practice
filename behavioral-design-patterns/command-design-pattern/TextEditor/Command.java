public interface Command {
    public void execute();
    public void undo();
    public Document getDocument();
}
