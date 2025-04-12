package array1dimensi;

import java.util.Scanner;

/**
 *
 * @author Edy
 * TGL: 12 April 2025
 */
public class Array1Dimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0]="Edy";
        nama[1]="Ari";
        nama[2]="Lira";
        nama[3]="Ayudiah";
        nama[4]="Depi";
        
        Scanner inp = new Scanner(System.in);
        System.out.println("~~~~~input Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ){
            System.out.printf("Data Nama Pengunjung ke-%d: ", idx+1);
            nama[idx] = inp.nextLine();
        }
        
        System.out.println("\n~~~~~Output Data Ke Array~~~~~");
        for(int idx=0; idx<5; idx++ ){
            System.out.println("Data Nama Pengunjung ke-"+(idx+1)+ ": " +nama[idx]);
        }
        
        System.out.println("\n~~~~~Output2 Data Ke Array~~~~~");
        int no = 1;
        for(String isi : nama){
            System.out.println(no+". "+isi);
            no++;
        }
        
    }
    
}
