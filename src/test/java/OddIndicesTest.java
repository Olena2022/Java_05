import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;
import project_utils.OddIndices;

public class OddIndicesTest {

    /** 2
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Test
    // 1. Positive testing Happy path
    // Input = {-45, 590, 234, 985, 12, 68}
    // Expected Result =  {590, 985, 68}

    public void testOddIndices_HappyPath() {
        //AAA
        //Arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //Act
        int[] actualResult = new OddIndices().oddIndices(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
