//static keyword
public class lecture_15 {
    public static void main(String[] args) {
        Student s1 = new Student("priya", 20, 9);
        Student s2 = new Student("riya", 20, 15);

        Student.collegeName = "IIT bombay";
        System.out.println(s1.name +", "+s1.age +" ,"+s1.rollNo+" ,"+Student.collegeName);

        System.out.println(s2.name +", "+s2.age +" ,"+s2.rollNo+" ,"+Student.collegeName);


        Random r1 = new Random();
        System.out.println(r1.PI);
    }

}

class Student{
    String name;
    int age;
    int rollNo;
    static String collegeName;

    Student(String name, int age , int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}

class Random{
    final double PI = 3.14;
}
