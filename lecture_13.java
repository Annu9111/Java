public class lecture_13 {
    public static void main(String[] args) {
        Student s1 = new Student("Annu");
        s1.attendence();
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    Student(){          //default constructor
    }

    Student(String name){
        this.name  = name;
    }

    Student(String name , int age , int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void attendence(){
        System.out.println(this.name + " has marked there attendece");
    }
}
