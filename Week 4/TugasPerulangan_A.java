/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulangan_a;
import java.util.*;

public class TugasPerulangan_A {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Batas Awal : ");
        int batasAwal = input.nextInt();
        
        System.out.print("Batas Akhir : ");
        int batasAkhir = input.nextInt();
        
        for(int i=batasAwal; i<batasAkhir; i++) {
            int genap;
            genap = i%2;
            
            if(genap==0) {
                System.out.print(+i);
            }
            System.out.print(" ");
        }
        
    }
    
}
