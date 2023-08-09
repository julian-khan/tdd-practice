package fizzbuzz;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    FizzBuzz fb = new FizzBuzz();

    @Test
    public void nonMultiples() {
        assertEquals("4", fb.fizzBuzz(4));
        assertEquals("7", fb.fizzBuzz(7));
    }

    @Test
    public void threeMultiples() {
        assertEquals("Fizz", fb.fizzBuzz(3));
    }

    @Test
    public void fiveMultiples() {
        assertEquals("Buzz", fb.fizzBuzz(5));
    }

    @Test
    public void threeAndFiveMultiple() {
        assertEquals("FizzBuzz", fb.fizzBuzz(15));
        assertEquals("FizzBuzz", fb.fizzBuzz(30));
    }
}
