package calcularea;

import static calcularea.Vista.mod;

public class Rectangulo {

    static double area;

    public static double calcArea(double base, double altura) {
        mod.setBase(base);
        mod.setAltura(altura);
        area = (base * altura);
        return area;

    }

    @Override
    public String toString() {
        return "Rectangulo " + "area= " + area;
    }

}
