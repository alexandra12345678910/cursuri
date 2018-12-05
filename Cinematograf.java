import java.util.ArrayList;

public class Cinematograf{
    private static Cinematograf SINGLETON = null;
    ArrayList<Film> lista = null;
    
    private Cinematograf(){
        lista = new ArrayList();
    }
    
    public static Cinematograf getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Cinematograf();
        }
        return SINGLETON;
    }
    
    
    
    public void afisare(){
        lista.stream()
            .forEach(System.out::println);
    
    }
    
    public void afiseazaAnimatie(){
        for(int i = 0; i< lista.size(); i++){
            if(lista.get(i) instanceof Animatie){
                System.out.println(lista.get(i));
            }
        
        }
    }
    
    public void adaugaFilm(String titlu, double durata){
        Animatie a = new Animatie(titlu, durata);
        lista.add(a);
        System.out.println("Am adaugat o animatie!");
        
    }
    
    public void adaugaFilm(String titlu, double durata, int varstaMinima){
        Drama d = new Drama(titlu, durata, varstaMinima);
        lista.add(d);
        System.out.println("Am adaugat o drama!");
        
    }

}