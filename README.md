import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" TECNOLOGIA NA LIMPEZA URBANA ");
        System.out.println(" Sistema Inteligente de Monitoramento ");
        System.out.println(" Java + POO + MVC + Oracle ");
        System.out.println("======================================");

        // Dados da Lixeira
        System.out.print("Digite a localização da lixeira: ");
        String localizacao = ler.nextLine();

        System.out.print("Digite o responsável pela coleta: ");
        String responsavel = ler.nextLine();

        System.out.print("Digite a data do monitoramento: ");
        String data = ler.nextLine();

        System.out.print("Digite o número da rota: ");
        int rota = ler.nextInt();

        System.out.print("Digite o nível de lixo (0 a 100): ");
        int nivelLixo = ler.nextInt();

        ler.nextLine();

        // Evento
        System.out.print("Digite o nome do evento: ");
        String evento = ler.nextLine();

        System.out.print("Digite a descrição do evento: ");
        String descricao = ler.nextLine();

        // Processamento
        String status;

        if (nivelLixo >= 80) {
            status = "CHEIA - Coleta urgente necessária";
        } else if (nivelLixo >= 50) {
            status = "PARCIAL - Monitoramento recomendado";
        } else {
            status = "DISPONÍVEL - Sem necessidade imediata";
        }

        // Relatório Final
        System.out.println("\n======================================");
        System.out.println(" RELATÓRIO DO SISTEMA ");
        System.out.println("======================================");

        System.out.println("Projeto: Tecnologia na Limpeza Urbana");
        System.out.println("Tecnologias Utilizadas:");
        System.out.println("- Java");
        System.out.println("- Oracle JDK");
        System.out.println("- MVC");
        System.out.println("- Programação Orientada a Objetos");
        System.out.println("- Banco de Dados Oracle");

        System.out.println("\nDADOS DA LIXEIRA");
        System.out.println("Localização: " + localizacao);
        System.out.println("Responsável: " + responsavel);
        System.out.println("Data: " + data);
        System.out.println("Rota: " + rota);
        System.out.println("Nível de lixo: " + nivelLixo + "%");
        System.out.println("Status: " + status);

        System.out.println("\nEVENTO REGISTRADO");
        System.out.println("Evento: " + evento);
        System.out.println("Descrição: " + descricao);

        System.out.println("\nCONSULTA SQL UTILIZADA");

        System.out.println("""
CREATE TABLE lixeira (
 id INT PRIMARY KEY,
 localizacao VARCHAR(100),
 nivel_lixo INT,
 status VARCHAR(50),
 responsavel_coleta VARCHAR(100)
);
""");

        System.out.println("""
CREATE TABLE evento (
 id INT PRIMARY KEY,
 nome VARCHAR(100),
 descricao VARCHAR(240),
 id_lixeira INT
);
""");

        System.out.println("\nSistema finalizado com sucesso.");
        System.out.println("======================================");

        ler.close();
    }
}



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




-- ==========================================
-- PROJETO: TECNOLOGIA NA LIMPEZA URBANA
-- Java + POO + MVC + Oracle Database
-- ==========================================

CREATE TABLE lixeira (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    localizacao VARCHAR(100) NOT NULL,
    nivel_lixo INT NOT NULL,
    status VARCHAR(50) NOT NULL,
    responsavel_coleta VARCHAR(100) NOT NULL,
    data_monitoramento DATETIME NOT NULL,
    ativo TINYINT UNSIGNED NOT NULL DEFAULT 1,
    excluido TINYINT UNSIGNED NOT NULL DEFAULT 0,
    data_exclusao DATETIME NULL DEFAULT NULL,
    observacao VARCHAR(240) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE evento (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    data_cadastro DATETIME NOT NULL,
    ativo TINYINT UNSIGNED NOT NULL DEFAULT 1,
    excluido TINYINT UNSIGNED NOT NULL DEFAULT 0,
    data_exclusao DATETIME NULL DEFAULT NULL,
    descricao VARCHAR(240) DEFAULT NULL,
    id_lixeira INT UNSIGNED DEFAULT NULL,

    PRIMARY KEY (id),

    KEY id_lixeira_idx (id_lixeira),

    CONSTRAINT fk_evento_lixeira
    FOREIGN KEY (id_lixeira)
    REFERENCES lixeira (id)
    ON DELETE SET NULL
);

-- ==========================================
-- CADASTRO DE LIXEIRAS
-- ==========================================

INSERT INTO lixeira
(localizacao, nivel_lixo, status, responsavel_coleta, data_monitoramento, observacao)
VALUES
(
    'Centro da Cidade',
    90,
    'CHEIA',
    'Revellys dos Santos Silva',
    NOW(),
    'Necessita coleta urgente'
);

INSERT INTO lixeira
(localizacao, nivel_lixo, status, responsavel_coleta, data_monitoramento, observacao)
VALUES
(
    'Praça Central',
    45,
    'DISPONIVEL',
    'Equipe Urbana',
    NOW(),
    'Monitoramento normal'
);

-- ==========================================
-- EVENTOS REGISTRADOS
-- ==========================================

INSERT INTO evento
(nome, data_cadastro, descricao, id_lixeira)
VALUES
(
    'Lixeira Cheia',
    NOW(),
    'Sensor detectou nivel acima de 90%',
    1
);

INSERT INTO evento
(nome, data_cadastro, descricao, id_lixeira)
VALUES
(
    'Coleta Realizada',
    NOW(),
    'Equipe realizou a coleta dos residuos',
    1
);

INSERT INTO evento
(nome, data_cadastro, descricao, id_lixeira)
VALUES
(
    'Manutencao Preventiva',
    NOW(),
    'Verificacao dos sensores de monitoramento',
    2
);

INSERT INTO evento
(nome, data_cadastro, descricao, id_lixeira)
VALUES
(
    'Rota Otimizada',
    NOW(),
    'Sistema definiu nova rota para coleta',
    2
);

-- ==========================================
-- CONSULTAS
-- ==========================================

SELECT * FROM lixeira;

SELECT * FROM evento;

SELECT
    e.nome AS evento,
    e.descricao,
    l.localizacao,
    l.status
FROM evento e
LEFT JOIN lixeira l
ON e.id_lixeira = l.id;
