package com.epam.training.Asilbek_Makhmudov.figures;

public class Main {
    public static void main(String[] args) {
        Point area;

      /*  area = new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);*/

        area = new Quadrilateral(new Point(6, 0), new Point(2, 1), new Point(1, 2), new Point(0, 1)).leftmostPoint();
        System.out.println(area.x);


       /* area = new Circle(new Point(1, 1), 3).area();
        System.out.println(area);*/

    }
}
