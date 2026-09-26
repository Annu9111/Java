import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Collections;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int till;
        if(m>=n){
            till=n;
        }else{
            till=m;
        }
        int gcd =1;
        
        for(int i=2;i<=till;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        
        
        sc.close();
        
    }
}
