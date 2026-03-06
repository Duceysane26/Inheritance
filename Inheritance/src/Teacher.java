public class Teacher extends Person{
    double salary;

    Teacher(String name , String address , String phone ,
            int age , double salary){
        super(name , address , phone ,age);
        this.salary = salary;
    }

    void display(){
        super.display();
        System.out.println("Salary: " + salary);
    }
}