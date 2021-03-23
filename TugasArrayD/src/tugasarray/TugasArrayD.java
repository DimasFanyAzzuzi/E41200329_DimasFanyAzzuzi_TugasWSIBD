/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarray;
import java.util.*;

/**
 *
 * @author zia
 */
public class TugasArrayD {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Pembeli : ");
        String namaPembeli = input.nextLine();
        
        
        int[] hargaBarang = new int[5];
        int totalHarga = 0;
        boolean bonus  = true;
        
        for(int i = 0; i<hargaBarang.length;i++){
            System.out.print("Masukkan Harga Barang ke "+ (i+1)+ " ");
            hargaBarang[i] = input.nextInt(); 
        }
        
        totalHarga = hargaBarang[0] + hargaBarang[1] + hargaBarang[2] + hargaBarang[3] + hargaBarang[4];
        
        System.out.println("Pembelian Atas Nama : " + namaPembeli + " adalah " + totalHarga);
        
        if (hargaBarang[0] >= 10000 && 
            hargaBarang[1] >= 10000 &&    
            hargaBarang[2] >= 10000 &&    
            hargaBarang[3] >= 10000 &&    
            hargaBarang[4] >= 10000 )
        {
            System.out.println("Selamat Anda Mendapatkan Piring dan Sabun");
        }
        else
        {
            System.out.println("Mohon Maaf Anda Tidak Mendapatkan Piring dan Sabun ");
        }
    }
    
    
}