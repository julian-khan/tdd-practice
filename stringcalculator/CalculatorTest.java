import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(0, Calculator.add(""));
        assertEquals(1, Calculator.add("1"));
        assertEquals(4, Calculator.add("2,2"));
    }

    @Test
    public void testAddWithDifferentDelimeter() {
        assertEquals(4, Calculator.add(";\n1;3"));
        assertEquals(-8, Calculator.add(";\n-11;3"));
        assertEquals(-0, Calculator.add(".\n-4.4"));
    }   


}
