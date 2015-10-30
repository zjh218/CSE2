import java.util.Scanner;
public class arrays{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int a = getInt(scan);
        int total = 0;
        int [] array = new int[a];
        for (int i = 0; i < (array.length); i++){
            array[i]=(int)(Math.random()*100);
        }
        System.out.println("The values are: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        for (int k = 0; k < array.length; k++){
            total = total+array[k];
        }
        int average = (int)total/array.length;
        System.out.println("the average is: "+average);
        System.out.println("The values above the average are: ");
        for (int m = 0; m < array.length; m++){
            if (array[m] >= average){
                System.out.println(array[m]);
            }
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