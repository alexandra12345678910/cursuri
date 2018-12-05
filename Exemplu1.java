public class Exemplu1{
    public static void main(String [] args){
        EvenNumbers t1 = new EvenNumbers();
        OddNumbers o1 = new OddNumbers();
        //t1.start();
        Thread t2 = new Thread(o1);
        t1.start();
        t2.start();
        System.out.println("SFARSIT");
        
        
        
    }

}