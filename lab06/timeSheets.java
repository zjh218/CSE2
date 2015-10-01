import java.util.Scanner;
public class timeSheets {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num;
        int wage;
        double pay;
        double totalHours;
        double hours;
        //double totalHours = 0;
        double totalPay = 0;
        System.out.println("Enter your number of employees");
        num = getInt(scan);
        for (int i= 0; i < num; i++){
            System.out.println("enter the wage of employee #"+(i+1)+" in cents.");
            wage = getInt(scan);//get pay per cents
            totalHours = 0;
            hours = 0;
            for (int d = 0; d < 5; d++){
                System.out.println("enter the number of hours employee #"+(i+1)+" worked on day #"+(d+1));
            hours = getDouble(scan);// get hours per 5 days
            totalHours = totalHours +hours;
            }
            pay = ((wage*totalHours)/100);
            totalPay= totalPay+pay;
            //math
            //add
        }
        System.out.println("The total pay is $"+totalPay);
    //print that shit
    }
    public static int getInt(Scanner scan){
                while(true){
                  //  scan.next();
            if (scan.hasNextInt()){
                return scan.nextInt();
            }
            System.out.println("That was not a valid input. Try again");
           scan.next();
        }
    }
    public static double getDouble (Scanner scan){
        while (true){
            if (scan.hasNextDouble()){
                    return scan.nextDouble();
                }
            System.out.println("That wasn't an option. Try again");
            scan.next();
        }
        
    }
    
}
