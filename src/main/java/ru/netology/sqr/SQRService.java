package ru.netology.sqr;

public class SQRService {
    public int calcSqrs(int lowerLimit, int higherLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i > lowerLimit && i * i < higherLimit) {
                counter++;
            }
        }
        return counter;
    }
}
