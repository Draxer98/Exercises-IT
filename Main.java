import static tools.utility.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] operazioni = {"VODAFONE",
                "[1] Inserimento",
                "[2] Visualizzazione",
                "[3] Ricerca",
                "[4] Modifica Contratto",
                "[5] Fine"};
        boolean Sitel=true;
        boolean bool;
        final int nMax = 3;
        int scelta=0;
        int contrattiVenduti = 0;
        Contatto[] gestore = new Contatto[nMax];

        Scanner keyboard = new Scanner(System.in);

        boolean fine = true;
        do {
            switch (menu(operazioni, keyboard)) {
                case 1:

                    if (contrattiVenduti < nMax) {
                        //firma contratto
                        gestore[contrattiVenduti]=leggiPersona(Sitel,keyboard, gestore, contrattiVenduti);
                        contrattiVenduti++;
                    } else {
                        System.out.println("Non ci sono più contratti da vendere");
                    }
                    break;
                case 2: {
                    visualizza(gestore, contrattiVenduti);
                    break;
                }

                case 3: {
                    break;
                }

                case 4: {
                    System.out.println(visualizza(gestore, contrattiVenduti));
                    do {
                        bool = true;
                        System.out.println("Quale contatto vuole modificare?");
                        scelta = keyboard.nextInt();
                        keyboard.nextLine();
                        if (scelta <= 0 || scelta > contrattiVenduti) {
                            System.out.println("Utente inserito non esistente, riprova");
                            bool = false;
                        }
                    } while (!bool);

                    gestore[scelta]=ModificaContratto(gestore, contrattiVenduti, keyboard, Sitel, scelta);
                    break;
                }
                default:
                    fine = false;
                    break;
            }
        } while (fine);
    }
    private static int visualizza(Contatto[] gestore, int contrattiVenduti) {
        System.out.println("Elenco dei contatti:");
        for (int i = 0; i < contrattiVenduti; i++) {
            System.out.println(gestore[i].stampa());
        }
        return contrattiVenduti;
    }
    private static Contatto leggiPersona(boolean Sitel, Scanner keyboard, Contatto[] gestore, int contrattiVenduti) {
        boolean verifica;
        String[] tipoC = {"Telefono", "1]abitazione", "2]cellulare", "3]aziendale"};
        Contatto persona = new Contatto();

        do {
            verifica=true;
            System.out.println("\nInserisci il nome: ");
            persona.nome = keyboard.nextLine();
            System.out.println("\nInserisci il cognome: ");
            persona.cognome = keyboard.nextLine();
            for (int i = 0; i < contrattiVenduti; i++) {
                if (persona.nome.equals(gestore[i].nome) && persona.cognome.equals(gestore[i].cognome)) {
                    System.out.println("Utente già registrato, reinserire: ");
                    verifica = false;
                    break;
                }
            }
        } while (!verifica);

        System.out.println("\nInserisci il numero di telefono: ");
        if (Sitel) {
            persona.telefono = keyboard.nextLine();
            switch (menu(tipoC, keyboard)) {
                case 1:
                    persona.tipo = tipoContratto.abitazione;
                    break;
                case 2:
                    persona.tipo = tipoContratto.cellulare;
                    break;
                default:
                    persona.tipo = tipoContratto.aziendale;
                    break;
            }
        }

        return persona;
    }
    private static Contatto ModificaContratto(Contatto[] gestore, int contrattiVenduti, Scanner keyboard, boolean Sitel, int scelta){

        scelta--;

        gestore[scelta] =leggiPersona(Sitel, keyboard, gestore, contrattiVenduti);

        return gestore[scelta];
    }
}
