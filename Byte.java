import java.util.Scanner;
public class Byte {
    public static void main(String[] args) {

        Scanner Keyboard= new Scanner(System.in);

        String number= "";
        boolean flagByte= true;
        int counter=0;

        System.out.println("Enter a byte in binary code: ");
        number = Keyboard.nextLine();

        if (number.length() != 8) {
            System.out.println("It's not a byte");
        } else {
            for (int index=0; index < number.length(); index++) {
                System.out.println(number.charAt(index));

                if (number.charAt(index) == '1' || number.charAt(index) == '0') {
                    flagByte = false;
                } else {
                    counter = 1;
                }
            }

            if(flagByte==false && counter==0) {
                System.out.println("It's a Byte");
            } else {
                System.out.println("It's not a byte");
            }
        }
    }
}