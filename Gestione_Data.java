import java.util.Scanner;

public class Gestione_Data {
    public static void main(String[] args) {
        int data = 0;
        String nomeMese=" ";
        int[] data1 = new int[8];
        data = VerificaData(data);
        GiornoMeseAnno(data, data1);
        StampaData(data1);
        MeseParola(data1, nomeMese);
    }
    private static int VerificaData(int data) {
        Scanner keyboard = new Scanner(System.in);
        int verifica;
        int contatore;
        do {
            System.out.println("Inserisci una data (ggmmaaaa): ");
            System.out.println("Se il giorno è compreso da 01 e 09, inserire solo il numero senza lo zero");
            data = keyboard.nextInt();
            verifica = data;
            contatore = 0;
            while (verifica > 0) {
                verifica /= 10;
                contatore++;
            }
            if (contatore!=8 && contatore!=7) {
                System.out.println("Data inserita non valida, riprova");
            }
        } while (contatore != 8 && contatore!=7);
        return data;
    }
    private static int[] GiornoMeseAnno(int data, int[] data1) {
        int verifica = data;
        int resto;
        for (int i = 0; i < data1.length; i++) {
            if (i == 0) {
                resto = verifica % 10;
                data1[i] = resto;
            } else {
                verifica /= 10;
                resto = verifica % 10;
                data1[i] = resto;
            }
            if (resto == 0 && i == 7) {
                data1[i] = resto;
                break;
            }
        }
        return data1;
    }
    private static String MeseParola(int[] data1, String nomeMese) {
        int mese = data1[5] * 10 + data1[4];
        switch (mese) {
            case 1:
                nomeMese = "Gennaio";
                StampaMeseParola(data1, nomeMese);
                break;
            case 2:
                nomeMese = "Febbraio";
                StampaMeseParola(data1, nomeMese);
                break;
            case 3:
                nomeMese = "Marzo";
                StampaMeseParola(data1, nomeMese);
                break;
            case 4:
                nomeMese = "Aprile";
                StampaMeseParola(data1, nomeMese);
                break;
            case 5:
                nomeMese = "Maggio";
                StampaMeseParola(data1, nomeMese);
                break;
            case 6:
                nomeMese = "Giugno";
                StampaMeseParola(data1, nomeMese);
                break;
            case 7:
                nomeMese = "Luglio";
                StampaMeseParola(data1, nomeMese);
                break;
            case 8:
                nomeMese = "Agosto";
                StampaMeseParola(data1, nomeMese);
                break;
            case 9:
                nomeMese = "Settembre";
                StampaMeseParola(data1, nomeMese);
                break;
            case 10:
                nomeMese = "Ottobre";
                StampaMeseParola(data1, nomeMese);
                break;
            case 11:
                nomeMese = "Novembre";
                StampaMeseParola(data1, nomeMese);
                break;
            case 12:
                nomeMese = "Dicembre";
                StampaMeseParola(data1, nomeMese);
                break;
        }
        return nomeMese;
    }
    private static void StampaData(int[] data1) {
        System.out.println("Giorno: " + data1[7] + data1[6]);
        System.out.println("Mese: " + data1[5] + data1[4]);
        System.out.println("Anno: " + data1[3] + data1[2] + data1[1] + data1[0]);
        System.out.println("");
    }
    private static void StampaMeseParola( int[] data1,String nomeMese){
        System.out.println("Giorno: " + data1[7] + data1[6]);
        System.out.println("Mese: " + nomeMese);
        System.out.println("Anno: " + data1[3] + data1[2] + data1[1] + data1[0]);
    }
}