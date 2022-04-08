package deck;

import java.util.ArrayList;

/**
 *
 * @author Fredo
 */
public class card {private String Palo;
    private String Color;
    private String Valor;
    
    public card(String Palo, String Color, String Valor){
        
        this.Palo = Palo;
        this.Color = Color; 
        this.Valor = Valor;
    }
    
    
    public String getPalo(){

        return Palo;
    }
    
    public String getColor(){
        
        return Color;
    }
    
    public String getValor(){
        
        return Valor;
    }
    
    
    
    
    public void setPalo(String Palo){
        
        this.Palo = Palo;
    }
    
    public void setColor(String Color){
        
        this.Color = Color;
    }
    
    public void setValor(String Valor){
        
        this.Valor = Valor;
    }
    

    public String toString(){
        
        return (Palo + ", " + Color + ", " + Valor);
    }
    
}
