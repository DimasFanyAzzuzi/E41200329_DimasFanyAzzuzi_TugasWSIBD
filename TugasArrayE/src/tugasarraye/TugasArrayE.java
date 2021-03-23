/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasArrayE;
import java.util.*;

/**
 *
 * @author zia
 */
public class TugasArrayE {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String[] menu = {"1. Soft Drinks","2. Mix Juice","3. Nescafe", "4. Soda Milk", "5. Tea"};
        
        System.out.println("SPECIAL MENU");
        for(int i = 0; i<menu.length; i++){
            System.out.println(menu[i]);
        }
       
        System.out.print("Masukkan Nama Pembeli : ");
        String namaPembeli = input.nextLine();
        System.out.print("silahkan Masukkan pilihan anda : 1. Soft Drinks ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1 : 
                System.out.println("menu yang anda pilih adalah : 2"+menu[0]);
                break;
            case 2 : 
                System.out.println("menu yang anda pilih adalah : "+menu[1]);
                break;
            case 3 : 
                System.out.println("menu yang anda pilih adalah : "+menu[2]);
                break;
            case 4 : 
                System.out.println("menu yang anda pilih adalah : "+menu[3]);
                break;
            case 5 : 
                System.out.println("menu yang anda pilih adalah : "+menu[4]);
                break;
        }
        System.out.println("Pesanan anda akan segera kami antar");
        System.out.println("terima kasih "+ namaPembeli+" telah berkunjung di cafe ceria");
    }
    
}