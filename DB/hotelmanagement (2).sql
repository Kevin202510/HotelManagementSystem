-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2021 at 08:04 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotelmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `beds`
--

CREATE TABLE `beds` (
  `bed_id` bigint(20) UNSIGNED NOT NULL,
  `bed_quantity` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `beds`
--

INSERT INTO `beds` (`bed_id`, `bed_quantity`) VALUES
(1, 'single'),
(2, 'double'),
(3, 'trio'),
(4, 'quadro');

-- --------------------------------------------------------

--
-- Table structure for table `checkinandout`
--

CREATE TABLE `checkinandout` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `timein` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `timeout` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `checkin_date` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `checkout_date` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cust_id` bigint(20) UNSIGNED NOT NULL,
  `room_id` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `checkinandout`
--

INSERT INTO `checkinandout` (`id`, `timein`, `timeout`, `checkin_date`, `checkout_date`, `cust_id`, `room_id`) VALUES
(5, '11:53:37', '12:31:17', '2021-04-30', '2021-05-01', 7, 14),
(6, '12:59:12', '08:50:51', '2021-04-25', '2021-05-01', 8, 12),
(7, '12:59:32', '01:02:01', '2021-04-30', '2021-05-01', 9, 13),
(8, '12:59:32', '01:02:10', '2021-04-30', '2021-05-01', 10, 15);

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `cust_id` bigint(20) UNSIGNED NOT NULL,
  `cust_Fname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cust_Mname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cust_Lname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cust_address` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cust_contactnum` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`cust_id`, `cust_Fname`, `cust_Mname`, `cust_Lname`, `cust_address`, `cust_contactnum`) VALUES
(1, 'kevin', 'felix', 'caluag', 'BGTNE', '09261364720'),
(2, 'kevin', 'felix', 'caluag', 'BGTNE', '093402394'),
(3, 'kevin', 'felix', 'caluag', 'BGTNE', '4539847'),
(4, 'ace ', 'efmkm', 'malmsdlm', 'lmamlk', 'mlmalsdmalsd'),
(5, 'ako', 'lang ', 'sakalam', 'adnasjn', 'oandoajsd'),
(6, 'kevin', 'felix', 'caluag', 'dmaklsjdk', '76987087679076'),
(7, 'kevin', 'f', 'caluag', 'BGTNE', '092312312'),
(8, 'askd', 'k;lk;lk;lk', ';lk;k;', 'lk;lk;lk;', 'lk;lk;lk;l'),
(9, '', '', '', '', ''),
(10, 'qokwepo`kpokpokpo', 'jnjnoj', 'ojo', 'jij', 'oij');

-- --------------------------------------------------------

--
-- Table structure for table `inventories`
--

CREATE TABLE `inventories` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `sales_date` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `user_id` bigint(20) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `inventories`
--

INSERT INTO `inventories` (`id`, `sales_date`, `amount`, `user_id`) VALUES
(1, '2021-05-01', 900, 13),
(2, '2021-05-01', 900, 13),
(3, '2021-05-05', 1000, 14);

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2010_02_19_161826_create_beds_table', 1),
(2, '2010_02_19_161826_create_customers_table', 1),
(3, '2010_02_19_161826_create_rates_table', 1),
(4, '2010_02_19_161826_create_roomtypes_table', 1),
(5, '2011_02_19_161826_create_roles_table', 1),
(6, '2011_03_02_134614_create_users_table', 1),
(7, '2011_22_19_161826_create_rooms_table', 1),
(8, '2013_03_02_134614_create_checkInAndOut_table', 1),
(9, '2021_04_18_105159_create_inventories_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rates`
--

CREATE TABLE `rates` (
  `rate_id` bigint(20) UNSIGNED NOT NULL,
  `rate_price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rates`
--

INSERT INTO `rates` (`rate_id`, `rate_price`) VALUES
(1, 700),
(2, 900),
(3, 1100),
(4, 1500);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `role_id` bigint(20) UNSIGNED NOT NULL,
  `role_displayname` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`role_id`, `role_displayname`) VALUES
(1, 'Administrator'),
(2, 'Manager'),
(3, 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` bigint(20) UNSIGNED NOT NULL,
  `bed_id` bigint(20) UNSIGNED NOT NULL,
  `RT_id` bigint(20) UNSIGNED NOT NULL,
  `rate_id` bigint(20) UNSIGNED NOT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `bed_id`, `RT_id`, `rate_id`, `status`) VALUES
(7, 2, 1, 1, 0),
(8, 4, 3, 4, 0),
(9, 1, 2, 1, 0),
(10, 4, 3, 2, 0),
(11, 4, 3, 1, 0),
(12, 1, 1, 1, 0),
(13, 1, 1, 1, 0),
(14, 1, 1, 1, 1),
(15, 1, 1, 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `roomtypes`
--

CREATE TABLE `roomtypes` (
  `RT_id` bigint(20) UNSIGNED NOT NULL,
  `room_type` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roomtypes`
--

INSERT INTO `roomtypes` (`RT_id`, `room_type`) VALUES
(1, 'ordinary'),
(2, 'Air conditioned'),
(3, 'deluxe'),
(4, 'mamahalin'),
(5, 'pangmahirap'),
(6, 'pang eutan'),
(7, 'pang laspagan');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` bigint(20) UNSIGNED NOT NULL,
  `role_id` bigint(20) UNSIGNED NOT NULL,
  `user_Fname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_Mname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_Lname` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_address` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_DOB` date NOT NULL,
  `user_contactnum` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_username` varchar(191) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `user_password` varchar(191) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `role_id`, `user_Fname`, `user_Mname`, `user_Lname`, `user_address`, `user_DOB`, `user_contactnum`, `user_username`, `user_password`) VALUES
(1, 1, 'Kevin', 'F', 'Caluag', 'San Pedro General Tinio Ne', '2001-01-13', '09261364720', 'superadmin', 'ufxx|twi'),
(13, 3, 'Jomari', 'B', 'Mallare', 'sampaguita general tinio ne', '2000-06-13', '874289347', 'joms', 'ufxx|twi'),
(14, 2, 'ace', 'f', 'caluag', 'asdnaj', '2021-05-05', '9348273', 'ace', 'ufxx|twi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `beds`
--
ALTER TABLE `beds`
  ADD PRIMARY KEY (`bed_id`);

--
-- Indexes for table `checkinandout`
--
ALTER TABLE `checkinandout`
  ADD PRIMARY KEY (`id`),
  ADD KEY `checkinandout_cust_id_foreign` (`cust_id`),
  ADD KEY `checkinandout_room_id_foreign` (`room_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cust_id`);

--
-- Indexes for table `inventories`
--
ALTER TABLE `inventories`
  ADD PRIMARY KEY (`id`),
  ADD KEY `inventories_user_id_foreign` (`user_id`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `rates`
--
ALTER TABLE `rates`
  ADD PRIMARY KEY (`rate_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`role_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`room_id`),
  ADD KEY `rooms_bed_id_foreign` (`bed_id`),
  ADD KEY `rooms_rt_id_foreign` (`RT_id`),
  ADD KEY `rooms_rate_id_foreign` (`rate_id`);

--
-- Indexes for table `roomtypes`
--
ALTER TABLE `roomtypes`
  ADD PRIMARY KEY (`RT_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `users_user_username_unique` (`user_username`),
  ADD KEY `users_role_id_foreign` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `beds`
--
ALTER TABLE `beds`
  MODIFY `bed_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `checkinandout`
--
ALTER TABLE `checkinandout`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `cust_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `inventories`
--
ALTER TABLE `inventories`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `rates`
--
ALTER TABLE `rates`
  MODIFY `rate_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `role_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `roomtypes`
--
ALTER TABLE `roomtypes`
  MODIFY `RT_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `checkinandout`
--
ALTER TABLE `checkinandout`
  ADD CONSTRAINT `checkinandout_cust_id_foreign` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `checkinandout_room_id_foreign` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`) ON DELETE CASCADE;

--
-- Constraints for table `inventories`
--
ALTER TABLE `inventories`
  ADD CONSTRAINT `inventories_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE;

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `rooms_bed_id_foreign` FOREIGN KEY (`bed_id`) REFERENCES `beds` (`bed_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `rooms_rate_id_foreign` FOREIGN KEY (`rate_id`) REFERENCES `rates` (`rate_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `rooms_rt_id_foreign` FOREIGN KEY (`RT_id`) REFERENCES `roomtypes` (`RT_id`) ON DELETE CASCADE;

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `roles` (`role_id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
