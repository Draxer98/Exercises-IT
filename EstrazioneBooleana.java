import java.util.Random;
public class EstrazioneBooleana {
    public static void main(String[] args) {
        boolean[] numbers= new boolean[89];
        int[] numbersDrawn= new int[5];
        int number=0;
        for(int i=0; i<=4; i++) {
            number = valoreRandom(1, 91);
            number--;
            if (numbers[number] == false) {
                while (numbers[number] != false) {
                    number = valoreRandom(1, 91);
                }
                numbers[number]=true;
            }
            if(numbers[number]==true) {
                numbersDrawn[i]=number;
                System.out.print(numbersDrawn[i] + " ");
            }
        }
    }
    private static int valoreRandom(int minValue, int maxValue)
    {
        Random casual = new Random();
        return  casual.nextInt(minValue,maxValue)+1;
    }
}