public class lecture_20{
    public static void main(String[] args) {
        Car car1 = new Ecar();
        car1.accelerate();
        car1.Brake();
        Car car2  = new Fcar();
        car2.accelerate();
        car2.Brake();
    }
}
abstract class Car{
    void Start(){
        System.out.println("Car started");
    }
    abstract void accelerate();
   
    abstract void Brake();
   
}

class Fcar extends Car{
    void accelerate(){
        System.out.println("fuel car is accelerated");
    }
    void Brake(){
        System.out.println("Fuel car is stopped");
    }

}
class Ecar extends Car{
    void accelerate(){
        System.out.println("Ecar is accelerated !");
    }
    void Brake(){
        System.out.println("Ecar is Breaked");
    }
}
