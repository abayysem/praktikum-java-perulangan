/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanperulangan;

/**
 *
 * @author USER
 */
public class LatihanKeempat {
     public static void tampilkanDaftarBarang(
            String namaBarang, int jumlahBeli) {

        System.out.println("\nDaftar barang yang dibeli:");

        for (int i = 1; i <= jumlahBeli; i++) {
            System.out.println(
                    "Barang ke-" + i + ": " + namaBarang);
        }
    }

    // Method untuk menghitung kembalian
    public static int hitungKembalian(
            int uangBayar, int totalHarga) {

        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        String namaBarang = "Buku";
        int jumlahBeli = 3;
        int hargaBarang = 5000;

        int totalHarga = jumlahBeli * hargaBarang;
        int uangBayar = 20000;

        System.out.println("=== PROGRAM PEMBELIAN ===");

        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Jumlah beli: " + jumlahBeli);
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Uang bayar: " + uangBayar);

        if (uangBayar >= totalHarga) {

            System.out.println("\nPembayaran berhasil!");

            // Memanggil method kembalian
            int kembalian = hitungKembalian(
                    uangBayar, totalHarga);

            System.out.println("Kembalian: " + kembalian);

            // Memanggil method daftar barang
            tampilkanDaftarBarang(
                    namaBarang, jumlahBeli);

        } else {
            System.out.println("\nUang tidak cukup!");
        }
    }
}
