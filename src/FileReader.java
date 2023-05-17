import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private static FileReader fileReader = null;

    private FileReader() {}

    public static FileReader getInstance() {
        if(fileReader == null) {
            fileReader = new FileReader();
        }
        return fileReader;
    }



    public void printFileContentsToConsole(Path path) {

        try {
            System.out.println( Files.readAllLines(path) );
        } catch (IOException e) {
            System.out.println("There was a problem reading this file.");
            e.printStackTrace();
        }
    }

    public List<Things> readProductsFromFile (Path path) {
        List<Things> things1 = new ArrayList<>();
       try {
           List<String> artyThings = Files.readAllLines(path);

           artyThings.stream()
                     .skip(1)
                     .forEach((String line) -> {

                        String[] myArtyThings = line.split(",");
                        Things things = new Things();
                            things.setId(Integer.parseInt(myArtyThings[0].trim()));
                            things.setName(myArtyThings[1]);
                            things.setQuantity(Integer.parseInt(myArtyThings[2].trim()));
                            things.setPrice(Double.valueOf(myArtyThings[3].trim()));
                        things1.add(things);
                     }
           );

       } catch (IOException e) {
           e.printStackTrace();
       }
       return things1;
    }



}
