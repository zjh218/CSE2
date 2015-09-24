import java.util.Scanner;
public class CalculatorSpecial{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for a");
        while (true){
            if (scan.hasNextInt()){
                break;
            }
            System.out.println("That wasn't a valid integer. please try again");
            scan.next();
        }
         int a = scan.nextInt();
         System.out.println("Enter the value for b");
         while (true){
            if (scan.hasNextInt()){
                break;
            }
            System.out.println("That wasn't a valid integer. please try again");
            scan.next();
        }
         int b = scan.nextInt();
         System.out.println("Enter the operator (* / + or -)");
         String o;
         while(true){
         o = scan.next();

             if (o.equals("*") || o.equals("/") || o.equals("+") ||o.equals("-")) {
                 break;
             }
             System.out.println("That was not a valid operator, please try again");
         }
        switch (o){
            case "/":
              System.out.println("a/b, or "+a+"/"+b+" is "+(double)(a/b));
                 break;
            case "*":
                 System.out.println("a*b, or "+a+"*"+b+" is "+(double)(a*b));
                 break;
            case "+":
                 System.out.println("a+b, or "+a+"+"+b+" is "+(double)(a+b));
               break;
            case "-":
                 System.out.println("a-b, or "+a+"-"+b+" is "+(double)(a-b));
                 break; 
            default:
                 System.out.println("That was not a valid operator. Please try again.");
                 break;
         }
    }
}