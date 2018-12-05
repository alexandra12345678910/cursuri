public class Film{
    private String titlu;
    private double durata;
    
    Film(String titlu, double durata){
     this.titlu = titlu;
     this.durata = durata;
    
    }
    
    public String getTitlu(){
        return this.titlu;
    }
    
    public void setTitlu(String titlu){
        this.titlu = titlu;
    }
    
    public double getDurata(){
        return this.durata;
    }
    
    public void setDurata(double durata){
        this.durata = durata;
    }

}