/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.pertemuan8no2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Pertemuan8no2 {

    public static void main(String[] args) {
        // Membuat objek scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai Tahun Akhir dan Tahun awal dari pengguna
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();
        
        // Menutup scanner
        scanner.close();
        
        // Menampilkan hasil dengan pengulangan for
        System.out.println("Hasilnya:");
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }
    }
}
