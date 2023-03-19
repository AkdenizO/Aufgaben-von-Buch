package Arrays;

public class ForschleifeNotation {
    public static void main(String[] args) {
        int[] werte ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Traditoonelle Schleifen Notation
        int summe = 0;
        for (int i = 0; i < werte.length; i++) {
            summe += werte[i];

        }
        System.out.println(summe);

        // Vereinfachte For notation
        for (int x: werte) {
            summe += x;

        }
        System.out.println(summe);
    }
}
