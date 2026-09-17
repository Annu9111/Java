public class lecture_14 {
    public static void main(String[] args) {
        int x=4;
        int y=6;

        Random r = new Random(3,8);
        System.out.println(r.x + ", "+r.y);


        System.out.println(x +","+ y);   //4,6
        addten(x, y);        
        System.out.println(x +","+ y);  //4,6
    }
    static  void  addten(int x , int y){ 
        x=x+10;
        y=y+10;
    }

    static void addten(Random r){
        r.x = r.x + 10;
        r.y = r.y+10;
    }
}

class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x = x;
        this.y = y;
    }
}

//call by reference no concept in java 