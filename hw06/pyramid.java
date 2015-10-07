import java.util.Scanner;
public class pyramid{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size; // initialize size of pyramid, to be input.
        System.out.print("What Size Pyramid?");
        int j = 0;
        int k = 0;
        size = getInt(scan);//used getInt method to find pyramid siz
        int r = (int)(size-1);
        int q = 0;//weird counter
        for (int i = 0; i <= size; i++){
            //# of lines,
                    for(int z = r; z >= 0; z--){
                        System.out.print(" ");
                    }
            for (j = 0; j < (i); j++){
                for ( k = (j); k < (j+1); k++){
                System.out.print('*');
                }
            }
            System.out.println("");
            if ( (q%2) == 0){
                r--;
                q++;
               // System.out.println("iF");
            }
            else {
              //  System.out.println("else");//for checking where my loop lay
                q++;
            }
        }

    }
    public static int getInt (Scanner scan){// method to make sure input is integer
        while (true){
            if (scan.hasNextInt()){
                    return scan.nextInt();//return input integer
                }
            System.out.println("That wasn't an option. Try again");//or keep asking for better input
            scan.next();
        }
        
    }
}
