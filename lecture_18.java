public class lecture_18 {
    public static void main(String[] args) {
        engineeringStudent e1 = new engineeringStudent();
        e1.markAttendence();
        e1.attendLab();
    }
}

class Student{
    String name;
    int age;

    void markAttendence(){
        System.out.println("Attendent has been marked");

    }
}
class engineeringStudent extends Student{
    void attendLab(){
        System.out.println("lab attended");
    }
}

