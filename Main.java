import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Dichiarazione delle variabili
        Scanner keyboard = new Scanner(System.in);
        Random casuale = new Random();
        int random = 0;
        int contatore = 0;
        int numero = 0;
        int ricerca = 0;
        int numeroPrecedente = 0;
        int[] numeri = new int[10];
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = i;
        }
        int scelta = 0;
        String[] menu = {"[1] - WrongIndexSearch",
                "[2] - EvenOddSearch",
                "[3] - BiBinarySearch",
                "[4] - fine"};

        //do-while e switch per le varie scelte
        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }
            scelta = keyboard.nextInt();

            switch (scelta) {
                //Prima scelta (WrongIndexSearch)
                case 1:
                    ricerca = 0;
                    //Se contatore è uguale a 0, random sarà ugaule ad un numero compreso da 3 a 5 commpresi
                    if (contatore == 0) {
                        random = casuale.nextInt(3, 5);
                    }
                    //Chiedo il numero da cercare
                    System.out.println("Quale numero vuoi cercare: ");
                    numero = keyboard.nextInt();
                    //Richiamo il metodo WrongIndexSearch
                    ricerca = WrongIndexSearch(casuale, numero, numeri, random, contatore, numeroPrecedente);
                    //Se ricerca è uguale a -1 vuol dire che il numero cercato non esiste
                    if (ricerca != -1) {
                        //Se il contatore è uguale al numeero random, il numero sbaglierà
                        if (contatore == random) {
                            System.out.println("Il numero scelto è nella posizione: " + numeri[numeroPrecedente]);
                            contatore = 0;
                        } else {
                            System.out.println("Il numero scelto è nella posizione: " + numeri[ricerca]);
                            contatore++;
                            numeroPrecedente = ricerca;
                        }
                    } else {
                        System.out.println("Il numero scelto non esiste");
                    }
                    break;
                //Seconda scelta (EvenOddSearch)
                case 2:
                    break;
                //Terza scelta (BiBinarySearch)
                case 3:
                    //Chiedo il numero da cercare
                    System.out.println("Quale numero cerchi: ");
                    numero = keyboard.nextInt();
                    //Chiamo il metotodo BiBinarySearch
                    ricerca = biBinarySearch(numeri, numero);
                    //Se ricerca è uguale a -1, vuol dire che il numero cercato non esiste
                    if (ricerca != -1) {
                        System.out.println("Il numero cercato è: " + numeri[ricerca]);
                    } else {
                        System.out.println("Numero cercato non trovato");
                    }

                    break;
            }
        } while (scelta != 4);
    }

    protected static int WrongIndexSearch(Random casuale, int numero, int[] numeri, int random, int contatore, int numeroPrecendete) {
        int indice = -1;
        //for che serve a trovare il numero e far ritornare il suo indice
        for (int i = 0; i < numeri.length; i++) {
            if (contatore == random && numero == numeri[i]) {
                indice = numeri[i];
                break;
            }
            if (contatore != random && numero == numeri[i]) {
                indice = numeri[i];
                break;
            }
        }
        return indice;
    }

    protected static void EvenOddSearch(int[] numeri) {
        //Pultroppo questo metodo non so come farlo
    }

    //Metodo che usa la ricerca dicotomica
    protected static int biBinarySearch(int[] numeri, int numero) {
        int sinistra = 0;
        int destra = numeri.length - 1;

        do {
            int medio = (sinistra + destra) / 2;

            if (numeri[medio] == numero) {
                return medio;
            } else if (numeri[medio] < numero) {
                sinistra = medio + 1;
            } else {
                destra = medio - 1;
            }
        } while (sinistra <= destra);

        return -1;
    }
}