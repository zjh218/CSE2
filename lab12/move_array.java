import java.util.Scanner;
import java.util.Arrays;
public class move_array{
    public static void main (String [] args){
        int[] array;
        int temp = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int s = getInt(scan);
        System.out.println("Enter the value to be moved: ");
        int m = getInt(scan);
        m=m-1;
        //int s = 5;
        try {
        array = new int[s];
        }
        catch (NegativeArraySizeException ex){
            System.out.println("invalid size. Set to default [10]");
            array = new int[10];
            s=10;
        }
        for (int i = 0; i < s; i++){
            array[i] = (int)(Math.random()*100);
        }
        s = array.length;
        //System.out.println(m+" "+s);
        try{

        temp = array[m];
       // System.out.println(temp);
        System.out.println(Arrays.toString(array));
        for (int j = m; j < s-1; j++){
            array[j]= array[j+1];
            }
            array[s-1]=temp;
            System.out.println(Arrays.toString(array));
        }
        catch (ArrayIndexOutOfBoundsException exc){
           // System.out.println(exc.getMessage());
           System.out.println("Value  to be moved not inside array size");
           m = 5;
        temp = array[m];
        System.out.println(temp);
        System.out.println(Arrays.toString(array));
        for (int j = m; j < s-1; j++){
            array[j]= array[j+1];
            }
            array[s-1]=temp;
            System.out.println(Arrays.toString(array));
        }
    }
    public static int getInt (Scanner scan){//take inputs of type integer
        while (true){
            if (scan.hasNextInt()){
                    return scan.nextInt();
                }
            System.out.println("That wasn't an option. Try again");
            scan.next();//clear scanner
        }
    }
}