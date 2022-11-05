import project_utils.Utils;
import java.sql.SQLOutput;
import java.util.Locale;


public class StringMethods {

    /**
     * 1
     * Написать метод removeSpaces(), который принимает на вход строку.
     * Если строка не пустая (проверить методом класса String),
     * то примените метод по удалению пробелов в начале и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы
     * в строке.
     * Если пробелы были, то метод должен удалить их и вернуть
     * сообщение: “Лишние пробелы удалены”.
     * <p>
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая (проверить методом класса String),
     * вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public String removeSpaces(String text) {
        if (text.length() > 0) {
            if (text.charAt(0) == ' ' || text.charAt(text.length() - 1) == ' ') {
                text.trim();

                return "Лишние пробелы удалены";
            }
            return "Пробелов не было";

        }
        return "Строка пустая";
    }

    /**
     * 2
     * Написать алгоритм removeAllAs().
     * С помощью методов из видео1,  написать алгоритм, который принимает
     * на вход строку. Если строка валидная, то метод удаляет все
     * буквы a из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * <p>
     * Test Data:
     * “    Red Rover School   “ →  “Red Rover School“
     * “panda   “ → “pnd”
     * “taramasalata” → “trmslt”
     */

    public String removeAllAs(String text) {

        if (!text.isEmpty()) {

            return text.replace("a", "").trim();
        }
        return "Строка пустая";

    }

    /**
     * 3
     * Написать алгоритм removeAllZeros().
     * С помощью методов из видео1,  написать алгоритм, который принимает
     * на вход строку, состоящую из цифр.
     * <p>
     * Если строка валидная,
     * то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку, в которой нет нулей.
     * Если в строке не было нулей, метод возвращает
     * сообщение “This is a valid string”.
     * <p>
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    public String removeAllZeros(String text) {
        if (!text.isEmpty()) {
            if (!text.contains("0")) {

                return "This is a valid string";

            } else if (text.contains("0")) {

            }
            return text.replace("0", "").trim();

        }
        return "Строка пустая";

    }

    /**
     * 4
     * Написать алгоритм removeAllSpaces.
     * С помощью методов из видео1,  написать алгоритм, который принимает
     * на вход строку.
     * Если строка валидная, то метод удаляет все пробелы
     * из строки, если таковые имеются. Метод возвращает обработанную строку.
     * <p>
     * Test Data:
     * “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    public String removeAllSpaces(String text) {
        if (!text.isEmpty()) {

            return text.replace(" ", "");
        }

        return "Строка пустая";
    }

    /**
     * 5
     * Напишите метод countAs(), который принимает на вход строку и считает,
     * сколько букв а или А содержится в строке.
     * Метод возвращает
     * количество букв a/A,  и количество букв/знаков в слове без букв a/A.
     * Итоговый результат должен строится с помощью метода из видео 2.
     * <p>
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */

    public String countAs(String text) {
        if (text != null) {
            if (!text.isEmpty()) {
                text = text.trim().toLowerCase();
                int counter = 0;
                int counter2 = 0;

                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == ('a')) {
                        counter += 1;
                    } else {
                        counter2 += 1;
                    }
                }
                if (counter + counter2 == text.trim().length()) {

                    return String.valueOf(counter).concat(", ").concat(String.valueOf(counter2));
                }
            }
            return "Invalid value";
        }
        return "null";
    }
    /**
    * 6
    * Напишите метод countJava(), который принимает на вход текст и проверяет,
     * содержится ли в тексте хотя бы одно слово Java.
     *
    * Test Data:
    * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8
     * are the current long-term support (LTS) versions. Oracle released
     * the last zero-cost public update for the legacy version Java 8 LTS in
     * January 2019 for commercial use, although it will otherwise still support
     * Java 8 with public updates for personal use indefinitely. Other vendors have
     * begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving
     * security and other upgrades.” → true
    * <p>
    * “99 little bugs in a code.
    * 99 little bugs in a code.
     * Take one down, and patch it around.
    * 235 critical bugs in the code.” → false
    */



/** 7
 * Напишите метод insertQuotes(), который принимает слово и возвращает строку,
 * в которой это слово “обернуто” в кавычки:
 * Test Data:
 * “Abracadabra” →  ““Abracadabra””
 */
public String insertQuotes(String text) {
    if (text != null) {
        if (!text.isEmpty()) {
            return text. ("");


        }
        return "null";
    }
}

/**
 *  8
 */

public static String printName (String str) {
    if (!str.trim().isEmpty() && !str.trim().isBlank()) {
        // remove punctuation and leading and trailing whitespaces
        str = str.replaceAll("\\p{Punct}","").trim();
        String [] nameArray = str.split(" ");
        // New array of keywords;
        String [] firstMiddleLastArr = {"First name: ", "Middle name: ", "Last name: "};
        // result string for name
        String personalData = "";
        for (int i = 0; i < firstMiddleLastArr.length; i++) {
            if (nameArray.length > i) {
                personalData += firstMiddleLastArr[i] + nameArray[i] + "\n";
            } else {
                personalData += firstMiddleLastArr[i] + "" + "\n";
            }
        }
        return personalData;
    }
    return "String is empty or blank";
}

/**
 *
 */
public String personalData(String sentence) {
    if (sentence == null) {
        return null;
    }
    if (sentence.isEmpty()) {
        return "Sentence is empty";
    }
    String[] array = sentence.split(" ");
    return "Имя: " + array[0] + "\nОтчество: " + array[1] + "\nФамилия: " + array[2] + "";
}





/**
 * 9
 */

    public String insertQuotesInDirectSpeech(String text1, String text2) {
        if (text1 != null && text2 != null && !text1.trim().isEmpty() && !text2.trim().isEmpty()) {
            if (text1.contains("писал") && text1.lastIndexOf("писал") == text1.indexOf("писал")
                    || (text1.trim().contains("U+00AB") && text1.trim().contains("U+00BB"))) {
                return text1.trim()
                        .concat(": ")
                        .concat("\"")
                        .concat(text2.trim())
                        .concat("\"")
                        .replace("U+00AB", "\"")
                        .replace("U+00BB", "\"");
            } else {
                return text2.trim()
                        .concat(": ")
                        .concat("\"")
                        .concat(text1.trim())
                        .concat("\"")
                        .replace("U+00AB", "\"")
                        .replace("U+00BB", "\"");
            }
        }
        return "String is empty";
    }
}



