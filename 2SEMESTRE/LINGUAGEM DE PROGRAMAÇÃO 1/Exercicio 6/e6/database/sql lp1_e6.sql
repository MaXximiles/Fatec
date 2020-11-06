create database lp1_e5;

use lp1_e5;

CREATE TABLE sofa (
sofa_id INT(11) AUTO_INCREMENT,
sofa_modelo VARCHAR(30),
sofa_cor VARCHAR(30),
sofa_tecido VARCHAR(30),
sofa_tamanho VARCHAR(30),
sofa_valor VARCHAR(30),
PRIMARY KEY(sofa_id)
);

CREATE TABLE profissional (
profissional_id INT(11) AUTO_INCREMENT,
profissional_nome VARCHAR(30),
profissional_profissao VARCHAR(30),
profissional_salario VARCHAR(30),
profissional_areaAtuacao VARCHAR(30),
profissional_cargo VARCHAR(30),
PRIMARY KEY(profissional_id)
);

CREATE TABLE calcado (
calcado_id INT(11) AUTO_INCREMENT,
calcado_marca VARCHAR(30),
calcado_modelo VARCHAR(30),
calcado_valor VARCHAR(30),
calcado_tipo VARCHAR(30),
calcado_cor VARCHAR(30),
PRIMARY KEY(calcado_id)
);