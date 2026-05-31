
PROJETO: TECNOLOGIA NA LIMPEZA URBANA
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

programação funcional simples e rodando.


  import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" TECNOLOGIA NA LIMPEZA URBANA ");
        System.out.println(" Sistema Inteligente de Monitoramento ");
        System.out.println(" Java + Oracle ");
        System.out.println("======================================");

        System.out.print("Digite a localizacao da lixeira: ");
        String localizacao = ler.nextLine();

        System.out.print("Digite o responsavel pela coleta: ");
        String responsavel = ler.nextLine();

        System.out.print("Digite a data do monitoramento: ");
        String data = ler.nextLine();

        System.out.print("Digite o numero da rota: ");
        int rota = ler.nextInt();

        System.out.print("Digite o nivel de lixo (0 a 100): ");
        int nivelLixo = ler.nextInt();

        ler.nextLine();

        System.out.print("Digite o nome do evento: ");
        String evento = ler.nextLine();

        System.out.print("Digite a descricao do evento: ");
        String descricao = ler.nextLine();

        String status;

        if (nivelLixo >= 80) {
            status = "CHEIA - Coleta urgente necessaria";
        } else if (nivelLixo >= 50) {
            status = "PARCIAL - Monitoramento recomendado";
        } else {
            status = "DISPONIVEL - Sem necessidade imediata";
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println(" RELATORIO FINAL ");
        System.out.println("======================================");

        System.out.println("Projeto: Tecnologia na Limpeza Urbana");
        System.out.println("Desenvolvedor: Revellys dos Santos Silva");
        System.out.println("Tecnologias Utilizadas:");
        System.out.println("- Java");
        System.out.println("- Oracle");
        System.out.println("- Programacao Orientada a Objetos");
        System.out.println("- MVC");
        System.out.println("- Banco de Dados");

        System.out.println();
        System.out.println("DADOS DA LIXEIRA");
        System.out.println("Localizacao: " + localizacao);
        System.out.println("Responsavel: " + responsavel);
        System.out.println("Data: " + data);
        System.out.println("Rota: " + rota);
        System.out.println("Nivel de lixo: " + nivelLixo + "%");
        System.out.println("Status: " + status);

        System.out.println();
        System.out.println("EVENTO REGISTRADO");
        System.out.println("Evento: " + evento);
        System.out.println("Descricao: " + descricao);

        System.out.println();
        System.out.println("MODELO DO BANCO DE DADOS");

        System.out.println("Tabela: LIXEIRA");
        System.out.println("id");
        System.out.println("localizacao");
        System.out.println("nivel_lixo");
        System.out.println("status");
        System.out.println("responsavel_coleta");

        System.out.println();

        System.out.println("Tabela: EVENTO");
        System.out.println("id");
        System.out.println("nome");
        System.out.println("descricao");
        System.out.println("id_lixeira");

        System.out.println();
        System.out.println("Sistema executado com sucesso.");
        System.out.println("Projeto concluido.");
        System.out.println("======================================");

        ler.close();
    }
}



-- ==========================================
-- 
