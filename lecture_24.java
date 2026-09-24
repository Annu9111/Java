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
        // outer ot = new outer();
        // ot.greet(); 

        //Anonymous
        Person p1 = new Person();
        p1.introduce();

        Person p2 = new Person(){
            @Override 
            void introduce(){
                System.out.println("hey,i am a guest");
            }
        };
        p2.introduce(); 


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
// class outer{
//     void greet(){
//         System.out.println("hello there!!");

//         class Local {
//             void sayHello(){
//                 System.out.println("say hello");
//             }
//         }
//         Local lo = new Local();
//         lo.sayHello();
//     }
// }

// Anonymous class
class Person{
    void introduce(){
        System.out.println("hey, i am a person");
    }
}

// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("hey, i am a guest");
//     }
// }
