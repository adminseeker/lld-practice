public abstract class ReportGenerator {
    private String documentType;

    public ReportGenerator(String documentType){
        this.documentType=documentType;
    }

    public final void generateReport(){
        fetch();
        format();
        System.out.println("Genertating "+documentType+" Report...");
    }

    public abstract void fetch();
    public abstract void format();

}
