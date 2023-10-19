package me.zegit.testingOnly.thread;

public class MainThread {
    public static void main(String[] args) {
        int month = 2;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:System.out.println("Hiver");

            case 3:
            case 4:
            case 5: System.out.println("Printemps");

            case 6:
            case 7:
            case 8: System.out.println("Été");

            case 9:
            case 10:
            case 11: System.out.println("Automne");

            default: System.out.println("Mois invalide");
        }

        System.out.println("Le mois numéro " + month );



    }
}
