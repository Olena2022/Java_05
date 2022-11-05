import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEvenTest {

    /**
     * Test Data:
     * -345 →  “Odd”
     * 0 →  “Even”
     * 222222 →  “Even”
     */

    //

    // 1. Positive testing Happy path
    // if int = -345
    //return "Odd";

    //number % 2 != 0
    @Test
    public void testNumberIsOdd_HappyPath() {
        //AAA
        //arrange
        int num = -345;
        String expectedResult = new OddEven().oddEven(num);

        //act
        String actualResult = "Odd";

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    // 2. Positive testing Happy path
    // if int = 0
    //return "Even";

    //number % 2 == 0
    @Test
    public void testNumberNullIsEven_HappyPath() {
        //AAA
        //arrange
        int num = 0;
        String expectedResult = new OddEven().oddEven(num);

        //act
        String actualResult = "Even";

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 3. Positive testing Happy path
    // if int 222222
    //return "Even";

    //number % 2 == 0
    @Test
    public void testNumberIsEven_HappyPath() {
        //AAA
        //arrange
        int num = 222222;
        String expectedResult = new OddEven().oddEven(num);

        //act
        String actualResult = "Even";

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}