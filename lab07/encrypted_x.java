import java.util.Scanner;
public class encrypted_x{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size; // initialize size of pyramid, to be input.
        System.out.print("Enter the Size (between 1-100)");
        while(true){
        size = getInt(scan);//used getInt method to find  siz
        if (size > 0 && size < 101){
            break;
        }
        System.out.println("That was not a valid input. try again");
        }
        for (int i = 0; i <=size;i++){
            check:
            for (int j = 0; j <=size; j++){
                if ((j == (i)) ||(j == (size-i)) ){
                   // System.out.print('*');
                   System.out.print(' ');
                }
                else{
                System.out.print('*');
                }
            }
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
