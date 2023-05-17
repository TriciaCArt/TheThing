
import java.util.List;

public class ReportGenerator {


    public void generateLowInventoryReport(List<Things> lowInventory){
     String message = " We are low on these arty things. Please reorder. ";

     for (Things things : lowInventory){
         if ((things.getPrice() >= 0.99 && things.getPrice() <= 100) && (things.getQuantity() <= 20)) {
           System.out.println( message + things.getId() + " " + things.getName() + " " + things.getQuantity() );
         } else if((things.getPrice() >= 101.00) && (things.getQuantity() <= 10)) {
             System.out.println(message + things.getId() + " " + things.getName() + " " + things.getQuantity());
         }
     }

    }
}
