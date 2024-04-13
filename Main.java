import static tools.utility.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] operazioni = {"VODAFONE",
                "[1] Inserimento",
                "[2] Visualizzazione",
                "[3] Ricerca",
                "[4] Modifica Contratto",
                "[5] Cancella contratto",
                "[6] Fine"};
        boolean Sitel = true;
        boolean bool;
        final int nMax = 3;
        int scelta = 0;
        int contrattiVenduti = 0;
        Contatto[] gestore = new Contatto[nMax];

        Scanner keyboard = new Scanner(System.in);

        boolean fine = true;
        do {
            switch (menu(operazioni, keyboard)) {
                case 1:

                    if (contrattiVenduti < nMax) {
                        gestore[contrattiVenduti] = leggiPersona(Sitel, keyboard, gestore, contrattiVenduti);
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
                    if (contrattiVenduti != 0) {
                        if (ricerca(gestore, leggiPersona(false, keyboard, gestore, contrattiVenduti), contrattiVenduti)) {
                            System.out.println("Il contatto esiste");
                        } else {
                            System.out.println("Il contatto non esiste");
                        }
                    } else {
                        System.out.println("Non sono ancora presenti contratti venduti");
                    }
                    break;
                }

                case 4: {
                    visualizza(gestore, contrattiVenduti);
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

                    gestore[scelta] = ModificaContratto(gestore, contrattiVenduti, keyboard, Sitel, scelta);
                    break;
                }

                case 5: {
                    String[] metodo = {"[1] Con numero telefonico", "[2] Con nome e cognome"};
                    if (contrattiVenduti != 0) {
                        visualizza(gestore, contrattiVenduti);
                        do {
                            System.out.println("Tipo di eliminazione contratto: ");
                            for (int i = 0; i < metodo.length; i++) {
                                System.out.println(metodo[i]);
                            }
                            scelta = keyboard.nextInt();
                            keyboard.nextLine();

                            if (scelta == 1 || scelta == 2) {
                                EliminaContratto(scelta, gestore, contrattiVenduti, keyboard);
                                contrattiVenduti--;
                            } else {
                                System.out.println("Numero inserito non valido, 1 o 2 ");
                            }
                        } while (scelta < 1 || scelta > 2);
                    } else {
                        System.out.println("Non sono ancora presenti contratti venduti");
                    }
                    break;
                }
                default:
                    fine = false;
                    break;
            }
        } while (fine);
    }

    private static int visualizza(Contatto[] gestore, int contrattiVenduti) {
        if (contrattiVenduti != 0) {
            System.out.println("Elenco dei contatti:");
            for (int i = 0; i < contrattiVenduti; i++) {
                if (gestore[i] != null) {
                    System.out.println(gestore[i].stampa());
                }
            }
        } else {
            System.out.println("Non sono ancora presenti contratti venduti");
        }

        return contrattiVenduti;
    }

    private static Contatto leggiPersona(boolean Sitel, Scanner keyboard, Contatto[] gestore, int contrattiVenduti) {
        boolean verifica;
        String[] tipoC = {"Telefono", "1]abitazione", "2]cellulare", "3]aziendale"};
        Contatto persona = new Contatto();

        do {
            verifica = true;
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

    private static Contatto ModificaContratto(Contatto[] gestore, int contrattiVenduti, Scanner keyboard, boolean Sitel, int scelta) {

        scelta--;

        gestore[scelta] = leggiPersona(Sitel, keyboard, gestore, contrattiVenduti);

        return gestore[scelta];
    }

    private static boolean ricerca(Contatto[] gestore, Contatto contatto, int contrattiVenduti) {
        boolean ricerca = false;

        for (int i = 0; i < contrattiVenduti; i++) {
            if (contatto.nome.equals(gestore[i].nome) && contatto.cognome.equals(gestore[i].cognome)) {
                ricerca = true;
            }
        }
        return ricerca;
    }

    private static Contatto EliminaContratto(int scelta, Contatto gestore[], int contrattiVenduti, Scanner keyboard) {
        Contatto utente = new Contatto();
        if (scelta == 1) {
            System.out.println("Inserire il numero: ");
            utente.telefono = keyboard.nextLine();
            for (int i = 0; i < contrattiVenduti; i++) {
            if (utente.telefono.equals(gestore[i].telefono)) {
                    if (i == 0 && contrattiVenduti > 1) {
                        gestore[i] = gestore[i + 1];
                        gestore[i + 1] = null;
                        break;
                    }
                    else if (i == 1 && contrattiVenduti == 3) {
                        gestore[i] = gestore[i + 1];
                        gestore[i + 1] = null;
                        break;
                    }
                    else if (i == contrattiVenduti - 1) {
                        gestore[i] = null;
                        break;
                    }
                }
            }
        } else {
            System.out.println("Inserire il nome: ");
            utente.nome = keyboard.nextLine();
            System.out.println("Inserire il cognome: ");
            utente.cognome = keyboard.nextLine();

            for (int i = 0; i < contrattiVenduti; i++) {
                if (utente.nome.equals(gestore[i].nome) && utente.cognome.equals(gestore[i].cognome)) {
                    if (i == 0 && contrattiVenduti > 1) {
                        gestore[i] = gestore[i + 1];
                        gestore[i + 1] = null;
                        break;
                    }
                    else if (i == 1 && contrattiVenduti == 3) {
                        gestore[i] = gestore[i + 1];
                        gestore[i + 1] = null;
                        break;
                    }
                    else if (i == contrattiVenduti - 1) {
                        gestore[i] = null;
                        break;
                    }
                }
            }
        }

        return utente;
    }
}
