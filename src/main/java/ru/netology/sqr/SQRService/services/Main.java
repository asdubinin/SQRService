package ru.netology.sqr.SQRService.services;

public class Main {

    public static void main(String[] args) {

        searchSqrt service = new searchSqrt();
        System.out.println(service.rangeNum(200, 300));
    }
}