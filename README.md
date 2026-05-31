Tabela Organizada.

CREATE TABLE lixeira (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    localizacao VARCHAR(100) NOT NULL,
    nivel_lixo INT NOT NULL,
    status VARCHAR(50) NOT NULL,
    responsavel_coleta VARCHAR(100) NOT NULL,
    data_monitoramento DATETIME NOT NULL,
    ativo TINYINT UNSIGNED NOT NULL DEFAULT '1',
    excluido TINYINT UNSIGNED NOT NULL DEFAULT '0',
    data_exclusao DATETIME NULL DEFAULT NULL,
    observacao VARCHAR(240) DEFAULT NULL,
    PRIMARY KEY (id)
);


tabela Evento Lixeira 

INSERT INTO evento
(nome, data_evento, descricao, id_lixeira)
VALUES
('Coleta Realizada',
 NOW(),
 'Equipe realizou a coleta dos resíduos.',
 1);

INSERT INTO evento
(nome, data_evento, descricao, id_lixeira)
VALUES
('Lixeira Cheia',
 NOW(),
 'Sensor detectou capacidade acima de 90%.',
 1);

INSERT INTO evento
(nome, data_evento, descricao, id_lixeira)
VALUES
('Manutenção Preventiva',
 NOW(),
 'Verificação do sensor de monitoramento.',
 1);

Organização 


INSERT INTO organizacao
(nome, data_cadastro, descricao)
VALUES
(
    'EcoCidade Inteligente',
    NOW(),
    'Organização responsável pelo gerenciamento das lixeiras inteligentes e monitoramento urbano.'
);

evento um Registro 

INSERT INTO evento
(nome, data_cadastro, descricao)
VALUES
(
    'Rota de Coleta Otimizada',
    NOW(),
    'Sistema definiu nova rota para reduzir o tempo de coleta dos resíduos.'
);



  Sistema Individual Pronto e Rodando


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