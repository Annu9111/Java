//super
public class lecture_19 {
    public static void main(String[] args) {
        
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}

class engineeringStudent extends Student{
    String college; 
    engineeringStudent(String name,int age,int rollNo,String college){
        super(name, age, rollNo );
        this.college = college;
    }
    void print(){
        System.out.println(name +" ,"+age+" ,"+rollNo+","+college);
    }
}
