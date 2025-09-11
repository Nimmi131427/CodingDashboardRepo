import static org.junit.Assert.*;

import exercises.LargestNumber;
import org.junit.Test;

public class LargestNumberTest {

    @Test
    public void testExample1() {
        int[] input = {50, 2, 1, 9};
        assertEquals("95021", LargestNumber.formLargestNumber(input));
    }

    @Test
    public void testExample2() {
        int[] input = {5, 50, 56};
        assertEquals("56550", LargestNumber.formLargestNumber(input));
    }

    @Test
    public void testExample3() {
        int[] input = {420, 42, 423};
        assertEquals("42423420", LargestNumber.formLargestNumber(input));
    }

    @Test
    public void testAllZeros() {
        int[] input = {0, 0, 0};
        assertEquals("0", LargestNumber.formLargestNumber(input));
    }

    @Test
    public void testSingleElement() {
        int[] input = {7};
        assertEquals("7", LargestNumber.formLargestNumber(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals("", LargestNumber.formLargestNumber(input));
    }
}

