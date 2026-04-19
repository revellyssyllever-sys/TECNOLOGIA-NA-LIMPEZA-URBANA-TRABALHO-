package view;

import javax.swing.JOptionPane;

public class SensorView {
    public static void mostrarStatus(String localizacao, String status) {
        JOptionPane.showMessageDialog(null,
            "Lixeira em " + localizacao + ": " + status);
    }
}
