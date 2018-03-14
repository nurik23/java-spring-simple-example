package kg.edu.com.iaau.test;

public class Person {

    private String name;
    private int id;
    private int taxId;
    private Address address;

    public Person(int id, String name, Address address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void onCreate()
    {
        System.out.println("Person's created: " + this);
    }

    public void onDestroy()
    {
        System.out.println("Person destroyed.");
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void speak()
    {
        System.out.println("Hello! I am a person.");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }
}
