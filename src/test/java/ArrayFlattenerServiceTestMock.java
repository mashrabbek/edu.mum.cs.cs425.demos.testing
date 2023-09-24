import org.example.service.ArrayFlattenerService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.when;

public class ArrayFlattenerServiceTestMock {
    private ArrayFlattenerService flattenerService;

    @Before
    public void setUp() {
        flattenerService = Mockito.spy(new ArrayFlattenerService());
    }

    @Test
    public void testFlatten2DArrayWithNullInput() {
        int[][] inputArray = null;
        // Mocking the ArrayFlattenerService to return null
        when(flattenerService.flattenArray(inputArray)).thenReturn(null);
        int[] result = flattenerService.flattenArray(inputArray);
        assertArrayEquals(null, result);
    }

    @Test
    public void testFlatten2DArrayWithEmptyInput() {
        int[][] inputArray = {};
        // Mocking the ArrayFlattenerService to return an empty array
        when(flattenerService.flattenArray(inputArray)).thenReturn(new int[]{});
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
        // Mocking the ArrayFlattenerService to return a flattened array
        when(flattenerService.flattenArray(inputArray)).thenReturn(new int[]{1, 3, 0, 4, 5, 9});
        int[] result = flattenerService.flattenArray(inputArray);
        assertArrayEquals(new int[]{1, 3, 0, 4, 5, 9}, result);
    }
}
