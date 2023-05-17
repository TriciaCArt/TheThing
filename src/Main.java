import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        FileReader fileReader = FileReader.getInstance();

        fileReader.printFileContentsToConsole(Path.of("things.txt"));

        fileReader.readProductsFromFile(Path.of("things.txt"));


    }
}