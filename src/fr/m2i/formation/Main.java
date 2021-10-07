package fr.m2i.formation;

import fr.m2i.formation.Exercice1.Polygone;
import fr.m2i.formation.Exercice1.Point;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //region declaration
        Point point1 = new Point(1,2);
        Point point2 = new Point(5,3);
        Point point3 = new Point(6,4);
        Point point4 = new Point(7,5);
        Point point5 = new Point(3,6);

        List<Point> listpoints1 = new ArrayList<Point>();
        listpoints1.add(point1);
        listpoints1.add(point2);
        listpoints1.add(point3);
        listpoints1.add(point4);
        listpoints1.add(point5);
        List<Point> listpoints2 = new ArrayList<Point>();
        listpoints2.add(point1);
        Polygone polygone1 = new Polygone(point1 ,listpoints1);
        Polygone polygone2 = new Polygone(point1 ,listpoints2);
        //endregion

        if(polygone1.equals(polygone2))
            System.out.println("meme objet");
        else
            System.out.println("elles ne sont pas pareille.");

        System.out.println("Perimetre "+ polygone1.perimetre());

        try {
            System.out.println("Polygone le plus petit " + plusPetit(polygone1,polygone2));

        } catch ( IOException e) {
            e.getStackTrace();
        }



    }


    /**
     * methode suis calcule le plus petit perimetre de 2 polygone
     * @param poly1
     * @param poly2
     * @return Polygone
     */

    public static Polygone plusPetit(Polygone poly1,Polygone poly2) throws IOException{
        if(poly1.perimetre() > poly2.perimetre()){
            return poly2;
        } else
            return poly1;
    }

    public static Polygone creatCloneModifyPolygone (Polygone poly1) {
        Polygone poly2 = new Polygone(poly1.getCoter().get(0),poly1.getCoter());
        System.out.println("voulais vous suprimer un element ? o : n ");
        return poly1;
    }
}
