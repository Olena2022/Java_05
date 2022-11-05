package project_utils;

public class OddIndices {

    /* 2
    Написать алгоритм OddIndices, который принимает массив целых чисел,
    и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
     */

    public int[] oddIndices(int[] array1) {
        if (array1 != null && array1.length > 0) {
            int j = 0;

            int[] newArray2 = new int[array1.length / 2]; // если индексы нужны будут четные

            for (int i = 1; i < array1.length; i += 2) { // то длина = int[] newArray=new int [array.length
                newArray2[j] = array1[i]; // начинать int i=0.
                j++;
            }
            return newArray2;
        }
        return new int[0];

    }
}
