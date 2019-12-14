package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static final double PI = 3.14;
    public static Double sphereSquare(Double r) {
        return 4*PI*r*r;
    }

    public static Double earthSquare() {
        Double r = Double.valueOf(6371.2);
        return sphereSquare(r);
    }

    public static Double mercurySquare() {
        Double r = Double.valueOf(2439.7);
        return sphereSquare(r);
    }

    public static Double jupiterSquare() {
        Double r = Double.valueOf(71492);
        return sphereSquare(r);
    }

    public static Double earthVsMercury() {
        double earth = earthSquare();
        double mercury = mercurySquare();
        return earth / mercury;
    }

    public static Double earthVsJupiter() {
        double earth = earthSquare();
        double jupiter = jupiterSquare();
        return earth / jupiter;
    }

    public static void main(String[] args) {
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();
    }
}
