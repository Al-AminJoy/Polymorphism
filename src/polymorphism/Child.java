package polymorphism;

public class Child extends Overload {
     @Override
     void add(int x){
        System.out.println("Runtime Polimorphism Variable : "+x);
    }
}
