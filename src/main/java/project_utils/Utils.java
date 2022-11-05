package project_utils;

import java.util.Arrays;

public class Utils {

    static String line = "===========";
    static String line2 = " ===============================================================\n";
    static String task = " Task ";
    static int taskNumber = 1;
    static int subTask1 = 1;

    public static void printTask() {
        System.out.print(line);
        System.out.print(task);
        System.out.print(taskNumber);
        taskNumber++;
        System.out.println(line2);
    }

    public static void printSubTask() {
        System.out.print(subTask1);
        subTask1++;
        System.out.print(") ");
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            switch (number) {
                case 1:
                    return "Jan";
                case 2:
                    return "Feb";
                case 3:
                    return "Mar";
                case 4:
                    return "Apr";
                case 5:
                    return "May";
                case 6:
                    return "Jun";
                case 7:
                    return "Jul";
                case 8:
                    return "Aug";
                case 9:
                    return "Sep";
                case 10:
                    return "Oct";
                case 11:
                    return "Nov";
                case 12:
                    return "Dec";
            }
        }
        return "Error";
    }

    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {

            switch (number) {
                case 1:
                    return "Mon";
                case 2:
                    return "Tue";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
            }
        }
        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day) {
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case "Thu":
                return 4;
            case "Fri":
                return 5;
            case "Sat":
                return 6;
            case "Sun":
                return 7;
        }

        return 0;
    }


    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);

            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;

        }
    }


    public static int daysInMonth(int month, int year) {
        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                return -1;
        }

        return numDays;
    }


//    public static void printEightDaysFromDate(String day, int month, int date, int year) {
//
//        int currentYear = year; //использовал для метода без агумета year. Для текущего года.
//
//        if (returnDayOfTheWeek(day) == 0 ||
//                returnMonth(month).equals("Error") ||
//                month <= 0 || // лишнее т.к. уже проверяется в returnMonth
//                date <= 0 ||
//                date > (daysInMonth(month, year))) {
//
//            System.out.println("Please enter correct data.");
//
//        } else {
//            int currentDay = returnDayOfTheWeek(day);
//            int currentMonth = month;
//            int currentDate = date;
//// print day
//            for (int i = 0; i <= 7; i++) {
//                if (currentDay != 7) {
//                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
//                    currentDay++;
//                } else {
//                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
//                    currentDay = 1;
//                }
//// print month + date
//                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
//                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
////                    System.out.println(" " + currentYear); //проверка года - закоментить
//                    currentDate++;
//                } else {
//                    if (currentMonth != 12) {
//                        currentMonth++;
//                    } else {
//                        currentMonth = 1;
//                        currentYear = year + 1;
//                    }
//                    currentDate = 1;
//                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
////                    System.out.println(" " + currentYear); //проверка года - закоментить
//                    currentDate++;
//                }
//            }
//        }
//    }


    // Teymur - универсальный метод для построения последовательности, которая начинается с числа start, заканчивается
    // числом end (оба включительно).Все числа в этой последовательности должны быть кратны числу step.Этот метод
    // должен высчитывать первое кратное число в диапазоне[start, end]и строить
    // последовательность(возрастающую или убывающую) от вычисленного первого кратного числа с шагом step.
    public static void returnNumLine(int start, int end, int step) {
        if (step == 0) {
            System.out.println("Error! Enter correct step number");

        } else if (start == end && step != end) {
            System.out.println("Error! Start and end number equals, and entered step don't work ");

        } else {
            int newStart = start - start % step;

            if (start <= end && step > 0) {

                if (newStart < start) {
                    newStart += step;
                }
                for (int i = newStart; i <= end; i += step) {

                    System.out.print(i + " ");
                }

            } else if (start >= end && step > 0) {

                if (newStart > start) {
                    newStart -= step;
                }
                for (int i = newStart; i >= end; i -= step) {

                    System.out.print(i + " ");
                }
            } else if (start <= end) {

                if (newStart < start) {
                    newStart -= step;

                }
                for (int i = newStart; i <= end; i -= step) {

                    System.out.print(i + " ");
                }

            } else {
                if (newStart > start) {
                    newStart += step;
                }
                for (int i = newStart; i >= end; i += step) {

                    System.out.print(i + " ");
                }
            }
        }
    }


    public static void printAverageValue(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];

        }
        System.out.println(sum / args.length);
    }

    public static int printRandomNumbers(int n, int m, int l) {
        int i;
        for (i = 0; i < l; i++) {

            System.out.print(((int) (Math.random() * ((m - n) + 1)) + n) + " ");
        }

        return i;
    }

    public static void doArrayRandom2(int start, int end, int l) {
        int[] arrayRandom = new int[l];
        for (int i = 0; i <= arrayRandom.length - 1; i++) {
            arrayRandom[i] = (int) (Math.random() * ((end - start) + 1) + start);
        }
        System.out.println(Arrays.toString(arrayRandom) + "\n");
    }


//   двумерный(universal) массив случайных чисел (Teymur)

    public static void random2DArray(int indexA, int indexB, int start, int end) {
        int[][] randomArrays = new int[indexA][indexB];
        int range = (end + 1 - start);

        for (int i = 0; i <= indexA - 1; i++) {
            for (int j = 0; j <= indexB - 1; j++) {

                randomArrays[i][i] = (int) (Math.random() * range) + start;
            }
        }
        for (int i = 0; i <= indexA - 1; i++) {

            System.out.println(Arrays.toString(randomArrays[i]));
        }
    }

    public static boolean isStringNotNullAndNotEmpty(String text){
        if (text!=null) {

            return !text.trim().isEmpty();
        }

        return false;
    }

}
