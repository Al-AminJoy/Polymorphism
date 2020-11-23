package polymorphism;


public class Polymorphism {

    public static void main(String[] args) {
        //Overload
        Overload ov=new Overload();
        ov.add();
        ov.add(5);
        //Runtime Polimorphism
        //Parent Class Can use all Child Class Method
        ov=new Child();
        ov.add();
        //Using many object by array
        Overload[] ovv=new Overload[3];
        ovv[0]=new Child();
        ovv[0].add(5);
        
        ovv[1]=new Child();
        ovv[1].add(6);
        
        ovv[2]=new Child();
        ovv[2].add(7);
        
        
    }
    
}
