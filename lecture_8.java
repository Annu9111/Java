public class lecture_8 {
    public static void main(String[] args) {
        //iteration statements 

        //while loop.   ✅
        int i =1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        //do while loop.  ✅
        int j =0;
        do{
            System.out.println("welcome");
            System.out.println(j);
            j++;
        }while(j<=10);

        //for loop.  ✅
        int k;
        for(k=1;k<=10;k++){
            System.out.println(k);
        }
        int l;
        for(l=10;l>=1;l--){
            System.out.println(l); 
        }

        //comma separated variation✅
        for(int m=1,n=5;m<=10;m++,n+=5){
            System.out.println(m*n);
        }

        //nested loop ✅
        for(int p=1;p<=10;p++){
            for(int q=1;q<=10;q++){
                System.out.println(p+","+q);
            }
        }

        //printing star pattern ✅
        // ⭐️
        // ⭐️⭐️
        // ⭐️⭐️⭐️
        // ⭐️⭐️⭐️⭐️
        // ⭐️⭐️⭐️⭐️⭐️ 
        for(int x=1;x<=5;x++){
            for(int y=1;y<=x;y++){
                System.out.print("⭐️");
            }
            System.out.println();
        }


        //Jump statement ✅
        for(int z =0;z<=10;z++){
            if(z==8){
                break;
            }
            System.out.println(z);
        }

        //to check prime. ✅
        boolean is_prime =true;
        int s =7;
        for(int t=2;t<s;t++){
            if(s%t==0){
                is_prime=false;
                break;
            }
        }
        if(is_prime){
            System.out.println("prime");
        }else{
            System.err.println("not a prime");
        }

        //to print odd numbers. ✅
        for(int w=1;w<=10;w++){
            if(w%2!=0){
                System.out.println(w);
            }
        }
    }
}
