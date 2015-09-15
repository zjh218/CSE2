import java.util.Scanner;
public class Timer{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current time (in four digits): ");
        int current = scan.nextInt();
        System.out.println("Enter the time that you will eat dinner( in a four digit integer): ");
        int dinner = scan.nextInt();
        dinner = dinner + 1000;
        current = current +1000;
        int currenthour = (current/100)-10;
        int currentminute = current%100;
        int dinnerhour = (dinner/100)-10;
        int dinnerminute = dinner%100;
        int totalhour = dinnerhour-currenthour;
        int totalminute = dinnerminute-currentminute;
        if (totalminute < 0){
            totalminute = 60 - totalminute;
            totalhour = totalhour - 1;
        }
        System.out.println("You have "+totalhour+"hours and "+totalminute+" minutes until dinner");
        }
        }