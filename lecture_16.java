// encapsulation 
public class lecture_16 {
    public static void main(String[] args) {
        bankAccount ba = new bankAccount();
        // System.out.println(ba.balance);
        ba.deposite(1000);
        System.out.println(ba.getBalance());
    }
}

class bankAccount{
    private double balance = 1000000000;

    public void deposite(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}


class Student{
    private String name;
    private int age;
    private int rollNo;

    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    //getter and setter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getRollNum(){
        return rollNo;
    }
    public void setName(String newname){
        this.name = newname;
    }

}   