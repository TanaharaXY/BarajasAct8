package deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class deck {
 
    
    private final String[] Palo = {"Corazón", "Diamante", "Treból", "Pica"};
    private final String[] Color = {"Rojo", "Negro"};
    private final String[] Valor = {"A", "2", "3", "4", "5", "6", "7", "8","9", "10", "J", "Q", "K"};
        
        
    private ArrayList<card> mazo;
        
    public deck(){
            
        mazo = new ArrayList<card>();
            
       
        for(int i = 0; i < 2; i++){
            
            for(int j = 0; j < Valor.length; j++){
                
                mazo.add(new card(Palo[i], Color[0],Valor[j]));  
            } 
        }
        
        for(int i = 2; i < 4; i++){
            
            for(int j = 0; j < Valor.length; j++){
                
                mazo.add(new card(Palo[i], Color[1], Valor[j]));  
            } 
        }   
    }
    
    //Obtenemos el tamaño del deck
    public int getSize(){
   
        return mazo.size();
    }
    
   
   //Nos muestra el Deck 
    public ArrayList<card> getDeck(){
        
        return mazo;
    }
    
    public void shuflle() throws Exception{
        
        try{
            Collections.shuffle(mazo);
            System.out.println("Mezclamos el deck.");
            for (Object objeto : mazo)
            {
                System.out.print(mazo + " /n ");
            }
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan suficientes cartas.");   
        }
        }
    


        public void head() throws Exception{
            
            try{
            System.out.println(mazo.get(0));
            mazo.remove(0);
            System.out.println("Quedan " + mazo.size() + " cartas");
            }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan cartas en el Deck.");
            
        }
        }


        public void pick() throws Exception{
            
            try{
            Random random = new Random();
            System.out.println(mazo.get(random.nextInt(mazo.size())));
            mazo.remove(random.nextInt(mazo.size()));
            System.out.println("Quedan " + mazo.size() + " cartas");
            }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan suficientes cartas.");
            
        }  
        }

        public void hand() throws Exception{
            
            try {
            for(int i=0; i<=4; i++){
                System.out.println(mazo.get(i));
            }
            for(int i=0; i<=4; i++){
                mazo.remove(i);
            }
            System.out.println("Quedan " + mazo.size()+ " cartas");
            } catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "No quedan suficientes cartas.");
            
        }  
        }

    
}