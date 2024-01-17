import java.util.Scanner;
public class MorraCinese {

    public static void main(String[] args) {
        Scanner Keyboard=new Scanner(System.in);

        String num1= "";
        String num2= "";

        do {

            ClrScr();

            do {
                System.out.println("Enter x to finish the game");
                System.out.println("Player 1 - (a = paper, s = rock, d = scissors)");
                num1 = Keyboard.nextLine().toLowerCase();

            } while( !num1.equals("a") && !num1.equals("s") && !num1.equals("d") && !num1.equals("x"));

            ClrScr();

            if(!num1.equals("x")) {
                do {
                    System.out.println("Enter x to finish the game");
                    System.out.println("Player 2 - (j = paper, k = rock, l = scissors)");
                    num2 = Keyboard.nextLine().toLowerCase();
                } while (!num2.equals("j") && !num2.equals("k") && !num2.equals("l") && !num2.equals("x"));


                ClrScr();

                if (!num2.equals("x")) {

                    if ((num1.equals("a") && num2.equals("j")) || ((num1.equals("s") && num2.equals("k")) || (num1.equals("d") && num2.equals("l")))) {
                        System.out.println("Equality");
                    } else
                    {
                        if ((num1.equals("a") && num2.equals("k")) || (num1.equals("s") && num2.equals("l")) || (num1.equals("d") && num2.equals("j"))) {
                            System.out.println("Player 1 won");
                        } else
                        {
                            System.out.println("Player 2 won");
                        //if ((num1.equals("s") && num2.equals("j")) || (num1.equals("d") && num2.equals("k")) || ((num1.equals("a") && num2.equals("l")))) {
                        }
                    }
                }
            }

        } while ( !num1.equals("x") && !num2.equals("x") );

        System.out.println("Game over");

    }
    private static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
