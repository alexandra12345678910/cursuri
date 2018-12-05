import java.util.Random;

public class Producer extends Thread{
    Random r = new Random();
    
    Producer(String name){
        super(name);
    }
    
    @Override 
    public void run(){
        while(true){
            synchronized(Exemplu3.lista){
                if(Exemplu3.lista.size() < 100){
                    int x = r.nextInt();
                    Exemplu3.lista.add(x);
                    System.out.println("Am adaugat elementul " + x);
                
                }
            }
        }
    }
    
    
}