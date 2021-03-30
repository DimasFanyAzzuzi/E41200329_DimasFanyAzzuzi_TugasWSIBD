/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulangan_c;
import java.util.*;
public class TugasPerulangan_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data nilai : ");
        int banyakData = input.nextInt();
        
        int data[] = new int[banyakData];
        
        for (int i=0; i<data.length; i++){
            System.out.print("Masukkan Data Nilai ke- "+(i+1)+" : ");
            data[i] = input.nextInt();
        }
        int min, max;
        
        min = data[0];
        max = data[0];
        
        for(int i=0; i<data.length; i++){
            if(data[i] > max){
                max = data[i];   
            }
            else if(data[i] < min){
                min = data[i];    
            }
            
          }
            System.out.println("Nilai Maximum = "+max);
            System.out.println("Nilai Minimum = "+min);
        int hasilNilai=0;
        for (int Total : data){
            hasilNilai = hasilNilai+Total;
        }
        int avg = hasilNilai/data.length;
        
        System.out.println("Nilai Rata-ratanya adalah = "+avg);
        
    }
    
}
