package ArrayFlattener;

import java.util.Arrays;

public class ArrayFlattener {
    public int[] flattenArray(int[][] arr) {
        return Arrays.stream(arr).flatMapToInt(a-> Arrays.stream(a).map(b-> (int) b)).toArray();
    }
}
