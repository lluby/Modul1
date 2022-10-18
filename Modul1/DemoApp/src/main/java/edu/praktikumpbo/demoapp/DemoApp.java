/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.praktikumpbo.demoapp;

/**
 *
 * @author ASUS
 */
public class DemoApp {

    public static void main(String[] args) {
        int jmlh_looping = 5;
        int bil1 = 5;
        int bil2 = 2;
        DemoObjectOriented demo = new DemoObjectOriented ();
        demo.helloWorld(jmlh_looping);
        System.out.println("\n -Pemanggilan Fungsi Tambah- \n");
        System.out.println("Hasil Operasi Tambah = "+demo.tambah(bil1,bil2)+"\n");
        System.out.println("Ervie Liana Luby");
        System.out.println("21103060");
    }
}
