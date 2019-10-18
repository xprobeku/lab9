package ArrayReversor;

import ArrayFlattener.ArrayFlattener;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayReversor {

    private ArrayFlattener flattener;

    public int[] reverseArray(int[][] arr) {
        int[] array = flattener.flattenArray(arr);
        return IntStream.rangeClosed(1, array.length)
                .map(i -> array[array.length - i])
                .toArray();
    }

    public ArrayReversor(ArrayFlattener flattener) {
        this.flattener = flattener;
    }
}
