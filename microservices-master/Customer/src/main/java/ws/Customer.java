package ws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String lastname;
    private int age;
    private String sex;
    private String address;



    //TODO: 1 add 5 more fields (5 marks)
    //TODO: 2 add getters and setters for the fields (5 marks)

    public Customer() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
   public String getAddress() { return address; }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Customer [id=%s, name=%s,lastname=%s,age=%s,sex=%s,address=%s]", id, name,lastname,age,sex,address);
    }
}
