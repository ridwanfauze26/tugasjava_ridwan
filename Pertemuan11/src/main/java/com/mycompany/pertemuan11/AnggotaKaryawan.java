/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan11;

/**
 *
 * @author ASUS
 */
public class AnggotaKaryawan {
    int id,gajiPokok;
    String nama,jabatan,gol;
    
    void setKaryawan(int id, String nama, String gol,String jabatan, int gajipokok) {
        this.id = id;
        this.nama = nama;
        this.gol = gol;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
    }
    
     void getKaryawan() {
        System.out.println("ID Karyawan : " + id);
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan : " + gol);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }

 }
