-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2023 a las 23:07:17
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `jpa_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulos`
--

CREATE TABLE `articulos` (
  `id` int(11) NOT NULL,
  `cantidad` varchar(255) DEFAULT NULL,
  `categoria` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `iva` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `preciocompra` varchar(255) DEFAULT NULL,
  `precioventa` varchar(255) DEFAULT NULL,
  `proveedor` varchar(255) DEFAULT NULL,
  `tienda` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `articulos`
--

INSERT INTO `articulos` (`id`, `cantidad`, `categoria`, `descripcion`, `iva`, `marca`, `modelo`, `nombre`, `preciocompra`, `precioventa`, `proveedor`, `tienda`, `fecha`) VALUES
(1, '120', 'portatiles', 'Portatil gamer de alto rendimiento i9', '15%', 'Asus', '2022', 'Asus 6000', '3000000', '3500000', 'Asus', 'Cartagena', '2023-03-02'),
(2, '120', 'portatiles', 'Portatil gamer de alto rendimiento i7', '15%', 'Asus', '2023', 'Asus 5200', '3100000', '3600000', 'Asus', 'Bogota', '2023-03-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `id` int(11) NOT NULL,
  `universidad` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_nacimiento` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `programa` varchar(255) DEFAULT NULL,
  `semestre` varchar(255) DEFAULT NULL,
  `teléfono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id`, `universidad`, `apellido`, `email`, `fecha_nacimiento`, `genero`, `nombre`, `programa`, `semestre`, `teléfono`) VALUES
(1, NULL, NULL, NULL, NULL, NULL, 'Asus 5999', NULL, NULL, NULL),
(2, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(3, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Ingeniero Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(4, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Ingeniero Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(5, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Ingeniero Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(6, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Ingeniero Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(8, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Ingeniero Anderson', 'Ingenieria de sistemas', '7', '3002620031'),
(9, 'Unicolombo', 'orozco dumet', 'andersondumet@gmail.com', '27-05-1999', 'M', 'Brayan', 'Ingenieria de sistemas', '7', '3002620031');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulos`
--
ALTER TABLE `articulos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulos`
--
ALTER TABLE `articulos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
