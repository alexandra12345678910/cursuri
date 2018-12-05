public class Consumer extends Thread{
    Consumer(String name){
        super(name);
    
    }
    
    @Override
    public void run(){
        while(true){
            synchronized(Exemplu3.lista){
                if(!Exemplu3.lista.isEmpty()){
                    int x = Exemplu3.lista.get(0);
                    Exemplu3.lista.remove(0);
                    System.out.println("Am eliminat elementul" + x);
                
                }
            }
        }
    
    }

}