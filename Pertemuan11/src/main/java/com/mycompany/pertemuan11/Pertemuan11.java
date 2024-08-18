/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan11;

/**
 *
 * @author ASUS
 */
public class Pertemuan11 {

     public static void main(String[] args) {
       AnggotaKaryawan karyawan1 = new AnggotaKaryawan();
       karyawan1.setKaryawan(0001, "Zenal", "A", "Manager", 15000000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        AnggotaKaryawan karyawan2 = new AnggotaKaryawan();
        karyawan2.setKaryawan(0002, "Nana", "B", "Supervisor1", 9000000);
        karyawan2.getKaryawan();
        
         System.out.println("----------------------------");
        
        AnggotaKaryawan karyawan3 = new AnggotaKaryawan();
        karyawan3.setKaryawan(0002, "Yadi", "B", "Supervisor2", 8000000);
        karyawan3.getKaryawan();
    }
}
