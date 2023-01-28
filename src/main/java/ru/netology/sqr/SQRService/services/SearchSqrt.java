package ru.netology.sqr.SQRService.services;

public class SearchSqrt {

    public int rangeNum(int downRange, int upperRange) {
        int n = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = downRange; j <= upperRange; j++) {
                if (i * i == j) {
                    n = n + 1;
                }
            }
        }
        return n;
    }

}






