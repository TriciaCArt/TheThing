import java.util.List;

public class ThingsService {


    public void printQuantity(List<Things> toOrder) {
        for ( Things things : toOrder){
            Integer amountNow = things.getQuantity();
            String artThingName = things.getName();
            System.out.println("The art product called " + artThingName + "has the quantity of " + amountNow);


        }

    }

    public void printId(List<Things> theId) {
        theId.stream().forEach(things -> {

            Integer personNumber = things.getId();
            System.out.println(personNumber);


        });
    }


}
