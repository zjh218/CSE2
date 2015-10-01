import java.util.Scanner;
public class averageGrade{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double grade;
        double total = 0;
        int count = 0;
        double avg;
        while(true){
            grade = getGrade(scan);
            if (grade == 999){
                break;
            }
            count=count+1;
            total=total+grade;
            
        }
        avg = total/count;
        System.out.println("The average grade of the "+count+" tests was "+avg);
    }
    public static double getGrade(Scanner scan){
        System.out.println("Enter a grade between 0 and 100, or 999 to exit.");
        while (true){
            if (scan.hasNextInt()){
                double temp = scan.nextInt();
                if ((temp >= 0 && temp <= 100) || temp == 999){
                    return temp;
                }
            }
            System.out.println("That wasn't a valid grade. Please try again.");
            scan.next();
        }
    }
}