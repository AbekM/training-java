package com.epam.training.Asilbek_Makhmudov.triangle;


public class Main {
    public static void main(String[] args) {
        {
            double area = new Triangle(new Point(3, 4), new Point(4, 7), new Point(6, -3)).area();
            System.out.println(area);
        }
        {
            Point centroid = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 3)).centroid();

            System.out.println(centroid.getX());
            System.out.println(centroid.getY());
        }
    }
}
