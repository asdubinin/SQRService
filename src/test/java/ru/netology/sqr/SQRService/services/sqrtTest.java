package ru.netology.sqr.SQRService.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class sqrtTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void numSqrt(int expected, int x, int y) {
        searchSqrt count = new searchSqrt();

        int actual = count.rangeNum(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
