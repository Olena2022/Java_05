import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;
import project_utils.IntegerM;

public class IntegerMTest {

    /**
     * Test Data:
     *  If M is multiple of 7 and 9 then return "Good Number".
     *      * If M is only multiple of 9 and not of 7  then return "Bad Number"
     *      * If M is only multiple of 11 then return "Poor Number"
     *      * If M doesn't satisfy any of the above conditions then return "-1"
     */

    // 1. Positive testing Happy path
    // if M is multiple of 7 and 9
    // return "Good Number";

    @Test
    public void testMultiple7And9_HappyPath() {
        //AAA
        //arrange
        int m = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new IntegerM().integerM(m);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
// 2. Positive testing Happy path
    // if M is multiple of 9 not of 7
    // return "Bad Number";

    @Test
    public void testMultiple9AndNot7_HappyPath() {
        //AAA
        //arrange
        int m = 99;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new IntegerM().integerM(m);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // 3. Positive testing Happy path
    // if M is multiple of 11
    // return "Poor Number";

    @Test
    public void testMultiple11_HappyPath() {
        //AAA
        //arrange
        int m = 11;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new IntegerM().integerM(m);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
// 4. Positive testing Happy path
    // doesn't satisfy any of the above conditions
    // return "-1";

    @Test
    public void testNoConditions_HappyPath() {
        //AAA
        //arrange
        int m = 1;
        String expectedResult = "-1";

        //act
        String actualResult = new IntegerM().integerM(m);
        ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }




















}
