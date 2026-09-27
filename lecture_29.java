public class lecture_29 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Annu";
        s1.age = 19;
        System.out.println(s1.toString());

        Student s2 = new Student();
        s2.name = "Annu";
        s2.age = 19;
        System.out.println(s1.equals(s2)); 
    }
}

class Student{
    String name;
    int age;
}
