package ec.edu.epn.calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculadora;
    @BeforeEach
    public void init() {
        calculadora = new Calculator();
    }

    @Test
    public void testSum(){
        int result = calculadora.sum(2,3);
        assertEquals(5, result, "Sum Failed");
    }
    @Test
    public void testMinus(){

        int result=calculadora.minus(3,2);
        assertEquals(1, result, "Minus Failed");
    }
    @Test
    public void testMultiply(){

        int result=calculadora.multiply(3,2);
        assertEquals(6, result, "Multiply Failed");
    }
    @Test
    public void testDivideSuccess(){

        double result= calculadora.divide(6,2);
        assertEquals(3, result, "Divide Failed");
    }
    @Test
    public void testDivideFail(){
        assertThrows(ArithmeticException.class, () -> calculadora.divide(6,0));
    }
}
