import java.util.Scanner;
public class pyramid{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size; // initialize size of pyramid, to be input.
        System.out.print("What Size Pyramid?");
        int j = 0;
        int k = 0;
        size = getInt(scan);//used getInt method to find pyramid siz
        int r = (int)(size);
        int q = 0;//weird counter
        int p;
        int z = 1;
        for (int i = 0; i < size; i++){
            p = size-i;
            for (j = 0; j < (p); j++){
             System.out.print(' ');
            }
                for ( k = 0; k < (z); k++){
                System.out.print('*');
            }
            z=z+2;
            System.out.println("");
        }

    }
    public static int getInt (Scanner scan){// method to make sure input is integer
        while (true){
            if (scan.hasNextInt()){
                    return scan.nextInt();//return input integer
                }
            System.out.println("That wasn't an option. Try again");//or keep asking for better input
            scan.next();//clear scanner
        }
        
    }
}
