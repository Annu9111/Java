import java.util.Scanner;
import java.util.ArrayList;
// import java.util.Collections;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num;
        for(int i=m;i<=n;i++){
            int temp=i;
            boolean is_lucky = true;
            while(temp>0){
                num= temp%10;
                if(num!=4 && num!=7 ){
                    is_lucky=false;
                    break;
                }
                temp=temp/10;

            }
            if(is_lucky){
                list.add(i);
            }
        }
        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            for(int li:list){
                System.out.print(li + " ");
            }
        }
        
        
        sc.close();
        
    }
}
