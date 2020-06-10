DROP TABLE IF EXISTS ponto;
DROP TABLE IF EXISTS usuario;

CREATE TABLE usuario (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nome VARCHAR(250) NOT NULL,
  cpf VARCHAR(250) NOT NULL,
  email VARCHAR(250) NOT NULL,
  data_cadastro DATE NOT NULL
);

CREATE TABLE ponto (
  id INT AUTO_INCREMENT PRIMARY KEY,
  id_usuario INT,
  data_hora TIMESTAMP NOT NULL,
  tipo VARCHAR(250) NOT NULL,
  FOREIGN KEY (id_usuario) references usuario(id)
);

INSERT INTO usuario (nome, cpf, email, data_cadastro) VALUES
  ('Daniel Itaú', '12345678910', 'danielvictorferrari@gmail.com', PARSEDATETIME('09-06-2020', 'dd-MM-yyyy')),
  ('Nicollas Mastertech', '12345678910', 'nicollas@mastertech.com.br', PARSEDATETIME('09-06-2020', 'dd-MM-yyyy')),
  ('Beatriz Mastertech', '12345678910', 'beatriz@mastertech.com.br', PARSEDATETIME('09-06-2020', 'dd-MM-yyyy'));

INSERT INTO ponto (id_usuario, data_hora, tipo) VALUES
    (1, PARSEDATETIME('09-06-2020 09:00:00', 'dd-MM-yyyy hh:mm:ss'), 'entrada'),
    (1, PARSEDATETIME('09-06-2020 18:00:00', 'dd-MM-yyyy hh:mm:ss'), 'saida'),
    (2, PARSEDATETIME('10-06-2020 08:00:00', 'dd-MM-yyyy hh:mm:ss'), 'entrada'),
    (2, PARSEDATETIME('10-06-2020 17:00:00', 'dd-MM-yyyy hh:mm:ss'), 'saida');
