import java.util.*;

public class Aplicatie{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        String line = "";
        String []cmd = null;
        
        Cinematograf cin = Cinematograf.getInstance();
        
        while(true){
            System.out.println("Introduceti comanda dorita: ");
            line = sc.nextLine();
            cmd = line.split("\\s+");
            
            switch(cmd[0]){
            
            case "exit": 
                System.out.println("Inchidem aplicatia...");
                System.exit(0);
                break;
                
            case "afisare": 
                cin.afisare();
                break;
                
            case "afiseazaAnimatie":
                cin.afiseazaAnimatie();
                break;
                
            case "adaugaDrama":
            case "adaugaAnimatie":
                if(cin.lista.size() == 3){
                    throw new PreaMulteFilmeException();
                }
            
            
                String titlu = cmd[1];
                double durata = Double.parseDouble(cmd[2]);
                if(cmd.length == 4){
                    int varstaMinima = Integer.parseInt(cmd[3]);
                    cin.adaugaFilm(titlu, durata, varstaMinima);
                    
                }else{
                    cin.adaugaFilm(titlu, durata);
                }
            break;
            
            default: System.out.println("comanda incorecta! ");
                
            
            }
        
        
        }
        
    
    
    }

}

