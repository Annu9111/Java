import java.util.Scanner;
public class lecture_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   //object of Scanner class 
        String name = sc.next();   //only read a word
        String full_name = sc.nextLine();
        System.out.println(name);
        System.out.println(full_name);

        int age = sc.nextInt();
        double dou = sc.nextDouble();
        boolean bo = sc.nextBoolean();
        //and so on 


        sc.close();
    }
}
