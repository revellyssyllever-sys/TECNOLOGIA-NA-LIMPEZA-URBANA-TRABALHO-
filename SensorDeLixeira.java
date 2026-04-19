package model;

public class SensorDeLixeira {
    private String localizacao;
    private int nivelLixo;

    public SensorDeLixeira(String localizacao) {
        this.localizacao = localizacao;
        this.nivelLixo = 0;
    }

    public void atualizarNivel(int nivel) {
        this.nivelLixo = nivel;
    }

    public boolean estaCheio() {
        return nivelLixo >= 80;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
