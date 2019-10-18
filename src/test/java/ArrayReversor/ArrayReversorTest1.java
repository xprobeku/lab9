package ArrayReversor;

import ArrayFlattener.ArrayFlattener;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

/**
 * ArrayReversor Tester.
 *
 * @author <Dios71>
 * @version 1.0
 * @since <pre>Oct 18, 2019</pre>
 */
@RunWith(MockitoJUnitRunner.class)
public class ArrayReversorTest1 {

    @Mock
    private ArrayFlattener flattener;


    /**
     * Method: reverseArray(int[] arr)
     */
    @Test
    public void testReverseArray() {
        int[][] testArray = new int[][]{{1, 3}, {0}, {4, 5, 9}};
        int[] expectedArrMock = new int[]{1, 3, 0, 4, 5, 9};
        int[] expectedArr = new int[]{9, 5, 4, 0, 3, 1};
        when(flattener.flattenArray(testArray)).thenReturn(expectedArrMock);
        ArrayReversor reversor = new ArrayReversor(flattener);
        Assert.assertArrayEquals(expectedArr, reversor.reverseArray(testArray));
        verify(flattener, times(1)).flattenArray(testArray);
    }


} 
