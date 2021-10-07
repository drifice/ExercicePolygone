package fr.m2i.formation;

public class Utils {

    public static double CONVERSION_KILOMETRE =  1.609;

    /**
     * function qui convertit le nombre de km en miles
     * @param km
     * @return miles
     */
    public static double km_vers_mile(double km) {
        return km * CONVERSION_KILOMETRE;
    }

    /**
     * fonction qui retrouver le plus grand commun divisseur
     * @param a
     * @param b
     * @return resultat
     */
    public  static int pgcd(int a, int b){
        while( b != 0 ) {
            int rest = a % b;
            a = b;
            b = rest;
        }
        return a;
    }

    /**
     * function qui calcule la somme de tout les nombre premier jusqu'a le param n
     * @param n
     * @return resultat
     */
    public static int sumNprem(int n){
        int resultat = 0;
        for (int iterator = 1; iterator <= n; iterator++ ) {
            if(n%iterator == 0){
                resultat += iterator;
            }
        }
        return resultat;
    }
}
