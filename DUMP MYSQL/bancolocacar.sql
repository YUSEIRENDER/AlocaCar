-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30-Maio-2021 às 21:25
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bancolocacar`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluguel`
--

CREATE TABLE `aluguel` (
  `idaluguel` int(10) NOT NULL,
  `veiculo` varchar(40) NOT NULL,
  `dataaluguel` date NOT NULL,
  `dataentrega` date NOT NULL,
  `cliente` varchar(40) NOT NULL,
  `entregue` char(3) NOT NULL,
  `observacao` varchar(40) NOT NULL,
  `valorpago` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `nomecliente` varchar(55) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `uf` varchar(2) NOT NULL,
  `telefone` varchar(11) NOT NULL,
  `cpf` varchar(12) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `nome` varchar(40) DEFAULT NULL,
  `cargo` varchar(14) NOT NULL,
  `login` varchar(40) NOT NULL,
  `senha` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`nome`, `cargo`, `login`, `senha`, `email`) VALUES
('Marcos Antonio assis dos santos', 'Atendente', 'marcosadmin', 'rootadmin', 'marcosone1998@gmail.com'),
('Marcos antonio assis dos santos', 'Atendente', 'marcosadmin', 'root', 'marcosone1998@gmail.com'),
('Roberta assunção', 'Atendente', 'roberta1957', 'roberta1957', 'roberta1957@gmail.com'),
('Leonardo', 'Cliente', 'leo123', 'leo123', 'leo123@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `numero` varchar(40) NOT NULL,
  `placa` varchar(7) NOT NULL,
  `fabricante` varchar(40) NOT NULL,
  `modelo` varchar(40) NOT NULL,
  `anomodelo` int(4) NOT NULL,
  `qtdportas` int(4) DEFAULT NULL,
  `acessorios` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluguel`
--
ALTER TABLE `aluguel`
  ADD PRIMARY KEY (`idaluguel`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cpf`);

--
-- Índices para tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`placa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
