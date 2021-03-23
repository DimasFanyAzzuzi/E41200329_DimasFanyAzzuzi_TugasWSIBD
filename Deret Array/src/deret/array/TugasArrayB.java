/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deret.array;
import java.util.*;

/**
 *
 * @author zia
 */
public class TugasArrayB {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
   
        System.out.print("Masukan Jumlah Kata : ");
        int jumlahData=input.nextInt();
        
        //Deklarasi array
        String data[]=new String[jumlahData];
        
        for (int i=0; i<data.length; i++){
            System.out.print("Masukkan Kata ke "+(i+1)+" : ");
            data[i] = input.next();
        }
        
        System.out.println("kata yang dimasukkan : ");
        for(int i = 0; i<data.length;i++){
            System.out.print(data[i]+ " ");
        }
    }
    
}