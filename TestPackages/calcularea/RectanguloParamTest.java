package calcularea;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class RectanguloParamTest {

    private double b, h, expResult;

    public RectanguloParamTest(double ba, double al, double area) {
        this.b = ba;
        this.h = al;
        this.expResult = area;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1, 2, 2},
            {2, 5, 10},
            {3, 3, 9}
        });
    }

    /**
     * Test of calcArea method, of class Rectangulo.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcAreaRectangulo " + b + " " + h + " " + expResult);
        assertEquals(expResult, Rectangulo.calcArea(b, h), 0.0);

    }

}
