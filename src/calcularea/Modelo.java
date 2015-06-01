package calcularea;

public class Modelo {
private double lado, base, altura,radio;

    public Modelo(double lado, double base, double altura, double radio) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    public Modelo() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
