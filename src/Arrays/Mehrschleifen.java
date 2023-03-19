package Arrays;

public class Mehrschleifen {
    public static void main(String[] args) {
        int[][] matrix = {{1}, {2,3}, {4, 5, 6}, {7, 8, 9, 10}};

        int summe = 0;

        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                summe += matrix[i][j];

            }
        }System.out.println(summe);
        summe = 0;
        for (int[] zeile: matrix) {
            for (int element: zeile) {
                summe += element;

            }

        }
        System.out.println(summe);
    }
}
