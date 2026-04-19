import model.SensorDeLixeira;
import controller.SensorController;
import view.SensorView;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        SensorDeLixeira sensor = new SensorDeLixeira("Rua A");
        SensorController controller = new SensorController(sensor);

        String input = JOptionPane.showInputDialog("Digite o nível de lixo:");
        int nivel = Integer.parseInt(input);

        controller.atualizarSensor(nivel);

        String status = controller.obterStatus();
        SensorView.mostrarStatus(sensor.getLocalizacao(), status);
    }
}
