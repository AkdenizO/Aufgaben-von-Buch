package Klassen;

import java.net.PortUnreachableException;

public class Student {

    /****************************************
     Konstanten
     *****************************************/
    public static final int MATHEMATIKSTUDIUM = 1;
    public static final int INFORMATIKSTUDIUM = 2;
    public static final int ARCHITEKTURSTUDIUM = 3;
    public static final int WIRTSCHAFTLICHESSTUDIUM = 4;
    public static final int BIOLOGIESTUDIUM = 5;
    public static final int GESICHTESTUDIUM = 6;
    public static final int GERMANISTIKSTUDIUM = 7;
    public static final int POLITOLOGIESTUDIUM = 8;
    public static final int PHYSIKSTUDIUM = 9;

    public static final Student PHANTOM;

    public static final boolean MAEINLICH = true;
    public static final boolean WEIBLICH = false;


    /********************************************
     VARIABLEN
     * *********************************************/
    private static int zaehler = 0;
    private String name = "DummyStudent";
    private int nummer;
    private int fach;
    private int geburtsjahr;

    private boolean geschlecht = true;

    /********************************************
             KONSTRUKTOREN
     * *********************************************/

    public Student(){
        this(1970);
    }

    public Student(int geburtsjahr){
        zaehler++;
        this.geburtsjahr = geburtsjahr;
        this.name = "Namelos";

    }
    public Student(String name, int nummer, int fach, int geburtsjahr, boolean geschlecht){
        this.name = name;
        this.nummer = nummer;
        this.fach = fach;
        this.geburtsjahr = geburtsjahr;
        this.geschlecht = geschlecht;

    }
    public Student(int geburtsjahr, boolean geschlecht){
        this(geburtsjahr);
        this.geschlecht = geschlecht;
    }



    /**********************************************
            GETTER // SETTER
    **********************************************/

    public String getName(){
        return name;
    }
    public int getNummer(){
                return nummer;
    }
    public int getFach(){
        return fach;
    }
    public int getGeburtsjahr(){
        return geburtsjahr;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNummer(int nummer){
        int alteNummer = this.nummer;
        this.nummer = nummer;
        if (!validateNummer()){
            this.nummer = alteNummer;
        }

    }
    public void setFach(int fach){
        this.fach = fach;
    }

    public boolean validateNummer(){
        return (nummer >= 10_000 && nummer <= 99_999 && nummer % 2 == 1 );
    }

    public String toString(){
        String result = name + " (" + nummer + ")\n";
        if (geschlecht)
            result += " (m) ";
        else
            result += " (w) ";


        switch (fach){
            case MATHEMATIKSTUDIUM:
                return result + " studiert Mathematik.";
            case INFORMATIKSTUDIUM:
                return result + " studiert Informatik.";
            case ARCHITEKTURSTUDIUM:
                return result + " studiert Architaktur.";
            case WIRTSCHAFTLICHESSTUDIUM:
                return result + " studiert Wirtschaft.";
            case BIOLOGIESTUDIUM:
                return result + " studiert Biologie.";
            case GESICHTESTUDIUM:
                return result + " studiert Geschichte.";
            case GERMANISTIKSTUDIUM:
                return result + " studiert Germanistik.";
            case POLITOLOGIESTUDIUM:
                return result + " studiert Politologi.";
            case PHYSIKSTUDIUM:
                return result + " studiert Physik.";
            default:
                return result + " frag sich, was er studieren soll.";
        }
    }

    public static int getZaehler(){
        return zaehler;
    }

    public static Student createStundent(){
        return new Student();
    }

    static {
        PHANTOM = new Student(1735);
        PHANTOM.name = "Erik le Phant";
        PHANTOM.nummer = -12345;
        zaehler = 0;
    }



}