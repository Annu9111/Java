public class lecture_29 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Annu";
        s1.age = 19;
        System.out.println(s1.toString());
    }
}

class Student{
    String name;
    int age;
}
