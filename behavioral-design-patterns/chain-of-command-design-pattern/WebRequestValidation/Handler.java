public interface Handler {
    public void handle(Request request);
    public Handler setNext(Handler handler);
}
