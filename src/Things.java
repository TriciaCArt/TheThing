
public class Things {

    private Integer id;
    private String name;
    private Integer quantity;
    private Double price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Things(){}

    public Things(Integer id, String name, Integer quantity, Double price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    public String toString() {
        return "Your chosen art product is [id= " + id + ", name= " + name + ", quantity= " + quantity + ", price= " + price + "]";
    }





}
