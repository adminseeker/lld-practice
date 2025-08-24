public class CSVReport extends ReportGenerator {
    public CSVReport(){
        super("CSV");
    }
    @Override
    public void fetch() {
        System.out.println("Fetching data for CSV Report...");
    }

    @Override
    public void format() {
        System.out.println("Formatting data for CSV Report...");
    }
}
