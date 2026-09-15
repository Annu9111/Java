public class lecture_10 {
    public static void main(String[] args) {
        //⭐️functions

    }
    //🔥no input no output
    static void greet(){
        System.out.println("Hello 🤗");
        return;   //optional to write return because here return does not return an output
    } 

    //🔥 input but no output
    static  void sayHello(String name){
        System.out.println("Hello "+ name);
    }

    //🔥 no input but output
    static  int getOutput(){
        return 10; 
    }

    //🔥 input as well as output
    static int multiply(int a,int b){
        return a*b;
    }
}
