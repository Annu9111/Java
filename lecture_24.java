public class lecture_24 {
    public static void main(String[] args) {
        // outer out = new outer();
        // outer.inner in = new outer.inner();
        // in.fun();

        //inner class
        // outer out  = new outer();
        // outer.inner in = out.new inner();
        // in.fun();

        //local inner
        outer ot = new outer();
        ot.greet(); 

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

// class outer{
//     class inner{
//         void fun(){
//             System.out.println("hello");
//         }
//     }
// }


//local class
class outer{
    void greet(){
        System.out.println("hello there!!");

        class Local {
            void sayHello(){
                System.out.println("say hello");
            }
        }
        Local lo = new Local();
        lo.sayHello();
    }
}
