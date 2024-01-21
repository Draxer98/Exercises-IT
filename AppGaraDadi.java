import java.util.Scanner;
import java.util.Random;
public class AppGaraDadi {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int[] dice = new int[4];
        int choice;
        do {
            do {
                Menu();
                choice = keyboard.nextInt();
                ClrScr();

            } while (choice < 1 || choice > 3);

            dice[choice] = choice;

            if (dice[choice] == 1) {
                Choice1();
            }
            if(dice[choice]==2) {
                Choice2();
            }
        } while (choice!=3);
    }


    private static void Menu() {
        System.out.println("=== APP Gara Dadi ===");
        System.out.println("[1]-Sfida tra due giocatori");
        System.out.println("[2]-Sfida contro il computer");
        System.out.println("[3]-Fine");
    }
    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void Wait() {
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void Wait2() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void Choice1(){
        Scanner keyboard = new Scanner(System.in);
        Random faccia = new Random();
        int valoreFaccia=0;
        int giocatore1=0;
        int giocatore2=0;

        for(int i = 1; i <= 7; i++){
            if (i == 7) {
                Wait();
                ClrScr();
                valoreFaccia = faccia.nextInt(1, 7);
                FacceDado(valoreFaccia);
                giocatore1=valoreFaccia;
                System.out.println("Al giocatore 1 e' uscito: " +giocatore1);
            } else {
                Wait();
                ClrScr();
                valoreFaccia = i;
                FacceDado(valoreFaccia);
            }
        }

        Wait2();
        ClrScr();

        for(int i = 1; i <= 7; i++){
            if (i == 7) {
                Wait();
                ClrScr();
                valoreFaccia = faccia.nextInt(1, 7);
                FacceDado(valoreFaccia);
                giocatore2=valoreFaccia;
                System.out.println("Al giocatore 2 e' uscito: " +giocatore2);
            } else {
                Wait();
                ClrScr();
                valoreFaccia = i;
                FacceDado(valoreFaccia);
            }
        }

        Wait2();
        ClrScr();

        if(giocatore1==giocatore2) {
            System.out.println("Giocatore1: " +giocatore1);
            System.out.println("Giocatore2: " +giocatore2);
            System.out.println("PARITA'");
        } else {
            if(giocatore1>giocatore2) {
                System.out.println("Giocatore1: " +giocatore1);
                System.out.println("Giocatore2: " +giocatore2);
                System.out.println("HA VINTO GIOCATORE 1");
            } else {
                System.out.println("Giocatore1: " +giocatore1);
                System.out.println("Giocatore2: " +giocatore2);
                System.out.println("HA VINTO GIOCATORE 2");
            }
        }
        ClrScr();
    }
    private static void Choice2() {
        Scanner keyboard = new Scanner(System.in);
        Random faccia = new Random();
        int valoreFaccia=0;
        int giocatore1=0;
        int computer=0;

        for(int i = 1; i <= 7; i++){
            if (i == 7) {
                Wait();
                ClrScr();
                valoreFaccia = faccia.nextInt(1, 7);
                FacceDado(valoreFaccia);
                giocatore1=valoreFaccia;
                System.out.println("Al giocatore e' uscito: " +giocatore1);
            } else {
                Wait();
                ClrScr();
                valoreFaccia = i;
                FacceDado(valoreFaccia);
            }
        }
        Wait2();
        ClrScr();

        for(int i = 1; i <= 7; i++){
            if (i == 7) {
                Wait();
                ClrScr();
                valoreFaccia = faccia.nextInt(1, 7);
                FacceDado(valoreFaccia);
                computer=valoreFaccia;
                System.out.println("Al computer e' uscito: " +computer);
            } else {
                Wait();
                ClrScr();
                valoreFaccia = i;
                FacceDado(valoreFaccia);
            }
        }
        if(giocatore1==computer) {
            System.out.println("Giocatore1: " +giocatore1);
            System.out.println("Giocatore2: " +computer);
            System.out.println("PARITA'");
        } else {
            if(giocatore1>computer) {
                System.out.println("Giocatore1: " +giocatore1);
                System.out.println("Giocatore2: " +computer);
                System.out.println("HA VINTO GIOCATORE 1");
            } else {
                System.out.println("Giocatore1: " +giocatore1);
                System.out.println("Giocatore2: " +computer);
                System.out.println("HA VINTO GIOCATORE 2");
            }
        }
        ClrScr();
    }
    private static void FacceDado(int valoreFaccia) {

        //ALT + 201 ╔
        //ALT + 188 ╝
        //ALT + 187 ╗
        //ALT + 200 ╚
        //ALT + 205 ═
        //ALT + 186 ║

        switch (valoreFaccia) {
            case 1 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 2 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 3 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 4 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 5 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 6 : {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
        }
    }
}
