public class lecture_28 {
    public static void main(String[] args) {
        College co=new College("IIT_G", "Gohawti");
        Student s1 = new Student("Annu", 19,co);

        System.out.println(s1.getCollege().name);  
    }
}
//immutable
final class Student{
    private final String name;
    private final int age;
    private final College college;
    Student(String name,int age,College college){
        this.name=name;
        this.age=age;
        this.college=college;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    public College getCollege(){
        return new College(this.college.name ,this.college.address);
    }

}

//mutable
class College{
    String name;
    String address;

    College(String name,String address){
        this.name=name;
        this.address=address;
    }



}
