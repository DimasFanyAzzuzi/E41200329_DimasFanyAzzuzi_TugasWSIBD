
package selectionsort;

/**
 *
 * @author WinSeven
 */
public class SelectionSort {

    public static void main(String[] args) {
        int [] angka = {4, 7, 9, 2, 5, 1, 10, 3};
        Selection_Short(angka);
    }
    public static void Selection_Short (int [] angka) {
        for (int i = 0; i < angka.length; i++) {
            int terkecil = angka[i];
            for (int j = i; j < angka.length; j++) {
                if (angka[j] <= angka[i]) {
                    angka[i] = angka[j];
                    angka[j] = terkecil;
                    terkecil = angka[i];
                }
            }
        }
        System.out.println("Selection Short");
       for (int k = 0; k < angka.length; k++) {
           System.out.print(angka[k] + " ");
       } 
        System.out.println();
    }
    
}
