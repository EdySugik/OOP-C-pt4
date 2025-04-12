package arraymultidimensi;

import java.util.Scanner;

/**
 *
 * @author Edy
 * TGL: 12 April 2025
 */
public class ArrayMultiDimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] meja = new String[3][2];
        
        meja[0][0] = "Meja A";
        meja[0][1] = "Meja B";
        
        meja[1][0] = "Meja C";
        meja[1][1] = "Meja D";
        
        meja[2][0] = "Meja E";
        meja[2][1] = "Meja F";
        
        Scanner inp = new Scanner(System.in);
        for(int br=0; br<3; br++){
            System.out.printf("Baris ke-%d\n", br);
            for(int kl=0; kl<2; kl++){
                System.out.printf(">> Kolom ke-%d :",kl);
                meja[br][kl] = inp.nextLine();
            }
            System.out.println("");
        }
        
        
    }
    
}
