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
public class ArrayFlattenerTest2 {
    private ArrayFlattener flattener;

    @Before
    public void before() {
        flattener = new ArrayFlattener();
    }

    @Test(expected = NullPointerException.class)
    public void testFlattenArray() {
        Assert.assertNull(flattener.flattenArray(null));
    }
}
