package Arrays;

import java.util.Scanner;

public class Methods {
    static int tryCatchAuswahl(){
        Scanner input = new Scanner(System.in);
        int zahl = 0;
        do {
            try {
                System.out.print("1: Neu Einträge \n" +
                        "2: Termini ausgeben \n" +
                        "3: Program beenden \n" +
                        "Ihre Wahl: ");
                String str = input.nextLine();
                zahl = Integer.parseInt(str);
                break;
            }catch (NumberFormatException nfe){
                System.out.println("Fehlerhafte Zahl!");
            }

        }while (true);
        return zahl;
    }
    static int tryCatchUhr(){
        boolean istfehler = false;
        int uhr = 0;
        Scanner input = new Scanner(System.in);
        do {
            istfehler = false;
            try{
                System.out.println("Uhr: ");
                String str1 = input.nextLine();
                uhr = Integer.parseInt(str1);
                if (uhr < 0 || uhr > 23){
                    System.out.println("Eingabefehler!");
                    istfehler = true;
                }
            }catch (NumberFormatException nfe){
                System.out.println("Fehlerhafte Nummer");
                istfehler = true;
            }
        }while (istfehler == true);
        return uhr;

    }
    static int tryCatchTag(){
        boolean istfehler = false;
        int tag = 0;
        Scanner input = new Scanner(System.in);
        do {
            istfehler = false;
            try{
                System.out.println("Welcher Tag: ");
                String str1 = input.nextLine();
                tag = Integer.parseInt(str1);
                if (tag < 1 || tag > 31){
                    System.out.println("Eingabefehler!");
                    istfehler = true;
                }
            }catch (NumberFormatException nfe){
                System.out.println("Fehlerhafte Nummer");
                istfehler = true;
            }
        }while (istfehler == true);
        return tag;
    }

}
