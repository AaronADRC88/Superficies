package calcularea;

import javax.swing.JOptionPane;

public class Vista {

   static Modelo mod = new Modelo();

    public  double introduceDato() {
        double dato = Double.parseDouble(JOptionPane.showInputDialog("Introduce dato núerco"));
        return dato;
    }

    public static void imprimeArea(Object o) {
        JOptionPane.showMessageDialog(null, o);
    }
}
