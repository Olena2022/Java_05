package project_utils;

public class AreNumbersEqual {
    /**
     * 6
     * Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
     * 0, если числа равны
     * -1, если первое число меньше второго
     * 1, если первое число больше второго
     * <p>
     * Test Data:
     * 89, 89
     * Expected result: 0
     * -89, 89
     * Expected result: -1
     * 89, -89
     * Expected result: 1
     */

    public int areNumbersEqual(int num, int num2) {
        if (num == num2) {

            return 0;
        } else if (num < num2) {

            return -1;
        } else {

            return 1;
        }


    }

}
