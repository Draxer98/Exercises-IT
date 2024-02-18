import java.util.Random;
public class TreConsecutivi {
    public static void main(String[] args){
        int contatore=0;
        int numeriEstratti;
        int[] numeri = new int[9];

        for(int i=0; i< numeri.length; i++){
            numeri[i]= Random(1, 999);
        }

        for(int i=0; i<=6; i++){
            if(numeri[i] == numeri[i+1] && numeri[i] == numeri[i+2]) {
                contatore++;
            }
        }
        if(contatore>=1){
            System.out.println("Tre valori consecutivi uguali");
        } else {
            System.out.println("NO");
        }
    }
    private static int Random(int minValue, int maxValue){
        Random random= new Random();

        return random.nextInt(minValue, maxValue);
    }
}
