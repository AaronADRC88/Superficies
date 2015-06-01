package calcularea;

import static calcularea.Vista.mod;

public class Circulo {

    static double area;

    public static double calcArea(double radio) {
        mod.setRadio(radio);
        area = radio * radio * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Circulo " + "area= " + area;
    }

}
