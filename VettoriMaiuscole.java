import java.util.Scanner;
public class VettoriMaiuscole {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char lettera=0;
        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "J", "L", "M",
                "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",};
        String frase="";
        System.out.println("Inserisci una frase: ");
        frase=keyboard.nextLine();
        String[] parole = frase.split(" ");

        for(int i = 0; i < parole.length; i++) {
            for(int j = 0; j < alfabeto.length; j++) {
                if(parole[i].contains(alfabeto[j])) {
                    System.out.println(parole[i]);
                    break;
                }
            }
        }
    }
}

