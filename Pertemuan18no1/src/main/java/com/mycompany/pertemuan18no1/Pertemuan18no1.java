/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18no1;

/**
 *
 * @author ASUS
 */
public class Pertemuan18no1 {

    public static void validate(int age) {
        if (age < 17) {
            throw new ArithmeticException("Orang ini belum eligible untuk vote!");  // ini adalah contoh throw (Melempar exception )
        } else {
            System.out.println("Orang ini sudah eligible untuk vote!");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());  // ini adalah contoh Block try catch (Menangkap Exception)
        }
        System.out.println("Rest of the code...");
    }
}
