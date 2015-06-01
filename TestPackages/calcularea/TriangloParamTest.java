package calcularea;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TriangloParamTest {

    private double b, h, expResult;

    public TriangloParamTest(double ba, double al, double area) {
        this.b = ba;
        this.h = al;
        this.expResult = area;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {1, 2, 1},
            {2, 5, 5},
            {3, 3, 4.5}
        });
    }

    /**
     * Test of calcArea method, of class Trianglo.
     */
    @Test
    public void testCalcArea() {
        System.out.println("calcAreaTriangulo " + b + " " + h + " " + expResult);
        assertEquals(expResult, Trianglo.calcArea(b, h), 0.0);
    }

}
