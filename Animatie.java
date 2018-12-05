public class Animatie extends Film implements Dublare{

    Animatie(String titlu, double durata){
        super(titlu, durata);
    
    }
    
    @Override
    public String dublat(){
        return "Dubrat in limba romana!";
    
    }
    
    @Override
    public String toString(){
        return super.getTitlu() + " " + super.getDurata();
    }
}