
import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTest{

    @Test
    public void twoSumTest()
    {

        int[] input = {2,7,11,15};
        int target = 12;
        int[] expected = {0, 1};
        assertArrayEquals(expected, SkillDemo.twoSum(input, target));
    
    }

}