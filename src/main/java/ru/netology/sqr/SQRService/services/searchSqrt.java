package ru.netology.sqr.SQRService.services;

public class searchSqrt {

    public int rangeNum(int x, int y) {
        int n = 0;
        for (int i = 10; i <= 99; i++) {
            for (int j = x; j <= y; j++) {
                if (i * i == j) {
                    n = n + 1;
                }
            }
        }
        return n;
    }

}






