public class lecture_4 {
    public static void main(String[] args){
        //Operators
        //Arithmatic operators --> +,-,/,%,+=,-=,%=,/=,++,-- etc.
        int a=3;
        int b=10;
        int c=a+b;
        int d=a-b;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println(c + "," + d +","+e+","+f+","+g);

        int h = a+2;
        h=h+2;
        h+=2;    //both are same 
        h-=2;
        h*=3;
        System.out.println(h);

        //pre increment and post increment
        int j=7;
        j++;   //post increment
        ++j;    //pre increment
        // j=9
        int k = j++;  //k=j; j=j+1 ----> k=9
        System.out.println(j + "," + k);  //10,9
        int l = ++j;   //j=j+1; l=j;  ----> l=11
        System.out.println(j + "," +l);  //11,11
    }
}
