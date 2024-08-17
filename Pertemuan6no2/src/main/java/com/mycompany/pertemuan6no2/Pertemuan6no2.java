/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6no2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Pertemuan6no2 {

    public static void main(String[] args) {
        // Membuat objek scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // Input data dari pengguna
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
        System.out.print("NAMA ? : ");
        String nama = scanner.nextLine();
        
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        // Menentukan grade dan keterangan berdasarkan nilai
        String grade;
        String keterangan;
        
        if (nilai < 50) {
            grade = "Tidak Lulus";
            keterangan = "Tidak Lulus";
        } else if (nilai >= 50 && nilai < 60){
            grade = "D";
            keterangan = "Lulus";
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C";
            keterangan = "Lulus";
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B";
            keterangan = "Lulus";
        } else if (nilai >= 80 && nilai < 90) {
            grade = "A";
            keterangan = "Lulus";
        } else if (nilai >= 90 && nilai < 100) {
            grade = "A+";
            keterangan = "Lulus";
        } else {
            grade = "Data nilai salah";
            keterangan = "Data nilai tidak valid";
        }
        
        // Menutup scanner
        scanner.close();
        
        // Menampilkan hasil
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
        
    }
}
