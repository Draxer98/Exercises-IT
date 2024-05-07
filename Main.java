public class Main {
    public static void main(String args[]) {
        int[] array = {1, 2, 2, 4, 3, 5, 8, 7, 6, 9};
        int lunghezza = array.length;
        int contaPari = 0;
        int temp = 0;
        int indice = 0;

        for (int i = 0; i < lunghezza; i++) {
            if (array[i] % 2 == 0) {
                contaPari++;
            }
        }

        int contaDispari = lunghezza - contaPari;
        int[] Pari = new int[contaPari];
        int[] Dispari = new int[contaDispari];
        int indexPari = 0;
        int indexDispari = 0;

        for (int i = 0; i < lunghezza; i++) {
            if (array[i] % 2 == 0) {
                Pari[indexPari++] = array[i];
            } else {
                Dispari[indexDispari++] = array[i];
            }
        }

        bubbleSort(Pari);
        bubbleSort(Dispari);

        for (int i = 0; i < contaDispari; i++) {
            array[indice++] = Dispari[i];
        }
        for (int i = 0; i < contaPari; i++) {
            array[indice++] = Pari[i];
        }

        System.out.println("Numeri ordinati come prima consegna: ");
        for (int i = 0; i < lunghezza; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Numeri ordinati come seconda consegna: ");
        for (int i = 0; i < lunghezza - 1; i++) {
            if(array[i]!=array[i+1]){
                System.out.print(array[i] + " ");
                if(i==lunghezza - 2){
                    System.out.println(array[i+1]);
                    break;
                }
            }
        }
    }

    private static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}