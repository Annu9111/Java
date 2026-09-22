public class lecture_21 {
    public static void main(String[] args) {
        
    }
}

interface Car{
    void Start();
    void Accelerate();
    void Brake();
}
class Fcar implements Car{
    public void Accelerate(){
        System.out.println("fuel car is accelerated");
    }
    public void Brake(){
        System.out.println("Fuel car is stopped");
    }
    public void Start(){
        System.out.println("FCar is Started");
    }

}
class Ecar implements Car{
    public void Accelerate(){
        System.out.println("Ecar is accelerated !");
    }
    public void Brake(){
        System.out.println("Ecar is Breaked");
    }
    public void Start(){
        System.out.println("ECar is started");
    }
}

 