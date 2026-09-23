import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int fact1 = 1;
        int fact2 = 1;
        int i=1;
        int j=1;
        while(i<=n || j<=m ){
            fact1*=i;
            fact2*=j;
            i++;
            j++;
        }
        System.out.println(fact1);
        System.out.println(fact2);

        sc.close();
    }
}
