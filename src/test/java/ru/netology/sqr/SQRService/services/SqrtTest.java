package ru.netology.sqr.SQRService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqrtTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void numSqrt(int expected, int downRange, int upperRange) {
        SearchSqrt count = new SearchSqrt();

        int actual = count.rangeNum(downRange, upperRange);

        Assertions.assertEquals(expected, actual);
    }
}
