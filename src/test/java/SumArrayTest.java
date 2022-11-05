import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.SumArray;


public class SumArrayTest {

    // 1. Positive testing Happy path
    // if (numArray != null))
    // return sumArray;

    @Test
    public void testSumPos_HappyPath() {
        //AAA
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testSumNeg_HappyPath() {
        //AAA
        //arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
