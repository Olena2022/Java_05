import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;


public class AreNumbersEqualTest {

    /**
     * Test Data:
     * 89, 89
     *  Expected result: 0
     *  -89, 89
     *  Expected result: -1
     *   89, -89
     *  Expected result: 1
     */

    // 1. Positive testing Happy path
    // if num = num2;
    //return 0;
    @Test
    public void testNumEqualNum2_HappyPath() {
        //AAA
        //arrange
        int num = 89;
        int num2 = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num, num2);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    // 2. Positive testing Happy path
    // if num < num2;
    //return -1;
    @Test
    public void testNumLessThenNum2_HappyPath() {
        //AAA
        //arrange
        int num = -89;
        int num2 = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num, num2);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    // 3. Positive testing Happy path
    // if num > num2;
    //return 1;
    @Test
    public void testNumMoreThenNum2_HappyPath() {
        //AAA
        //arrange
        int num = 89;
        int num2 = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(num, num2);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}







