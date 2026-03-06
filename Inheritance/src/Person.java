public class Person {

    //VARIABLES
    String name , address , phone;
    int age;

    //constructors
    Person(){  //no-arg constructor
        name="Ali";
        address="Howlwadaag";
        phone = "615051690";
        age = 23;
    }

    public Person(String name, String address, String phone , int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }



    //methods
    void display(){
        System.out.println("Name: " + name);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);
        System.out.println("age: " + age);
    }
}
