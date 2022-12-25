package Facade;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        ReportGeneratorFacade reportGeneratorFacade = new ReportGeneratorFacade();

        reportGeneratorFacade.generateReport(ReportType.HTML, null, null);

        reportGeneratorFacade.generateReport(ReportType.PDF, null, null);
    }
}