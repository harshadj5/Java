package Java.OOP;
interface Hospital{
    void treatment();
}
class Doctor implements Hospital{
    public void treatment(){
        System.out.println("Doctor treates the patient");
    }
}
class Nurse implements Hospital{
    public void treatment(){
        System.out.println("A Nurse cares for the patient");
    }
}
public class Interface {
    public static void main(String[] args) {
        Doctor d= new Doctor();
        d.treatment();
    }
    
}
