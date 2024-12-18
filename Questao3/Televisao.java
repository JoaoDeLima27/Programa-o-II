package Questao3;

public class Televisao {
    private int volumeMaximo;
    private int volumeMinimo;
    private int volumeAtual;
    private int canal;

    public Televisao(int volumeMaximo, int volumeMinimo, int canal, int volumeAtual) {
        this.volumeMaximo = volumeMaximo;
        this.volumeMinimo = volumeMinimo;
        this.canal = canal;
        this.volumeAtual = volumeAtual;
    }

    public void setVolumeMaximo(int volumeMaximo) {
        this.volumeMaximo = volumeMaximo;
    }

    public int getVolumeMaximo() {
        return volumeMaximo;
    }

    public void setVolumeMinimo(int volumeMinimo) {
        this.volumeMinimo = volumeMinimo;
    }

    public int getVolumeMinimo() {
        return volumeMinimo;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual = volumeAtual;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "volumeAtual=" + volumeAtual +
                ", canal=" + canal +
                ", volumeMinimo=" + volumeMinimo +
                ", volumeMaximo=" + volumeMaximo +
                '}';
    }
}
