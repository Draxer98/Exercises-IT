import java.util.Scanner;
public class SequenzaNumeri {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number;
        float rest;
        int figure1=0;
        int figure2=0;
        int figure3=0;
        int figure4=0;
        int figure5=0;
        int figure6=0;
        int figure7=0;
        int figure8=0;
        int figure9=0;
        int figure0=0;

        System.out.println("Insert a sequence: (Closed by 0)");
        number = keyboard.nextInt();

        if(number!=0) {
            while(number > 0) {
                rest = number % 10;
                number = number / 10;

                if(rest==1) {
                    figure1= figure1 + 1;
                    System.out.println("figure 1: " +figure1);
                }
                if(rest==2) {
                    figure2= figure2 + 2;
                    System.out.println("figure 2: " +figure2);
                }
                if(rest==3) {
                    figure3= figure3 + 1;
                    System.out.println("figure 3: " +figure3);
                }
                if(rest==4) {
                    figure4= figure4 + 1;
                    System.out.println("figure 4: " +figure4);
                }
                if(rest==5) {
                    figure5= figure5 + 1;
                    System.out.println("figure 5: " +figure5);
                }
                if(rest==6) {
                    figure6= figure6 + 1;
                    System.out.println("figure 6: " +figure6);
                }
                if(rest==7) {
                    figure7= figure7 + 1;
                    System.out.println("figure 7: " +figure7);
                }
                if(rest==8) {
                    figure8= figure8 + 1;
                    System.out.println("figure 8: " +figure8);
                }
                if(rest==9) {
                    figure9= figure9 + 1;
                    System.out.println("figure 9: " +figure9);
                }
                if(rest==0) {
                    figure0= figure0 + 1;
                    System.out.println("figure 0: " +figure0);
                }
            }
        } else {
            System.out.println("Closed sequence");
        }
    }
}
