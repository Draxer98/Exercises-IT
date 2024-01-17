import java.util.Scanner;
public class Cronometro {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String start = "No";
        int second = 0;
        int minute = 0;

        System.out.print("The stopwatch goes up to 60 minutes");
        System.out.print("Write 'Yes' to start: ");
        start = keyboard.nextLine();

        ClrScr();

        for (int i=0; i<=3600; i++) {

            if(second==60) {
                second = 0;
                minute= minute +1;
                System.out.println(minute + ".0");
                ClrScr();
                Wait();
            } else {
                second = second + 1;
                System.out.println(minute + "." + second);
                ClrScr();
                Wait();
            }
        }
    }

    private static void Wait() {
        try {
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
