import org.testng.Assert;
import org.testng.annotations.Test;


public class StringMethodsTest {

    /**
     * 1
     * Test Data:
     * “    Red Rover School   “ → “Лишние пробелы удалены”
     * “Red Rover School“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    @Test
    // 1. Positive testing Happy path
    // Input = “    Red Rover School   “
    // Expected Result =  “Лишние пробелы удалены”

    public void test1_HappyPath() {
        //AAA
        //Arrange
        String text = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";

        //Act
        String actualResult = new StringMethods().removeSpaces(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    // 2. Positive testing Happy path
    // Input = “Red Rover School“
    // Expected Result =  “Пробелов не было”

    public void test2_HappyPath() {
        //AAA
        //Arrange
        String text = "Red Rover School";
        String expectedResult = "Пробелов не было";

        //Act
        String actualResult = new StringMethods().removeSpaces(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    // 3. Positive testing Happy path
    // Input = “Red Rover School“
    // Expected Result =  “Пробелов не было”

    public void test3_HappyPath() {
        //AAA
        //Arrange
        String text = "";
        String expectedResult = "Строка пустая";

        //Act
        String actualResult = new StringMethods().removeSpaces(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
//_____________________________________________________________________
    /**
     * 2
     * Test Data:
     * * “    Red Rover School   “ →  “Red Rover School“
     * * “panda   “ → “pnd”
     * * “taramasalata” → “trmslt”
     */

    @Test
    // 1. Positive testing Happy path
    // Input = “    Red Rover School   “
    // Expected Result = “Red Rover School“

    public void test2And1_HappyPath() {
        //AAA
        //Arrange
        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        //Act
        String actualResult = new StringMethods().removeAllAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    // 2. Positive testing Happy path
    // Input = “panda   “
    // Expected Result =  “pnd”

    public void test2And2_HappyPath() {
        //AAA
        //Arrange
        String text = "panda   ";
        String expectedResult = "pnd";

        //Act
        String actualResult = new StringMethods().removeAllAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    // 3. Positive testing Happy path
    // Input = “taramasalata”
    // Expected Result = “trmslt”

    public void test2And3_HappyPath() {
        //AAA
        //Arrange
        String text = "taramasalata";
        String expectedResult = "trmslt";

        //Act
        String actualResult = new StringMethods().removeAllAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    // 4. Positive testing Happy path
    // Input = “”
    // Expected Result = "Строка пустая"
    public void test2And4_HappyPath() {
        //AAA
        //Arrange
        String text = "";
        String expectedResult = "Строка пустая";

        //Act
        String actualResult = new StringMethods().removeAllAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
//_____________________________________________________________________
    /**
     * 3
     * Test Data:
     * “3504209706040000 “ →  “35429764“
     * “0000000111“ → “111”
     */

    @Test
    // 1. Positive testing Happy path
    // Input = “3504209706040000 “
    // Expected Result =  “35429764“

    public void test3And1_HappyPath() {
        //AAA
        //Arrange
        String text = "3504209706040000 ";
        String expectedResult = "35429764";

        //Act
        String actualResult = new StringMethods().removeAllZeros(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    // 2. Positive testing Happy path
    // Input = "0000000111“
    // Expected Result =  “111”

    public void test3And2_HappyPath() {
        //AAA
        //Arrange
        String text = "0000000111";
        String expectedResult = "111";

        //Act
        String actualResult = new StringMethods().removeAllZeros(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    // 3. Positive testing Happy path
    // Input = "“
    // Expected Result =  “Строка пустая”

    public void test3And3_HappyPath() {
        //AAA
        //Arrange
        String text = "123";
        String expectedResult = "This is a valid string";

        //Act
        String actualResult = new StringMethods().removeAllZeros(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    //_____________________________________________________________________
    /**
     * 4
     * Test Data:
     *  “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
     * “p a     n   d a   “ → “panda”
     */

    @Test
    // 1. Positive testing Happy path
    // Input = “    R e d     Ro ve    r Sc   h ool   “
    // Expected Result =   “RedRoverSchool“

    public void test4And1_HappyPath() {
        //AAA
        //Arrange
        String text = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        //Act
        String actualResult = new StringMethods().removeAllSpaces(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    // 2. Positive testing Happy path
    // Input = “p a     n   d a   “
    // Expected Result =   “panda”

    public void test4And2_HappyPath() {
        //AAA
        //Arrange
        String text = "p a     n   d a   ";
        String expectedResult = "panda";

        //Act
        String actualResult = new StringMethods().removeAllSpaces(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    //_____________________________________________________________________
    /**
     * 5
     * Test Data:
     * “Abracadabra” → “5, 6”
     * “Homenum Revelio” → “0, 15”
     * “3 tarAmasAlatA” → “6, 8”
     */

    @Test
    // 1. Positive testing Happy path
    // Input = “Abracadabra”
    // Expected Result = “5, 6”

    public void test5And1_HappyPath() {
        //AAA
        //Arrange
        String text = "Abracadabra";
        String expectedResult = "5, 6";

        //Act
        String actualResult = new StringMethods().countAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    // 2. Positive testing Happy path
    // Input = Homenum Revelio”
    // Expected Result =  “0, 15”

    public void test5And2_HappyPath() {
        //AAA
        //Arrange
        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        //Act
        String actualResult = new StringMethods().countAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    // 3. Positive testing Happy path
    // Input = “3 tarAmasAlatA”
    // Expected Result =  “6, 8”

    public void test5And3_HappyPath() {
        //AAA
        //Arrange
        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        //Act
        String actualResult = new StringMethods().countAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    // 4. Positive testing Happy path
    // Input = ""
    // Expected Result =  “6, 8”

    public void test5And4_HappyPath() {
        //AAA
        //Arrange
        String text = "";
        String expectedResult = "Invalid value";

        //Act
        String actualResult = new StringMethods().countAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void test5And5_HappyPath() {
        //AAA
        //Arrange
        String text = null;
        String expectedResult = "null";

        //Act
        String actualResult = new StringMethods().countAs(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //_____________________________________________________________________





}
