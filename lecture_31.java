public class lecture_31 {
    public static void main(String[] args) {
        // Direction[] directions = Direction.values();
        // for(Direction di : directions){
        //     System.out.println(di.name());
        // }

        Direction direction = Direction.valueOf("EAST");
        System.out.println(direction.name());
        System.out.println(direction.ordinal());




    }
}

enum Direction{
    EAST,
    WEST,
    NORTH,
    SOUTH;


}