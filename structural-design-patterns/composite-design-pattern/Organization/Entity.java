public interface Entity {
    default void showDetails(){
        showDetails("");
    }
    public void showDetails(String indent);
    public double getTotalSalary();
}
