import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setup() throws Exception{
        calculator=new Calculator();
    }

    @Test
    @DisplayName("Simple Multiplication")
    public void testMultiply(){
        assertEquals(20,calculator.multiply(4,5));

    }
}
