/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.praktikumpbo.guide2;

import java.io.*;
/**
 *
 * @author ASUS
 */
public class mahasiswa {
    private String Nama[] = new String[3];
    private String NIM[] = new String [3];
    private int i;
    
    public void InputData(){
        BufferedReader b;
        b = new BufferedReader (new InputStreamReader (System.in));
        try
        {
            System.out.println("-Input Data Mahasiswa-");
            for (i=0;i<3;i++){
                System.out.println("Masukkan Nama : ");
                Nama [i] = b.readLine();
                System.out.println("Masukkan NIM : ");
                NIM[i] = b.readLine();
            }
        }
        catch (Exception E){}
    }
    public void display(){
        System.out.println("");
        System.out.println("-Display Data Mahasiswa-");
        for(i=0;i<3;i++){
            System.out.println("Nama : "+Nama[i]);
            System.out.println("NIM : "+NIM[i]);
            System.out.println("");
            
        }
         System.out.println("\n");
         System.out.println("Ervie Liana Luby");
         System.out.println("21103060");
    }
}
