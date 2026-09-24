public class lecture_24 {
    public static void main(String[] args) {
        outer out = new outer();
        outer.inner in = new outer.inner();
        in.fun();
    }
}

//static nested class
class outer{
    static class inner{
        void fun(){
            System.out.println("hello");
        }
    }
}
