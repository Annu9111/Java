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

        int result2 = sum(5,7,9);
        System.out.println(result2);

        greet("Annu", 19);
        greet(19,"Annu");


        //⭐️Recursion
        print10to1(1);
        print1to10(10);

        System.out.println(fibonacci(10));





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
    
    //⭐️function overloading
     
    static int sum(int p, int q){
        return p+q;
    }
    static int sum(int p, int q, int r){
        return p+q+r;
    }
    static int sum(double p, double q, double r){
        return (int)(p+q+r);
    }

    static  void greet(String name,int age){
        System.out.println("your name is "+name+"your age is "+age);

    }
    static  void greet(int age,String name){
        System.out.println("your name is "+name+"your age is "+age);
        
    }

    //⭐️ Recursion
    static int print10to1(int num){
        if (num == 1){
            return 1;
        }
        System.out.println(num);
        return print10to1(num-1);

    }
    static void print1to10(int num){
        if (num == 1){
            System.out.println(num);
            return ;
        }
        print1to10(num-1);
        System.out.println(num);

    }

    static  int fibonacci(int num){
        if(num==0 || num==1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
