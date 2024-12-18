package Questao3;

public class ControleRemoto {
    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }

    public void aumentaVolume() {
        if (televisao.getVolumeAtual() < 10) {
            televisao.setVolumeAtual(televisao.getVolumeAtual() + 1);
            System.out.println("Volume aumentado para: " + televisao.getVolumeAtual());
        } else {
            System.out.println("Volume já está no máximo");
        }
    }

    public void diminuiVolume() {
        if (televisao.getVolumeAtual() > televisao.getVolumeMinimo()) {
            televisao.setVolumeAtual(televisao.getVolumeAtual() - 1);
            System.out.println("Volume diminuído para: " + televisao.getVolumeAtual());
        } else {
            System.out.println("Volume já está no mínimo");
        }
    }

    public void trocaCanal(int novoCanal) {
        if (novoCanal > 0) { // Apenas permite canais positivos
            televisao.setCanal(novoCanal);
            System.out.println("Canal alterado para: " + televisao.getCanal());
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public int consultaVolume() {
        return televisao.getVolumeAtual();
    }

    public int consultaCanal() {
        return televisao.getCanal();
    }
}
