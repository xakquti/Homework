package com.company;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point another) { // метод ищет расстояние между двумя точками
        return Math.sqrt(Math.pow((this.x - another.x), 2) + Math.pow((this.y - another.y), 2));
    }

    public Point middle(Point another) { // метод ищет середину отрезка между двумя точками
        Point result = new Point(0, 0);
        result.x = (this.x + another.x) / 2;
        result.y = (this.y + another.y) / 2;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
