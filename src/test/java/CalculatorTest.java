import calk.Calculate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superova on 15.12.2015.
 */
public class CalculatorTest {
    @Test


    public void testCal() throws Exception {
        Calculate calculate = new Calculate();
        int a = calculate.calcAdd(2, 3);
        assertEquals(5, a);

        int b = calculate.calkMult(2, 3);
        assertEquals(6, b);

        int c = calculate.calcSubtrac(2, 3);
        assertEquals(-1, c);

        int d = calculate.calcdiv(6, 3);
        assertEquals(2, d);

      /*  int e = calculate.calcdiv0(6, 0);
        assertEquals();*/


    }

    @Test(expected = ArithmeticException.class)
    public void testCal1() {
        Calculate calculate = new Calculate();
        calculate.calcdiv(6, 0);
    }
}

