import java.util.Scanner;
public class Block{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        double length = scan.nextDouble();
        System.out.println("Enter the width");
        double width = scan.nextDouble();
        System.out.println("Enter the Height");
        double height = scan.nextDouble();
        double volume = height*width*length;
        double surface1 = height*width;
        double surface2 = height*length;
        double surface3 = width*length;
        double surfaceTotal= 2*(surface1+surface2+surface3);
        System.out.println("The total volume of a "+length+"x"+height+"x"+width+" block is"+volume);
        System.out.println("The total surface area is "+surfaceTotal);
    }
}