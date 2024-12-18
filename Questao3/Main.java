package Questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao(10, 0, 1, 0);

        ControleRemoto controle = new ControleRemoto(tv);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- Controle Remoto -----");
            System.out.println("1. Consultar Volume");
            System.out.println("2. Consultar Canal");
            System.out.println("3. Aumentar Volume");
            System.out.println("4. Diminuir Volume");
            System.out.println("5. Trocar Canal");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Volume atual: " + controle.consultaVolume());
                    break;
                case 2:
                    System.out.println("Canal atual: " + controle.consultaCanal());
                    break;
                case 3:
                    controle.aumentaVolume();
                    break;
                case 4:
                    controle.diminuiVolume();
                    break;
                case 5:
                    System.out.print("Digite o novo canal: ");
                    int novoCanal = scanner.nextInt();
                    controle.trocaCanal(novoCanal);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
