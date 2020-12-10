package test;

import io.ayers.CustomMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomMathTest {

    @Test
    public void sum_with3numbers() {
        var math = new CustomMath();
        var sum = math.sum(new int[] {1,2,3});
        assertEquals(sum, 6);
    }
}
