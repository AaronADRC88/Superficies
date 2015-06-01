package calcularea;

import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculareaTest {

    Cuadrado cuad;

    public CalculareaTest() {
    }

    public void iniciate() {
        cuad = new Cuadrado();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of metodos method, of class Cuadrado.
     */
    @Test
    public void testCirculo() {
        double expResult = Math.PI;
        double result = Circulo.calcArea(1);
        assertEquals(expResult, result, 0.0);
        System.out.println("Area circulo radio=1 " + expResult);
    }

    @Test
    public void testCuadrado() {
        double expResult = 4;
        double result = Cuadrado.calcArea(2);
        assertEquals(expResult, result, 0.0);
        System.out.println("Area cuadrado lado=2 " + expResult);
    }

    @Test
    public void testRectangulo() {
        double expResult = 8;
        double result = Rectangulo.calcArea(2, 4);
        assertEquals(expResult, result, 0.0);
        System.out.println("Area rectangulo base=2, altura=4 " + expResult);
    }

    @Test
    public void testTriangulo() {
        double expResult = 4;
        double result = Trianglo.calcArea(2, 4);
        assertEquals(expResult, result, 0.0);
        System.out.println("Area triangulo base=2, altura=4 " + expResult);
    }

}
