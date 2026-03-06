public class Student extends Person {
    int semester;

    Student(String name , String address ,
            String phone ,int age , int semester){
        super(name , address , phone , age);
        this.semester = semester;
    }

    //method
    void display(){
        super.display();
        System.out.println("Semester: " + semester);
    }
}