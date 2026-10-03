public class lecture_36 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(45);
        System.out.println(b1.getValue());

        Box<String> b2 = new Box<String>("Annu");
        System.out.println(b2.getValue());

        Box<Boolean> b3 = new Box<Boolean>(true);
        System.out.println(b3.getClass());



        pair <String,Integer> p1 = new pair<>("annu", 12)
    }
}

// 🔥 Generics

class Box<T>{
    private T value;

    Box(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }

    public void setvalue(T newVal){
        this.value = newVal;
    }
}

// more generics
class pair <T,U>{
    T name;
    U age;
    pair(T name , U age){
        this.name = name;
        this.age = age;
    }
}