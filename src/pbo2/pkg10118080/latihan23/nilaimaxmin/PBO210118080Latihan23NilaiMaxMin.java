/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan23.nilaimaxmin;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama :Taufiq Rizky
 * NIM  :10118080
 * Deskripsi Program    : program mencari nilai terbesar dan terkecil
 */
public class PBO210118080Latihan23NilaiMaxMin {

    /**
     * @param args the command line arguments
     */
    public static int Terbesar(int[] j) {
        int max = j[0];
        for (int i = 1; i < j.length; i++) {
            if (j[i] > max) {
                max = j[i];
            }
        }
        return max;
    }
    public static int Terkecil(int[] j) {
        int min = j[0];
        for (int i = 1; i < j.length; i++) {
            if (j[i] < min) {
                min = j[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        System.out.println("====== Program Nilai Terbesar Dan Terkecil Mahasiswa =====");
        System.out.print("Masukan Nama Petugas \t\t\t: ");
        Scanner Nm = new Scanner(System.in);
        Nama = Nm.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa \t: ");
        Scanner banyak = new Scanner(System.in);
        int j = banyak.nextInt();
        int[] nilai= new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" :");
            Scanner N = new Scanner(System.in);
            nilai[i]=N.nextInt();
        }
        //output
        System.out.println("");
        System.out.println("======= Hasil Nilai Mahasiswa =======");
        for (int i = 0; i < j; i++) 
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" :" +nilai[i]);
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+Terbesar(nilai));
        System.out.println("Nilai Terkecil adalah "+Terkecil(nilai));
        System.out.println("");
        System.out.println("Petugas : "+Nama);
        System.out.println("Developed by Taufiq Rizky");
    }
    
}
