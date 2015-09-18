import java.util.Scanner;
public class calculator{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter the value for a");
         int a = scan.nextInt();
         System.out.println("Enter the value for b");
         int b = scan.nextInt();
         System.out.println("Enter the operator (* / + or -)");
         String o = scan.next();
         switch (o){
             case "/":
                 System.out.println("a/b, or "+a+"/"+b+" is "+(a/b));
                 break;
            case "*":
                 System.out.println("a/b, or "+a+"/"+b+" is "+(a/b));
                 break;
            case "+":
                 System.out.println("a+b, or "+a+"+"+b+" is "+(a+b));
                 break;
            case "-":
                 System.out.println("a/b, or "+a+"-"+b+" is "+(a-b));
                 break; 
            default:
                 System.out.println("That was not a valid operator. Please try again.");
                 break;
         }
    }
}