-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-05-2022 a las 00:34:12
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `examenes_clinicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `nombre` varchar(80) NOT NULL,
  `fecha_certificado` date NOT NULL,
  `Contenido` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`id_admin`, `nombre`, `fecha_certificado`, `Contenido`) VALUES
(1, 'angel coavas', '2022-04-30', 'kamsdkmapkdsmlamdsopasmdpomdaspomaop'),
(2, 'Sergio vega', '2022-04-30', 'Ganar a 5'),
(3, 'Angel coavas', '2022-04-30', 'el producto es perjudicial para la salud del paciente'),
(4, 'House tablilla', '2022-04-30', 'perjudicial para salud');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratiorio`
--

CREATE TABLE `laboratiorio` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `nombre_de_ensayo` varchar(100) NOT NULL,
  `tipo_de_contenido` varchar(40) NOT NULL,
  `Fecha_de_ensayo` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `laboratiorio`
--

INSERT INTO `laboratiorio` (`id`, `nombre`, `nombre_de_ensayo`, `tipo_de_contenido`, `Fecha_de_ensayo`) VALUES
(1, 'Angel Coavas', 'hadhf', 'adskkd', '2024-04-22'),
(2, 'aljsndads', 'kansdjknads', 'jandkjad', '2022-04-30'),
(3, 'Angel Jose Coavas padilla', 'calumnias', 'jurado', '2022-04-30'),
(4, 'juan diego', 'Facultad de salud en los jovenes', 'ilustrado', '2022-04-30'),
(7, 'house', 'medicinas con las plantas', 'plantas para salud', '2022-04-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `usuario` varchar(60) NOT NULL,
  `contraseña` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `login`
--

INSERT INTO `login` (`id`, `usuario`, `contraseña`) VALUES
(1, 'Angel Coavas', '1234'),
(2, 'Juan Diego', 'unisinu'),
(4, 'Fernando', '4321');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indices de la tabla `laboratiorio`
--
ALTER TABLE `laboratiorio`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `usuario` (`usuario`),
  ADD UNIQUE KEY `contraseña` (`contraseña`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `admin`
--
ALTER TABLE `admin`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `laboratiorio`
--
ALTER TABLE `laboratiorio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
