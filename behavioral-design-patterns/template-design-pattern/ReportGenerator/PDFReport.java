public class PDFReport extends ReportGenerator {
    public PDFReport(){
        super("PDF");
    }
    @Override
    public void fetch() {
        System.out.println("Fetching data for PDF Report...");
    }

    @Override
    public void format() {
        System.out.println("Formatting data for PDF Report...");
    }
}
