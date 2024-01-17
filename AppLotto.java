import java.util.Random;
import java.util.Scanner;
public class AppLotto {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] numbers = new int[5];
        int value = 0;
        int[] menu = new int[3];
        int choice = 0;

        do {

            Menu();

            do {
                choice = keyboard.nextInt();
            } while (choice < 0 || choice > 2);

            Wait();
            ClrScr();

            menu[choice] = choice;

            if (menu[choice] == 0) {
                for (int i = 0; i <= 4; i++) {
                    value = Random(1, 91);
                    for (int j = 0; j <= 4; j++) {
                        if (value == numbers[j]) {
                            value = Random(1, 91);
                        }
                    }
                    numbers[i] = value;
                }
            }
            if(menu[choice]== 1) {
                for (int i = 0; i <= 4; i++) {
                    Wait();
                    System.out.println(numbers[i]);
                }
            }

        } while(choice!=2);
    }
    private static int Random(int minValue, int maxValue) {
        Random random = new Random();

        return  random.nextInt(minValue, maxValue);
    }
    private static void Menu() {
        System.out.println("           == APPLOTTO ==           ");
        System.out.println("                                    ");
        System.out.println(" [0] - Estrazione ruota Venezia     ");
        System.out.println(" [1] - Visualizzazione ruota Venezia");
        System.out.println(" [2] - Exit                         ");
        System.out.println("                                    ");
        System.out.println("           ==============           ");
    }
    private static void Wait() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

