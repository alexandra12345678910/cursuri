import java.util.*;
public class Exemplu3{
    static ArrayList<Integer> lista = new ArrayList<>();
    public static void main(String [] args){
        new Producer("p1").start();
        new Producer("p2").start();
        new Producer("p3").start();
        
        new Consumer("c1").start();
        new Consumer("c2").start();
        new Consumer("c3").start();
        
    
    }


}