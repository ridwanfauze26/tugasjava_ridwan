/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.pertemuan10v2;

/**
 *
 * @author ASUS
 */
public class Pertemuan10v2 {
    public int pengurangan(int bilangan1, int bilangan2){
        int hasil = bilangan1 - bilangan2;
        return hasil;
    }
    public int perkalian(int bilangan1, int bilangan2) {
        int hasil = bilangan1 * bilangan2;
        return hasil;
    }
      public int pembagian(int bilangan1, int bilangan2){
          int hasil = bilangan1 / bilangan2;
          return hasil;
    }
      public int pangkat(int bilangan1, int bilangan2){
          int hasil = bilangan1 ^ bilangan2;
          return hasil;
    }
    
    public static void main(String[] args) {
        // Membuat objek dari class Aritmatika3 ,
        Pertemuan10v2 aritmatika = new Pertemuan10v2();
        
         // Mendefinisikan nilai bilangan
        int bilangan1 = 10;
        int bilangan2 = 5;
        
       // Mengakses metode-metode dari class Aritmatika3 dan menampilkan hasilnya
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        int hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        int hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        
        // Menampilkan hasil
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}