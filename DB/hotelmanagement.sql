-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2021 at 12:59 PM
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
  `bed_quantity` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `beds`
--

INSERT INTO `beds` (`bed_id`, `bed_quantity`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 'single', NULL, NULL, NULL),
(2, 'double', NULL, NULL, NULL),
(3, 'trio', NULL, NULL, NULL),
(4, 'quadro', NULL, NULL, NULL);

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
  `cust_contactnum` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`cust_id`, `cust_Fname`, `cust_Mname`, `cust_Lname`, `cust_address`, `cust_contactnum`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 'Maria', 'Pagunio', 'Gadiaza', 'San Pedro General Tinio Ne', '09261364720', NULL, NULL, NULL),
(2, 'marimar', 'Pagunio', 'diaza', 'San Pedro General Tinio Ne', '09551364720', NULL, NULL, NULL);

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
(8, '2013_03_02_134614_create_reservations_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `rates`
--

CREATE TABLE `rates` (
  `rate_id` bigint(20) UNSIGNED NOT NULL,
  `rate_price` int(11) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rates`
--

INSERT INTO `rates` (`rate_id`, `rate_price`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 700, NULL, NULL, NULL),
(2, 900, NULL, NULL, NULL),
(3, 1100, NULL, NULL, NULL),
(4, 1500, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `res_id` bigint(20) UNSIGNED NOT NULL,
  `res_timein` timestamp NULL DEFAULT NULL,
  `res_timeout` timestamp NULL DEFAULT NULL,
  `res_checkin` date DEFAULT NULL,
  `res_checkout` date DEFAULT NULL,
  `cust_id` bigint(20) UNSIGNED NOT NULL,
  `room_id` bigint(20) UNSIGNED NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`res_id`, `res_timein`, `res_timeout`, `res_checkin`, `res_checkout`, `cust_id`, `room_id`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, '2021-04-01 18:00:51', '2021-04-01 21:00:51', '2021-04-02', '2021-04-02', 2, 2, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `role_id` bigint(20) UNSIGNED NOT NULL,
  `role_displayname` varchar(191) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`role_id`, `role_displayname`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 'Administrator', NULL, NULL, NULL),
(2, 'Manager', NULL, NULL, NULL),
(3, 'Staff', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `room_id` bigint(20) UNSIGNED NOT NULL,
  `bed_id` bigint(20) UNSIGNED NOT NULL,
  `RT_id` bigint(20) UNSIGNED NOT NULL,
  `rate_id` bigint(20) UNSIGNED NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`room_id`, `bed_id`, `RT_id`, `rate_id`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 1, 1, 4, NULL, NULL, NULL),
(2, 2, 2, 3, NULL, NULL, NULL),
(3, 3, 3, 2, NULL, NULL, NULL),
(4, 1, 1, 1, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `roomtypes`
--

CREATE TABLE `roomtypes` (
  `RT_id` bigint(20) UNSIGNED NOT NULL,
  `room_type` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `roomtypes`
--

INSERT INTO `roomtypes` (`RT_id`, `room_type`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 'ordinary', NULL, NULL, NULL),
(2, 'Air conditioned', NULL, NULL, NULL),
(3, 'deluxe', NULL, NULL, NULL);

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
  `user_username` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_password` varchar(191) COLLATE utf8mb4_unicode_ci NOT NULL,
  `remember_token` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `role_id`, `user_Fname`, `user_Mname`, `user_Lname`, `user_address`, `user_DOB`, `user_contactnum`, `user_username`, `user_password`, `remember_token`, `deleted_at`, `created_at`, `updated_at`) VALUES
(1, 1, 'Maria', 'Pagunio', 'Gadiaza', 'San Pedro General Tinio Ne', '2001-01-13', '09261364720', 'superadmin', 'password', NULL, NULL, NULL, NULL),
(2, 2, 'Chelsea', 'Vannesa', 'Torres', 'Pulong Matong General Tinio Ne', '2002-01-13', '09261364720', 'chelsea', 'password', NULL, NULL, NULL, NULL),
(3, 3, 'Jomari', 'Banayo', 'Mallare', 'Sampaguita General Tinio Ne', '2003-01-13', '09261364720', 'joms', 'password', NULL, NULL, NULL, NULL),
(4, 3, 'kim', 'razel', 'manuel', 'Sampaguita General Tinio Ne', '2001-02-13', '1342342', 'kim21', 'password', NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `beds`
--
ALTER TABLE `beds`
  ADD PRIMARY KEY (`bed_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cust_id`);

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
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`res_id`),
  ADD KEY `reservations_cust_id_foreign` (`cust_id`),
  ADD KEY `reservations_room_id_foreign` (`room_id`);

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
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `cust_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `rates`
--
ALTER TABLE `rates`
  MODIFY `rate_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `res_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `role_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `room_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `roomtypes`
--
ALTER TABLE `roomtypes`
  MODIFY `RT_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `reservations_cust_id_foreign` FOREIGN KEY (`cust_id`) REFERENCES `customers` (`cust_id`) ON DELETE CASCADE,
  ADD CONSTRAINT `reservations_room_id_foreign` FOREIGN KEY (`room_id`) REFERENCES `rooms` (`room_id`) ON DELETE CASCADE;

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
