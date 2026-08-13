package Java.OOP;
// Parameterized constructor
public class student{
    String name;
    int rollno;
    student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollno);
    }
public static void main(String[]args){
    student s1 = new student("Amit",12);
    s1.display();
}
}