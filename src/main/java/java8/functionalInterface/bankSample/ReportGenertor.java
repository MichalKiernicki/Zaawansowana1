package java8.functionalInterface.bankSample;

public class ReportGenertor implements Runnable{
    private String generatorName;

    public ReportGenertor(String generatorName) {
        this.generatorName = generatorName;
    }

    @Override
    public void run() {
        System.out.println(generatorName + ": Creating reports");
    }
}
