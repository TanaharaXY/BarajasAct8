/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deck;
import java.util.*;

public class deck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        card card = new card();
        int palos = card.palo.length;
        int valores = card.valor.length;
        int colores = card.color.length;
        int N = palos * valores * colores; 

        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < valores; i++) {
            for (int j = 0; j < palos; j++) {
                deck.add(card.palo[j]+ ", Rojo , " + card.valor[i]);
                deck.add(card.palo[j]+ ", Negro , " + card.valor[i]);
            }
        }

        Iterator<String> nombreIterator = deck.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
        }
        shuflle(deck);
        head(deck);
        pick(deck);
        hand(deck);
    }

    public static void shuflle(ArrayList deck){
        ArrayList<String> values = deck;
        Collections.shuffle(values);
        System.out.println("\n Se mezcló el Deck.");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
            String elemento = nombreIterator2.next();
            System.out.print(elemento+" / ");
        }
    }

    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    public static void pick(ArrayList  deck){
        Random aleatorio = new Random();
        System.out.println(deck.get(aleatorio.nextInt(deck.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + " cartas \n");
    }

    public static void hand(ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.println(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
    
}
