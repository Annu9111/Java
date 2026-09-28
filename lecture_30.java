public class lecture_30 {
    public static void main(String[] args) {
        paymentSystem status = paymentSystem.FAILED;
        System.out.println(status.name());

        Direction d = Direction.NORTH;
        System.out.println(d.getDegree());
        
    }
}

//Enum
enum paymentSystem{
    SUCCESS,
    FAILED,
    PENDING,
}

enum Direction{
    NORTH(0),
    WEST(90),
    SOUTH(180),
    EAST(270); 

    private int degree;
    Direction(int degree){
         this.degree=degree;
    }

    public int getDegree(){
        return this.degree;
    }
}