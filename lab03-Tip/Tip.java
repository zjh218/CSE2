import java.util.Scanner;
public class Tip{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the bill cost: ");
        double bill = scan.nextDouble();
        System.out.println("enter the precentage you wish to tip, as an integer, not a decimal");
        double tip = scan.nextInt();
        tip /= 100;
        System.out.println("Enter the number of ways to split the check");
        int people = scan.nextInt();
        double total = (bill*(1+tip));
        double each = total/people;
        System.out.printf("The cost is %.2f each",each);
    }
}