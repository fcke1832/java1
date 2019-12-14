package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int i1 = number/100;
        int i3 = number%10;
        int i2 = number%100 - i3;
        return i3*100 + i2 + i1;
    }

    public static void main(String[] args) {
        reverseDigits(123);
    }
}
