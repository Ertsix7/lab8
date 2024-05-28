import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();

    Calculator calculator=new Calculator();

    @Test
    void add() {
        assertEquals(0,calculator.add(-1,1));
    }

    @Test
    void dif() {

        //тут был ваня
        assertEquals(-2,calculator.dif(-1,1));
    }

    @Test
    void div() {
        assertEquals(0,calculator.div(0,1));
    }

    @Test
    void times() {
        assertEquals(-1,calculator.times(-1,1));
    }

    @Test
    void solver() {

        assertEquals(6,calculator.solver());
    }
}