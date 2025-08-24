public class HTMLReport extends ReportGenerator {
    public HTMLReport(){
        super("HTML");
    }
    @Override
    public void fetch() {
        System.out.println("Fetching data for HTML Report...");
    }

    @Override
    public void format() {
        System.out.println("Formatting data for HTML Report...");
    }
}
