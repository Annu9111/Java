public class lecture_22 {
    public static void main(String[] args) {
        // A a = new B();
        // a.fun();
    }
}

//static
class A{
    static void fun(){
        System.out.println("hello");
    }
}
class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
}
