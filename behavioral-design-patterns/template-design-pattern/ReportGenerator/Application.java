public class Application {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new PDFReport();
        reportGenerator.generateReport();

        reportGenerator = new CSVReport();
        reportGenerator.generateReport();

        reportGenerator = new HTMLReport();
        reportGenerator.generateReport();
    }
}
