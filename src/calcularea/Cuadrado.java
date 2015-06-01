package calcularea;

import static calcularea.Vista.mod;

public class Cuadrado {

    static double area;

    public Cuadrado() {
    }

    public static double calcArea(double lado) {
        mod.setLado(lado);
        area = lado * lado;
        return area;
    }

    @Override
    public String toString() {
        return "Cuadrado" + "area=" + area;
    }

}
