package deck;

import java.io.IOException;
import java.util.*;
import java.lang.*;

public class deck {

    public static void main(String[] args) throws IOException {
        Scanner sn = new Scanner(System.in);
        int op = 0;
        boolean salir = false;

        card card = new card();
        int PALOS = card.palo.length;
        int VALORES = card.valor.length;
        int COLORES = card.color.length;
        int N = PALOS * VALORES * COLORES;

        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < VALORES; i++) {
            for (int j = 0; j < PALOS; j++) {
                deck.add(card.palo[j] + ", Rojo , " + card.valor[i]);
                deck.add(card.palo[j] + ", Negro , " + card.valor[i]);
            }
        }
        while (!salir) {
            System.out.println("POKER");
            System.out.println("Selecciona una opcion: \n1. Mezclar deck. \n2. Sacar una carta. \n3. Carta al azar. \n4. Generar una mano de 5 cartas. \n0. Salir.");
            op = sn.nextInt();
            try {
                switch (op) {
                    case 1:
                        System.out.println("Se mezclo el deck");
                        break;

                    case 2:
                        try {
                            System.out.println(deck.get(0));
                            deck.remove(0);
                            System.out.println("Quedan " + deck.size() + " cartas \n");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("No hay mas cartas.");
                            System.exit(0);
                        }
                        break;

                    case 3:
                        try {
                            Random aleatorio = new Random();
                            System.out.println(deck.get(aleatorio.nextInt(deck.size())));
                            deck.remove(aleatorio.nextInt(deck.size()));
                            System.out.println("Quedan " + deck.size() + " cartas\n");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("No hay mas cartas");
                            System.exit(0);
                        } catch (IllegalArgumentException ex) {
                            System.out.println("No hay mas cartas!");
                            System.exit(0);
                        }
                        break;

                    case 4:
                        try {
                            for (int i = 0; i < 5; i++) {
                                System.out.println(deck.get(i));
                            }
                            for (int i = 0; i < 5; i++) {
                                deck.remove(i);
                            }
                            System.out.println("Quedan " + deck.size() + " cartas");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("No hay mas cartas");
                            System.exit(0);
                        }
                        break;

                    case 0:
                        salir = true;
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no valida");
            }
        }
    }
}
