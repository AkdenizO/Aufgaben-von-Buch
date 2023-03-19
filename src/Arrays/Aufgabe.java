package Arrays;

public class Aufgabe {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        boolean felderSindGleich = true;
        if (a.length != b.length){
            felderSindGleich = false;
        }
        if (felderSindGleich){
            for (int i = 0; i <a.length; i++) {
                if (a[i] != b[i]){
                    felderSindGleich = false;
                    break;
                }

            }
        }
        System.out.println(felderSindGleich);


    }
}
