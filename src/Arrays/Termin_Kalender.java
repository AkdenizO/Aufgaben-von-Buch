package Arrays;


import java.util.Scanner;

public class Termin_Kalender {
    public static void main(String[] args) {
        String[][] termine = new String[31][];
        for (int i = 0; i < termine.length; i++) {
            termine[i] = new String[24];
            for (int j = 0; j < termine[i].length ; j++) {
                termine[i][j] = "";
            }
        }
        int uhr = 0;
        int tag = 0;

        boolean fertig = false;


        while (!fertig){
            int auswahl = Methods.tryCatchAuswahl();
            Scanner input = new Scanner(System.in);

            System.out.println(auswahl);

            boolean istfehler = false;
            switch (auswahl){
                case 1:

                    tag = Methods.tryCatchTag();
                    uhr = Methods.tryCatchUhr();

                    System.out.print("Termin: ");
                    String eingabe = input.nextLine();
                    termine[tag - 1][uhr] = eingabe;
                    break;
                case 2:
                    tag = Methods.tryCatchTag();

                    for (int i = 0; i <termine[tag - 1].length ; i++) {
                        System.out.println(i + " uhr: " + termine[tag - 1][i]);
                    }break;
                case 3:
                    fertig = true;
                    break;
                default:
                    System.out.println("Eingabefehler::");
            }
        }



    }

}
