
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("TECNOLOGIA NA LIMPEZA URBANA");
        System.out.println("Sistema Inteligente de Monitoramento");
        System.out.println("Desenvolvido em Java + Oracle");
        System.out.println("======================================");

        System.out.println("Digite a localização da lixeira:");
        String localizacao = ler.nextLine();

        System.out.println("Digite o responsável pela coleta:");
        String responsavel = ler.nextLine();

        System.out.println("Digite a data da coleta:");
        String data = ler.nextLine();

        System.out.println("Digite o número da rota:");
        int rota = ler.nextInt();

        System.out.println("Digite o nível de lixo (0 a 100):");
        int nivelLixo = ler.nextInt();

        String status;

        if (nivelLixo >= 80) {
            status = "CHEIA - Coleta urgente necessária";
        } else if (nivelLixo >= 50) {
            status = "PARCIAL - Monitoramento recomendado";
        } else {
            status = "DISPONÍVEL - Sem necessidade imediata";
        }

        System.out.println("=========== RELATÓRIO FINAL ===========");
        System.out.println("Projeto: Tecnologia na Limpeza Urbana");
        System.out.println("Tecnologias: Java, Oracle JDK, MVC, POO");
        System.out.println("Localização: " + localizacao);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Data: " + data);
        System.out.println("Rota: " + rota);
        System.out.println("Nível de lixo: " + nivelLixo + "%");
        System.out.println("Status: " + status);

        ler.close();
    }
}