package project_utils;

public class SumArray {

    /**
     * 3
     * Написать алгоритм SumArray, который возвращает сумму
     * всех чисел массива
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     * {-7, -3} → -10
     */

    public int sumArray(int[] array) {
//        int sum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//
//            sum += i;
//        }
//        return sum;
//    }
//}


        if (array != null) {
            int result = 0;

            for (int i : array) {
                result += i;
            }

            return result;
        }

        return 0;
    }
}