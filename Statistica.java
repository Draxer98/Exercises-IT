import java.util.Random;

public class Statistica {
    public static void main(String[] args) {
        int[] frequencies = new int[6];

        int value = 0;
        for (int i = 0; i <= 2100; i++) {
            value = getRandomValue(0, 7);
            // %d means integer variable.
            // %f means float.
            // %s means string.
            // %c means char (character).
            // Printf is used to format the text.
            displayDiceFace(value);
            switch (value) {
                case 1: {
                    frequencies[0]++;
                    break;
                }
                case 2: {
                    frequencies[1]++;
                    break;
                }
                case 3: {
                    frequencies[2]++;
                    break;
                }
                case 4: {
                    frequencies[3]++;
                    break;
                }
                case 5: {
                    frequencies[4]++;
                    break;
                }
                case 6: {
                    frequencies[5]++;
                    break;
                }
            }
            if (i == 100) {
                for (int index = 0; index < i; index++) {
                    System.out.println("Face" + (index + 1) + "=" + frequencies[index]);
                }
            }
        }
    }

    private static int getRandomValue(int minValue, int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue - minValue) + minValue;
    }

    private static void displayDiceFace(int faceValue) {
        switch (faceValue) {
            case 1: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 2: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 3: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O      ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║      O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 4: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║         ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 5: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║    O    ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }

            case 6: {
                System.out.println("\t\t\t\t ╔═════════╗");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ║  O   O  ║");
                System.out.println("\t\t\t\t ╚═════════╝");
                break;
            }
        }
    }
}