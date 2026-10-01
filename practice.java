import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Collections;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ArrayList <Integer> list = new ArrayList<>();
        // int rev=0;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int m=sc.nextInt();
            if (m==0){
                System.out.println(0);
                continue;
            }
            while(m>0){
                int last = m%10;
                System.out.print(last+" ");
                m/=10;
            }
            System.out.println();

        }
        
        sc.close();
    }
}
