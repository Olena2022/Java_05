package project_utils;

public class BiggerValue {
    /**
     * 4
     * Напишите алгоритм BiggerValue, который из двух параметров
     * типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int biggerValue(int num, int num2) {
        if (num >= num2) {

            return num;
        } else {

            return num2;

        }
    }
}