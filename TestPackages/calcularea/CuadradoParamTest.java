package calcularea;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CuadradoParamTest {

    private double l, expResult;

    public CuadradoParamTest(double lado, double area) {
        this.l = lado;
        this.expResult = area;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1, 1},
            {2, 4},
            {3, 9}
        });
    }

    /**
     * Test of calcArea method, of class Cuadrado.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcAreaCuadrado " + l + " " + expResult);
        assertEquals(expResult, Cuadrado.calcArea(l), 0.0);
    }

}
