/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16v2;

/**
 *
 * @author ASUS
 */
import kalkulatorPack.Kalkulator;

public class Pertemuan16v2 {

     public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        double tambah = kalkulator.getTambah(9.5, 2.5);
        System.out.println(tambah);
             
        double kurang = kalkulator.getKurang(9.5, 2.5);
        System.out.println(kurang);
        
        double bagi = kalkulator.getBagi(9.5, 2.5);
        System.out.println(bagi);
        
        double kali = kalkulator.getKali(9.5, 2.5);
        System.out.println(kali);
    }
}