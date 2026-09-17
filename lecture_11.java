public class lecture_11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Annu";
        s1.age = 19; 
        s1.rollNum = 56;
        s1.attendence();

        Student s2 = new Student();
        s2.name = "Anusha";
        s2.age = 49; 
        s2.rollNum = 101;
        s2.attendence();
    }
}

class Student{
    String name;
    int age;
    int rollNum;
    String college;

    void attendence(){
        System.err.println(name +" has marked attendence");
    }

}
