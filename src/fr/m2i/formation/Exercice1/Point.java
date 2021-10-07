package fr.m2i.formation.Exercice1;

public class Point {
    private double x;
    private double y;

    //region constructor
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //endregion

    //region getters
    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
    //endregion

}