-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Bulan Mei 2020 pada 22.00
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data1`
--

CREATE TABLE `data1` (
  `id` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `no_hp` varchar(50) NOT NULL,
  `posisi` varchar(50) NOT NULL,
  `gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data1`
--

INSERT INTO `data1` (`id`, `nama`, `alamat`, `no_hp`, `posisi`, `gaji`) VALUES
('9999', 'Muhamad', 'Yogyakarta', '-', 'Direktur', 5000000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `posisi` varchar(50) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `jam_lembur` int(11) NOT NULL,
  `tunjangan_lembur` int(11) NOT NULL,
  `total_gaji` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id`, `nama`, `posisi`, `gaji_pokok`, `pajak`, `jam_lembur`, `tunjangan_lembur`, `total_gaji`) VALUES
('000', 'Dhio', 'Direktur', 10000000, 100000, 1, 15000, 9915000),
('1111', 'Dyah', 'Manager', 8000000, 80000, 5, 75000, 7995000),
('123132', 'Athaya', 'Manager', 15000000, 150000, 0, 0, 14850000),
('1234', 'Fahmi', 'Programmer', 1000000, 10000, 50, 750000, 1740000),
('12345', 'Emil', 'Surveyor', 3000000, 30000, 20, 300000, 3270000),
('123567', 'Arief', 'Marketing', 4000000, 40000, 30, 450000, 4410000);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `data1`
--
ALTER TABLE `data1`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
