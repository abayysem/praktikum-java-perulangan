/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanperulangan;

import static latihanperulangan.LatihanKeempat.hitungKembalian;

/**
 *
 * @author USER
 */
public class LatihanKetiga {
        public static void main(String[] args) {

        int totalHarga = 15000;
        int uangBayar = 20000;
        
        if (uangBayar >= totalHarga) {

            int kembalian = hitungKembalian(
                    uangBayar, totalHarga);

            System.out.println("Pembayaran berhasil!");
            System.out.println("Total harga: " + totalHarga);
            System.out.println("Uang bayar: " + uangBayar);
            System.out.println("Kembalian: " + kembalian);

        } else {
            System.out.println("Uang tidak cukup!");
        }
    }
}
