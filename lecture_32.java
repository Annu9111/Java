public class lecture_32 {
    public static void main(String[] args) {
        Car c = new Thar();
        c.drive();
    }
}

interface Car{
    void drive();
}

class Thar implements Car{
    @Override 
    public void drive(){
        System.out.println("Thar is driving");
    }
}
