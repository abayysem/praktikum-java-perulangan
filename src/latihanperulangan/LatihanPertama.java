/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanperulangan;

/**
 *
 * @author USER
 */
public class LatihanPertama {
    public static void main(String[] args) {

        // Menampilkan barang dari 1 sampai 10
        System.out.println("Nomor urut barang:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Barang ke-" + i);
        }

        // Menampilkan barang dari 10 sampai 1
        System.out.println("\nNomor urut barang terbalik:");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Barang ke-" + i);
        }
    }
}
