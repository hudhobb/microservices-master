package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;

    private String productname;
    private int price;
    private String description;
    private int amount;

    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Product() {}

    public static Product get() {
        return null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }


    public int getPrice() {
        return price ;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }



//-------------------------------------------ประกาศ--------------------------------------
    @Override
    public String toString() {
        return String.format("Product [id=%s, productname=%s,price=%s,description=%s,amount=%s]", id, productname,price,description,amount);
    }
}
