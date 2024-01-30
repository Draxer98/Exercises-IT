import java.util.Scanner;

public class ContaLettere {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char Currentletter;
        boolean[] print = new boolean[26];
        String word = "";
        String[] letter = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        System.out.println("Inserisci una parola in minuscolo: ");
        word = keyboard.nextLine();

        for (int i = 0; i < print.length; i++) {
            print[i] = true;
        }

        for (int i = 0; i < word.length(); i++) {
            Currentletter = word.charAt(i);

            for (int j = 0; j < letter.length; j++) {
                if (Currentletter == letter[j].charAt(0)) {
                    print[j] = false;
                }
            }
        }

        for (int i = 0; i < print.length; i++) {
            if (print[i] == false) {
                System.out.println(letter[i]);
            }
        }
    }
}