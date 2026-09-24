public class lecture_24 {
    public static void main(String[] args) {
        // outer out = new outer();
        // outer.inner in = new outer.inner();
        // in.fun();

        //inner class
        outer out  = new outer();
        outer.inner in = out.new inner();
        in.fun();
    }
}

//static nested class
// class outer{
//     static class inner{
//         void fun(){
//             System.out.println("hello");
//         }
//     }
// }

//nested inner classes

class outer{
    class inner{
        void fun(){
            System.out.println("hello");
        }
    }
}

