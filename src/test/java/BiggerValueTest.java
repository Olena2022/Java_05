import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;
import project_utils.OddEven;

public class BiggerValueTest {

    /**
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    //

    // 1. Positive testing Happy path
    // if num = 3333;
    //return -1;
    @Test
    public void testNumMoreThanNum2_HappyPath() {
        //AAA
        //arrange
        int num = 3333;
        int num2 = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(num, num2);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
