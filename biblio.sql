-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 24 mai 2023 à 17:35
-- Version du serveur : 10.4.27-MariaDB
-- Version de PHP : 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bib`
--

-- --------------------------------------------------------

--
-- Structure de la table `abonne`
--

CREATE TABLE `abonne` (
  `idab` int(11) NOT NULL,
  `nomab` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `abonne`
--

INSERT INTO `abonne` (`idab`, `nomab`) VALUES
(1, 'TARGOTO CHRISTIAN'),
(2, 'NGARKIRA HYACINTHE'),
(3, 'KOURABE YVES'),
(4, 'ZENABA YOUNOUS'),
(5, 'FATIME DAGO'),
(6, 'JEANNINE ROUTOUANG'),
(7, 'RAISSA BETEL'),
(8, 'ghofy by'),
(9, 'klmlk jhkj jkljk'),
(10, 'mohamed');

-- --------------------------------------------------------

--
-- Structure de la table `emprunt`
--

CREATE TABLE `emprunt` (
  `idlivre` int(11) NOT NULL,
  `idab` int(10) NOT NULL,
  `titre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `livre`
--

CREATE TABLE `livre` (
  `idlivre` int(11) NOT NULL,
  `titre` varchar(90) NOT NULL,
  `autheur` varchar(50) DEFAULT NULL,
  `disponible` tinyint(1) NOT NULL DEFAULT 1,
  `idabonne` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `livre`
--

INSERT INTO `livre` (`idlivre`, `titre`, `autheur`, `disponible`, `idabonne`) VALUES
(1, 'ghofran', NULL, 0, NULL),
(2, 'Tragedie', NULL, 1, NULL),
(3, 'le soleil des independance', NULL, 1, NULL),
(4, 'Republique à vendre', NULL, 1, NULL),
(5, 'Tartarin de Tarascon', NULL, 1, 4),
(6, 'Etudiant de soweto', NULL, 1, 5),
(7, 'une vie de boy', NULL, 1, NULL),
(12, 'ghofyk', NULL, 1, NULL);

-- --------------------------------------------------------

--
-- Doublure de structure pour la vue `pret`
-- (Voir ci-dessous la vue réelle)
--
CREATE TABLE `pret` (
`idlivre` int(11)
,`titre` varchar(90)
,`idab` int(11)
);

-- --------------------------------------------------------

--
-- Structure de la vue `pret`
--
DROP TABLE IF EXISTS `pret`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `pret`  AS SELECT `livre`.`idlivre` AS `idlivre`, `livre`.`titre` AS `titre`, `abonne`.`idab` AS `idab` FROM (`livre` join `abonne` on(`livre`.`idabonne` = `abonne`.`idab`)) WHERE `livre`.`disponible` = 'NON''NON'  ;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `abonne`
--
ALTER TABLE `abonne`
  ADD PRIMARY KEY (`idab`);

--
-- Index pour la table `emprunt`
--
ALTER TABLE `emprunt`
  ADD PRIMARY KEY (`idlivre`,`idab`),
  ADD KEY `fk_emprunt_abonne` (`idab`);

--
-- Index pour la table `livre`
--
ALTER TABLE `livre`
  ADD PRIMARY KEY (`idlivre`),
  ADD KEY `fk1` (`idabonne`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `emprunt`
--
ALTER TABLE `emprunt`
  ADD CONSTRAINT `fk_emprunt_abonne` FOREIGN KEY (`idab`) REFERENCES `abonne` (`idab`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_emprunt_titre` FOREIGN KEY (`idlivre`) REFERENCES `livre` (`idlivre`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `livre`
--
ALTER TABLE `livre`
  ADD CONSTRAINT `fk1` FOREIGN KEY (`idabonne`) REFERENCES `abonne` (`idab`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
