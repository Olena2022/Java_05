import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.IsPositiveNumber;

public class IsPositiveNumberTest {

    //1. Positive testing Happy path
    // if num = 555;
    //return true;

    @Test
    public void testNumPositive_HappyPath() {
        //AAA
        //arrange
        int num = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testNumPositive2_HappyPath() {
        //AAA
        //arrange
        int num = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testNumPositive3_HappyPath() {
        //AAA
        //arrange
        int num = -555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
