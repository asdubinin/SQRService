package ru.netology.sqr.SQRService.services;

public class Main {

    public static void main(String[] args) {

        SearchSqrt service = new SearchSqrt();
        System.out.println(service.rangeNum(200, 300));
    }
}