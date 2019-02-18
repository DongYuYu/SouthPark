package assignment1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortSearchTest {

    @Test
    public void selectSort() {
        SortSearch ss = new SortSearch();

        int[] actual = new int[] {1,3,2,4,5};
        ss.selectSort(actual);

        int[] expected = new int[] {1,2,3,4,5};






        assertArrayEquals(expected, actual);

    }
}