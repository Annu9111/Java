public class lecture_10 {
    public static void main(String[] args) {
        //⭐️functions

        greet();

        sayHello("Annu");

        System.out.println(getOutput());

        System.out.println(multiply(4, 9));


        //⭐️Function overloading
        int result1 = sum(5, 9);
        System.out.println(result1);

        int result2 = sum2(5,7,9);
        System.out.println(result2);




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

    static int sum(int p, int q){
        return p+q;
    }
    static int sum2(int p, int q, int r){
        return p+q+r;
    }
}
