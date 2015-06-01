package calcularea;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CirculoParamTest {

    private double r, expResult;

    public CirculoParamTest(double rad, double area) {
        this.r = rad;
        this.expResult = area;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1, Math.PI},
            {2, 4 * Math.PI},
            {3, 9 * Math.PI}
        });
    }

    /**
     * Test of calcArea method, of class Circulo.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcAreaCirculo " + r + " " + expResult);
        assertEquals(expResult, Circulo.calcArea(r), 0.0);

    }

}
