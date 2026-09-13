public class lecture_7 {
    public static void main(String[] args) {
        boolean b = true; 
        //selection statement 
        if(b==true){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }

        int i =10;
        if(i%2==0){
            System.out.println("i is even");
        }
        else if(i==0){
            System.out.println("none");
        }
        else{
            System.out.println("i is odd");
        }

        //switch statements
        int a =3;
        switch (a) {
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is above 3");
                break;
        }  

        //nested switch
        int j=5;
        int k=1;
        switch (j) {
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                switch(k){
                    case 1:
                        System.out.println("k is one");
                        break;
                    default:
                        System.err.println("k is greater then one");
                        break;    
                }
                break;
            default:
                System.out.println("none");
                break;
        }
    }
}
