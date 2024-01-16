import java.util.Random;
public class Lotto {
    public static void main (String[] args) {
        int [] numbers  = new int[5];
        int value=0;

        System.out.println("Numeri al lotto - Venezia");
        for(int i=0; i<=4; i++) {
            value= Random(1, 91);
            for(int j=0; j<=4; j++) {
                if(value==numbers[j]) {
                    value= Random(1, 91);
                }
            }
            numbers[i]= value;
            System.out.println(numbers[i]);
        }

    }
    private static int Random(int minValue, int maxValue) {
        Random random = new Random();

        return  random.nextInt(minValue, maxValue);
    }
}