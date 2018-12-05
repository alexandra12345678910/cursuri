public class Drama extends Film{
    int varstaMinima;
    
    Drama(String titlu, double durata, int varstaMinima){
        super(titlu, durata);
        this.varstaMinima = varstaMinima;
    }

    
    @Override
    public String toString(){
        return super.getTitlu() + " " + super.getDurata() + " " + this.varstaMinima;
    }
}