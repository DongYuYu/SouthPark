package assignment1;

import org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
//import org.hamcrest.


public class NumberTest {

    static Number n;





    @BeforeClass
    public static void initiazation() {
        n = new Number(10);
    }
    @Test
    public void fibonacciTest() {



        //Number n = new Number(10);
        int[] actual = n.fibonacci();
        int[] expected = {0,
                1,
                1,
                2,
                3,
                5,
                8,
                13,
                21,
                34,
                55};
        assertArrayEquals(expected, actual);
    }





    @Test
    public void factorTest() {



        //Number n = new Number(10);


        n.factor();
        int[] actual = n.f;

        int[] expected = {1,
                1,
                2,
                6,
                24,
                120,
                720,
                5040,
                40320,
                362880,
                3628800};
        assertArrayEquals(expected, actual);


    }

    @Test
    public void primeTest() {

        //Number n = new Number(23);
        assertEquals(false, n.isPrime(10));
    }






    @Test
    public void amstrongTest() {
        //Number n = new Number(12345);


        assertEquals(false, n.isAmstrong());
    }
    @Test
    public void palimdromTest() {

        //Number n = new Number(12321);
        assertEquals(false, n.isPalindrom());
    }

}