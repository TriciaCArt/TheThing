import java.nio.file.Path;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FileReader fileReader = FileReader.getInstance();
        List<Things> myThings = fileReader.readProductsFromFile(Path.of("things.txt"));

        myThings.toString();

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateLowInventoryReport(myThings);


    }
}