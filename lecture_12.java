public class lecture_12 {
    public static void main(String[] args) {
        Student s1 = new Student("Annu",19,101);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        // Student s2 = new Student();    
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    Student(String a,int b,int c){
        name= a;
        rollNo=b;
        age=c;
    }
    Student(){
    }
}
