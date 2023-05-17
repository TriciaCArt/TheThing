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

    public void readProductsFromFile (Path path) {
       try {

           ArrayList<String> artyThings = (ArrayList<String>) Files.readAllLines(path);

           artyThings.stream().skip(1).forEach((String line) -> {
               Things things = new Things();
               String[] myArtyThings = line.split(",");

               things.setId(Integer.parseInt(myArtyThings[0]));
               things.setName(myArtyThings[1]);
               things.setQuantity(Integer.parseInt(myArtyThings[2]));
               things.setPrice(BigDecimal.valueOf(Double.valueOf(myArtyThings[3])));
               things.toString();

               System.out.println(things);


           });

           for (int i = 0; i < artyThings.size(); i++){

           }


       } catch (IOException e) {
           e.printStackTrace();
       }
    }



}
