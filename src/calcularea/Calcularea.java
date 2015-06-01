package calcularea;

import javax.swing.JOptionPane;

public class Calcularea {
    
    static int op;
    
    public static void main(String[] args) {
        Vista intro = new Vista();
        Calcularea.menuOp();
        if (op == 0) {
            Circulo cir = new Circulo();
            Circulo.calcArea(intro.introduceDato());
            Vista.imprimeArea(cir);
        }
        if (op == 1) {
            
            Cuadrado cuad = new Cuadrado();
            Cuadrado.calcArea(intro.introduceDato());
            Vista.imprimeArea(cuad);
            
        }
        if (op == 2) {
            Rectangulo rect = new Rectangulo();
            Rectangulo.calcArea(intro.introduceDato(), intro.introduceDato());
            Vista.imprimeArea(rect);
        }
        if (op == 3) {
            Trianglo tria = new Trianglo();
            Trianglo.calcArea(intro.introduceDato(), intro.introduceDato());
            Vista.imprimeArea(tria);
        } else {
            System.exit(0);
        }
    }
    
    public static int menuOp() {
        op = JOptionPane.showOptionDialog(null, "Selecciona unha opción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Circulo", "Cuadrado", "Rectangulo", "Triangulo", "exit"}, "exit");
        return op;
    }
    
}
