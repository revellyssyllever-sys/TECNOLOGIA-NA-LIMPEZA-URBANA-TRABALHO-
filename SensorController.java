package controller;

import model.SensorDeLixeira;

public class SensorController {
    private SensorDeLixeira sensor;

    public SensorController(SensorDeLixeira sensor) {
        this.sensor = sensor;
    }

    public void atualizarSensor(int nivel) {
        sensor.atualizarNivel(nivel);
    }

    public String obterStatus() {
        return sensor.estaCheio() ? "Cheio" : "Disponível";
    }
}
