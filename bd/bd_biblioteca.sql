-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/09/2024 às 03:56
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_biblioteca`
--

-- --------------------------------------------------------
CREATE database bd_biblioteca;
USE bd_biblioteca;

--
-- Estrutura para tabela `administra_livro`
--

CREATE TABLE `administra_livro` (
  `Id_Funcionario` int(11) NOT NULL,
  `Cod_Livro` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `cargo`
--

CREATE TABLE `cargo` (
  `Cod_Cargo` int(11) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Nome_Cargo` varchar(50) NOT NULL,
  `Salario` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `conta_administrador`
--

CREATE TABLE `conta_administrador` (
  `Id_Funcionario` int(11) NOT NULL,
  `Senha` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `empresta_livro`
--

CREATE TABLE `empresta_livro` (
  `Id_Usuario` int(11) NOT NULL,
  `Cod_Livro` int(11) NOT NULL,
  `Data_Emissao` date NOT NULL,
  `Data_Devolucao` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `Id_Funcionario` int(11) NOT NULL,
  `Nome` varchar(80) NOT NULL,
  `RG` varchar(12) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `Data_Nasc` date NOT NULL,
  `Data_Admissao` date NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Cod_Periodo` int(11) NOT NULL,
  `Cod_Cargo` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `livro`
--

CREATE TABLE `livro` (
  `Cod_Livro` int(11) NOT NULL,
  `Titulo` varchar(100) NOT NULL,
  `Nome_Autor` varchar(80) NOT NULL,
  `Data_Lancamento` date NOT NULL,
  `Genero` varchar(50) NOT NULL,
  `Qtde_Pagina` int(11) NOT NULL,
  `Exemplares` int(11) NOT NULL,
  `Editora` varchar(50) NOT NULL,
  `ISBN` varchar(13) NOT NULL,
  `Cod_Setor` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `periodo`
--

CREATE TABLE `periodo` (
  `Cod_Periodo` int(11) NOT NULL,
  `Descricao` varchar(30) NOT NULL,
  `Hora_Entrada` time NOT NULL,
  `Hora_Saida` time NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `setor`
--

CREATE TABLE `setor` (
  `Cod_Setor` int(11) NOT NULL,
  `Andar` varchar(30) NOT NULL,
  `Genero` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuario`
--

CREATE TABLE `usuario` (
  `Id_Usuario` int(11) NOT NULL,
  `Nome` varchar(80) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `RG` varchar(12) NOT NULL,
  `CPF` varchar(14) NOT NULL,
  `Telefone` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Senha` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`Cod_Cargo`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`Id_Funcionario`),
  ADD UNIQUE KEY `RG` (`RG`),
  ADD UNIQUE KEY `CPF` (`CPF`);

--
-- Índices de tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`Cod_Livro`),
  ADD UNIQUE KEY `ISBN` (`ISBN`);

--
-- Índices de tabela `periodo`
--
ALTER TABLE `periodo`
  ADD PRIMARY KEY (`Cod_Periodo`);

--
-- Índices de tabela `setor`
--
ALTER TABLE `setor`
  ADD PRIMARY KEY (`Cod_Setor`);

--
-- Índices de tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id_Usuario`),
  ADD UNIQUE KEY `RG` (`RG`),
  ADD UNIQUE KEY `CPF` (`CPF`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cargo`
--
ALTER TABLE `cargo`
  MODIFY `Cod_Cargo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `Id_Funcionario` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `Cod_Livro` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `periodo`
--
ALTER TABLE `periodo`
  MODIFY `Cod_Periodo` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `setor`
--
ALTER TABLE `setor`
  MODIFY `Cod_Setor` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id_Usuario` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

-- Inserir registros na tabela `cargo`
-- Inserir registros na tabela `cargo`
INSERT INTO `cargo` (`Descricao`, `Nome_Cargo`, `Salario`) VALUES
('Gerencia atividades administrativas', 'Gerente', 3500.00),
('Cuida das estantes e organiza os livros', 'Bibliotecário', 2800.00),
('Atende os clientes e organiza devoluções', 'Atendente', 1800.00),
('Realiza limpezas no ambiente', 'Auxiliar de Limpeza', 1200.00),
('Gerencia empréstimos e devoluções', 'Supervisor de Empréstimos', 3000.00);

-- Inserir registros na tabela `conta_administrador`
INSERT INTO `conta_administrador` (`Id_Funcionario`, `Senha`) VALUES
<<<<<<< HEAD
(1, '7272'),
(2, '12345'),
(3, 'batman');


-- Inserir registros na tabela `funcionario`
INSERT INTO `funcionario` (`Nome`, `RG`, `CPF`, `Data_Nasc`, `Data_Admissao`, `Endereco`, `Telefone`, `Email`, `Cod_Periodo`, `Cod_Cargo`) VALUES
('Gabriel Santos', '123456789', '111.111.111-11', '1990-05-10', '2023-01-15', 'Rua A, 123', '(11) 99999-1111', 'gabriel.santos@gmail.com', 1, 1),
('Guilherme Santos', '987654321', '222.222.222-22', '1985-02-20', '2022-03-10', 'Rua B, 456', '(11) 98888-2222', 'guilherme.santos@gmail.com', 2, 2),
('Gabriel Oliveira', '111222333', '333.333.333-33', '1992-07-30', '2021-05-01', 'Rua C, 789', '(11) 97777-3333', 'gabriel.oliveira@gmail.com', 1, 3);

=======
(1, 'senhaAdmin1'),
(2, 'senhaAdmin2'),
(3, 'senhaAdmin3'),
(4, 'senhaAdmin4'),
(5, 'senhaAdmin5');

-- Inserir registros na tabela `funcionario`
INSERT INTO `funcionario` (`Nome`, `RG`, `CPF`, `Data_Nasc`, `Data_Admissao`, `Endereco`, `Telefone`, `Email`, `Cod_Periodo`, `Cod_Cargo`) VALUES
('Ana Silva', '123456789', '111.111.111-11', '1990-05-10', '2023-01-15', 'Rua A, 123', '(11) 99999-1111', 'ana@biblioteca.com', 1, 1),
('Carlos Souza', '987654321', '222.222.222-22', '1985-02-20', '2022-03-10', 'Rua B, 456', '(11) 98888-2222', 'carlos@biblioteca.com', 2, 2),
('Maria Oliveira', '111222333', '333.333.333-33', '1992-07-30', '2021-05-01', 'Rua C, 789', '(11) 97777-3333', 'maria@biblioteca.com', 1, 3),
('João Ferreira', '444555666', '444.444.444-44', '1988-10-15', '2020-09-15', 'Rua D, 101', '(11) 96666-4444', 'joao@biblioteca.com', 3, 4),
('Laura Lima', '777888999', '555.555.555-55', '1995-03-25', '2019-12-20', 'Rua E, 202', '(11) 95555-5555', 'laura@biblioteca.com', 1, 5);
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6

-- Inserir registros na tabela `livro`
INSERT INTO `livro` (`Titulo`, `Nome_Autor`, `Data_Lancamento`, `Genero`, `Qtde_Pagina`, `Exemplares`, `Editora`, `ISBN`, `Cod_Setor`) VALUES
('Aventuras no Mar', 'João Santos', '2015-06-10', 'Aventura', 320, 5, 'Editora Mar', '9781234567890', 1),
('O Mistério da Casa', 'Ana Souza', '2018-10-15', 'Mistério', 250, 4, 'Editora Mistério', '9780987654321', 2),
('Segredos do Deserto', 'Carlos Oliveira', '2020-01-20', 'Suspense', 280, 6, 'Editora Suspense', '9781112223334', 3),
('História Antiga', 'Maria Lima', '2012-11-05', 'História', 450, 2, 'Editora História', '9784445556667', 1),
('Tecnologias Futuras', 'Paulo Costa', '2021-04-12', 'Tecnologia', 310, 3, 'Editora Tech', '9787778889990', 4);

-- Inserir registros na tabela `periodo`
INSERT INTO `periodo` (`Descricao`, `Hora_Entrada`, `Hora_Saida`) VALUES
('Manhã', '08:00:00', '12:00:00'),
('Tarde', '13:00:00', '17:00:00'),
('Noite', '18:00:00', '22:00:00'),
('Integral', '08:00:00', '17:00:00'),
('Madrugada', '00:00:00', '06:00:00');

-- Inserir registros na tabela `setor`
INSERT INTO `setor` (`Andar`, `Genero`) VALUES
('Térreo', 'Ficção'),
('1º Andar', 'História'),
('2º Andar', 'Tecnologia'),
('3º Andar', 'Mistério'),
<<<<<<< HEAD
('4º Andar', 'Romance');
=======
('4º Andar', 'Ciência');
>>>>>>> afbbb357595d021912e2ce7eca2c6bfc2d6aa8c6

-- Inserir registros na tabela `usuario`
INSERT INTO `usuario` (`Nome`, `Endereco`, `RG`, `CPF`, `Telefone`, `Email`, `Senha`) VALUES
('Fernanda Silva', 'Rua F, 303', '555666777', '666.666.666-66', '(11) 94444-6666', 'fernanda@exemplo.com', 'senha123'),
('Bruno Ferreira', 'Rua G, 404', '888999000', '777.777.777-77', '(11) 93333-7777', 'bruno@exemplo.com', 'senha456'),
('Juliana Oliveira', 'Rua H, 505', '111222333', '888.888.888-88', '(11) 92222-8888', 'juliana@exemplo.com', 'senha789'),
('Lucas Souza', 'Rua I, 606', '444555666', '999.999.999-99', '(11) 91111-9999', 'lucas@exemplo.com', 'senha101'),
('Patrícia Lima', 'Rua J, 707', '777888999', '000.000.000-00', '(11) 90000-0000', 'patricia@exemplo.com', 'senha202');

-- Inserir registros na tabela `empresta_livro`
INSERT INTO `empresta_livro` (`Id_Usuario`, `Cod_Livro`, `Data_Emissao`, `Data_Devolucao`) VALUES
(1, 1, '2024-09-01', '2024-09-15'),
(2, 3, '2024-09-05', '2024-09-19'),
(3, 5, '2024-09-07', '2024-09-21'),
(4, 2, '2024-09-10', '2024-09-24'),
(5, 4, '2024-09-12', '2024-09-26');

-- Inserir registros na tabela `administra_livro`
INSERT INTO `administra_livro` (`Id_Funcionario`, `Cod_Livro`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
