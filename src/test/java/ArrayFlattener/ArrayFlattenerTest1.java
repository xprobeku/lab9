package ArrayFlattener;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Main Tester.
 *
 * @author <Dios71>
 * @version 1.0
 * @since <pre>Oct 18, 2019</pre>
 */
public class ArrayFlattenerTest1 {
    private ArrayFlattener flattener;

    @Before
    public void before() {
        flattener = new ArrayFlattener();
    }

    /**
     * Method: flattenArray(int[][] arr)
     */
    @Test
    public void testFlattenArray() {
        int[] expectedArr = new int[]{1, 3, 0, 4, 5, 9};
        int[][] testArray = new int[][]{{1, 3}, {0}, {4, 5, 9}};
        Assert.assertArrayEquals(expectedArr, flattener.flattenArray(testArray));

    }
}
