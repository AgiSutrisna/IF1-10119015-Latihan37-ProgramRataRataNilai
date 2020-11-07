/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan37.programrataratanilai;

import java.util.Scanner;
/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class RataRataNilai {
    private static Scanner input = new Scanner(System.in);
    private static int i, jumlahMhs;
    private static float jumlah, nilaiMhs, ratarata;
    
    private static int inputJumlahMahasiswa(){
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jumlahMhs = input.nextInt();
        return jumlahMhs;
    }
    
    public static double hitungRataRata(){
        inputJumlahMahasiswa();
        jumlah = 0;
        i = 1;
        while (i <= jumlahMhs){
            System.out.print("Nilai Mahasiswa ke-"+i+": ");
            nilaiMhs = input.nextInt();
            jumlah += nilaiMhs;
            i++;
        }
        
    ratarata = jumlah / jumlahMhs;
    return ratarata;
    
    }
}
