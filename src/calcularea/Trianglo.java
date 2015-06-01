package calcularea;

import static calcularea.Vista.mod;

public class Trianglo {

    static double area;

    public Trianglo() {
    }

    public static double calcArea(double base, double altura) {
        mod.setBase(base);
        mod.setAltura(altura);
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Trianglo " + "area= " + area;
    }

}
