package fr.m2i.formation.Exercice1;
import fr.m2i.formation.Exercice1.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Polygone {
    private static int nbPolygone = 0;
    private List<Point> coter = new ArrayList<Point>();

    //region constructor
    public Polygone(Point point1, List<Point> points1) {
        setNbPolygone();
        for (Point point: points1){
            coter.add(point);
        }
    }
    //endregion

    //region getters et setters

    public int getNbPolygone() {
        return nbPolygone;
    }

    public static void setNbPolygone() {
        Polygone.nbPolygone ++;
    }

    public List<Point> getCoter() {
        return coter;
    }

    public void setCoter(List<Point> coter) {
        this.coter = coter;
    }
    //endregion

    public int getSizeCoter(){
        return this.coter.size();
    }

    public double perimetre(){
        double resultat = 0;

        Point p0 = coter.get(0);
        Point pointPrécédent = p0;

        for (int i = 1; i < this.coter.size(); i++){
            Point pointCourant = this.coter.get(i);
            resultat += Math.hypot(
                    (pointPrécédent.getX() - pointCourant.getX()),
                    (pointPrécédent.getY() - pointCourant.getY()));
            pointPrécédent = pointCourant;
        }
        resultat += Math.hypot(
                (pointPrécédent.getX() - p0.getX()),
                (pointPrécédent.getY() - p0.getY()));

        return resultat;
    }



    @Override
    public String toString() {
        return "Polygone{" +
                "coter=" + coter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polygone)) return false;
        Polygone polygone = (Polygone) o;
        return Objects.equals(coter, polygone.coter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coter);
    }
}