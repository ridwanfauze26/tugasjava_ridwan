/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan5no2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Pertemuan5no2 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Mengambil input alas dari pengguna
        System.out.print("Masukan nilai alas segitiga: ");
        double alas =  scanner.nextDouble();
        
        // Mengambil input tinggi dari pengguna
        System.out.print("Masukan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        
        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;
        
        // Menutup scanner
        scanner.close();
        
        // Menampilkan hasil
        System.out.println("Luas Segitiga: " + luas);
            
    }
}
