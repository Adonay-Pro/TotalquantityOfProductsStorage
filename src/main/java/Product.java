public class Product {

   private String name;
   private int quantity;

    //Constructor
    public Product(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

}
