public class PrendiParola {
    public static void main(String[] args){
        String frase="Ciao a tutti";

        ArrayParole(frase);
    }
    private static void ArrayParole(String frase){
        char[] parole= new char[frase.length()];
        int contatore=0;

        for(int i=0; i<parole.length; i++){
                    parole[i]=frase.charAt(i);
        }
        for(int i=0; i<parole.length; i++){
            System.out.print(parole[i]);
        }
    }
}

