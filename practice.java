import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Collections;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList <Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int one=0;
        int rem=0;
        while(n>0){
            rem=n%2;
            if(rem==1){
                one+=1;
            }
            n/=2;
        }
        int dec=0;
        for(int i=0;i<one;i++){
            dec+=Math.pow(2,i);

        }
        System.out.println(dec);

        sc.close();
        
    }
}
