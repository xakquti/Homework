package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Example ex1 = new Example();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Рациональная дробь
        NDrob frac1 = new NDrob();
        NDrob frac2 = new NDrob();

        frac1.setNumer(sc.nextInt());
        frac1.setDenom(sc.nextInt());
        frac2.setNumer(random.nextInt(20));
        frac2.setDenom(random.nextInt(20));

        System.out.println(frac1);
        System.out.println(frac2);

        System.out.println("Умножение: " + frac1.multy(frac2));
        System.out.println("Деление: " + frac1.div(frac2));
        System.out.println("Сложение: " + frac1.add(frac2));
        System.out.println("Вычитание: " + frac1.sub(frac2));
        System.out.println("Целая часть: " + frac1.wholePart());
        System.out.println("Целая часть: " + frac2.wholePart());

        System.out.println("------------------------------------------------------------");
        // Точка на плоскости
        Point p1 = new Point(5, 7);
        Point p2 = new Point(3, 4);

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p1.middle(p2));
    }
}

















