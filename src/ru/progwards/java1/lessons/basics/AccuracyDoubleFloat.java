package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static final double radius_double = 6371.2;
    public static final double pi_double = 3.14;
    public static final float pi_float = 3.14f;

    public static double volumeBallDouble(double radius) {
        return 4.0 / 3.0 * pi_double * radius * radius * radius;
    }

    public static float volumeBallFloat(float radius) {
        return (4.0f / 3.0f * pi_float * radius * radius * radius);
    }

    public static double calculateAccuracy(double radius) {
        return volumeBallDouble(radius) - volumeBallFloat((float) radius);
    }

    public static void main(String[] args) {
        volumeBallDouble(radius_double);
        volumeBallFloat((float) radius_double);
        calculateAccuracy(radius_double);
    }
}
