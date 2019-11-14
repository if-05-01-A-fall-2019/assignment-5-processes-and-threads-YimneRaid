
package at.htlleonding.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class FibonacciTest {
    public final int N = 45;

    public FibonacciTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRecursionBottom() {

        assertEquals(1, Fibonacci.getNumberSingle(0));
        assertEquals(1, Fibonacci.getNumberSingle(1));

        assertEquals(1, Fibonacci.getNumberParallel(0));
        assertEquals(1, Fibonacci.getNumberParallel(1));
    }

    @Test
    public void test2() {
        assertEquals(2, Fibonacci.getNumberSingle(2));
        assertEquals(2, Fibonacci.getNumberParallel(2));
    }

    @Test
    public void test3() {
        assertEquals(3, Fibonacci.getNumberSingle(3));
    }

    @Test
    public void test4() {
        assertEquals(5, Fibonacci.getNumberSingle(4));
    }

    @Test
   // @Ignore
    public void testLarge() {
        assertEquals(1_836_311_903, Fibonacci.getNumberSingle(N));
    }

    //public void testParallel
}
