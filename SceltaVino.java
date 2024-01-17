import java.util.Scanner;
public class Vinaio {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int bottles;
        bottles=0;
        int vat;
        vat = 21;
        double cost;
        cost=0;
        double litres;
        double SumVat;
        double total;
        int choice;
        choice = 0;
        boolean answer;
        answer = false;
        boolean cycle;
        cycle = true;
        int counter;
        counter=1;
        
        while(cycle==true) {
            System.out.println("Salve, quale vino vuole?");
            System.out.println("Barbera - 1\n Lugana - 2\n Merlot - 3");
            choice = keyboard.nextInt();

            if (choice == 1) {
                System.out.println("Salve, quanti bottiglioni di Barbera vuole?");
                bottles = keyboard.nextInt();
                System.out.println("Quantita di litri? (Max: 1,5 l)");
                litres = keyboard.nextDouble();
                cost = litres * 1.5;
            }

            if (choice == 2) {
                System.out.println("Salve, quanti bottiglioni di Lugana vuole?");
                bottles = keyboard.nextInt();
                System.out.println("Quantita di litri? (Max: 1,5 l)");
                litres = keyboard.nextDouble();
                cost = litres * 2;
            }

            if (choice == 3) {
                System.out.println("Salve, quanti bottiglioni di Merlot vuole?");
                bottles = keyboard.nextInt();
                System.out.println("Quantita di litri? (Max: 1,5 l)");
                litres = keyboard.nextDouble();
                cost = litres * 1;
            }


            System.out.println("Scontrino: ");
            System.out.println("Hai acquistato " + bottles);
            System.out.println("Costo litri: 1,5 $/l");
            System.out.println();
            SumVat = (vat * cost) / 100;
            System.out.println("IVA applicata: " + SumVat);
            total = (SumVat * bottles) + bottles;
            System.out.println("TOTALE: " + total);

            System.out.println("Sei un nuovo cliente? (true | false)");
            answer = keyboard.nextBoolean();
            if (answer == false) {
                System.out.println("Vuole acquistare ancora? (true | false)");
                answer = keyboard.nextBoolean();
                if (answer == true) {
                    cycle = true;
                } else {
                    cycle = false;
                }
            } else {
                cycle = true;
                counter = counter + 1;
            }
        }
        System.out.println("Clienti di oggi: " + counter);
    }
}