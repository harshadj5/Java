package Java.OOP;
  class Student{
    private String name;

    // seter method
    public void setName(String name){
        this.name = name;
    }

    //geter method
    public String getName(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rajendra");
        System.out.println(s1.getName());
    }
}

