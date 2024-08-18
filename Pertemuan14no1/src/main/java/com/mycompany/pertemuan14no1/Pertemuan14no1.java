/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14no1;

/**
 *
 * @author ASUS
 */
public class Pertemuan14no1  extends Hewan{
    public void suara() {
        System.out.println("Suara Serigala Sumatra RAWRRRRRRRRR");
    }
    
    public static void main(String[] args) {
        Hewan objek = new Pertemuan14no1();
        objek.suara();
        objek.suara2();
    }
}