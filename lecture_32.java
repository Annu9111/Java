public class lecture_32 {
    public static void main(String[] args) {
        // Car c = new Thar();
        // c.drive();
        Payment p = new DebitCard();
        p.pay();
    }
}

// interface Car{
//     void drive();
// }

// class Thar implements Car{
//     @Override 
//     public void drive(){
//         System.out.println("Thar is driving");
//     }
// }


//polymorphism
interface Payment{
    void pay();
}
class creaditCard implements Payment{
    public void pay(){
        System.out.println("Payment by using creadit card");
    }
}
class DebitCard implements Payment{
    public void pay(){
        System.out.println("Payment by using Debit card");
    }
}