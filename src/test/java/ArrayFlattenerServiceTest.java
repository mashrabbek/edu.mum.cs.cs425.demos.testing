import org.example.service.ArrayFlattenerService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayFlattenerServiceTest {
    private ArrayFlattenerService flattenerService;

    @Before
    public void setUp() {
        flattenerService = new ArrayFlattenerService();
    }

    @Test
    public void testFlatten2DArrayWithNullInput() {
        int[][] inputArray = null;
        int[] result = flattenerService.flattenArray(inputArray);
        assertArrayEquals(null, result);
    }

    @Test
    public void testFlatten2DArrayWithEmptyInput() {
        int[][] inputArray = {};
        int[] result = flattenerService.flattenArray(inputArray);
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void testFlatten2DArrayWithJaggedArray() {
        int[][] inputArray = {
                {1,3},
                {0},
                {4,5,9}
        };
        int[] result = flattenerService.flattenArray(inputArray);
        assertArrayEquals(new int[]{1, 3, 0, 4, 5, 9}, result);
    }
}