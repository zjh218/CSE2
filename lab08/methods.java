import java.util.Scanner;
import java.util.Arrays;
public class methods{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size; 
        System.out.print("Enter the first Number: ");
        double n1 = getDouble(scan);
        System.out.print("Enter the Second Number: ");
        double n2 = getDouble(scan);
        System.out.print("Enter the Third Number: ");
        double n3 = getDouble(scan);
        System.out.print("Enter the fourth Number: ");
        double n4 = getDouble(scan);
        System.out.print("Enter the fifth Number: ");
        double n5 = getDouble(scan);
        System.out.print("Enter the sixth Number: ");
        double n6  = getDouble(scan);
        System.out.print("Enter the seventh Number: ");
        double n7 = getDouble(scan);
        System.out.print("Enter the eigth Number: ");
        double n8 = getDouble(scan);
        System.out.print("Enter the ninth Number: ");
        double n9 = getDouble(scan);
        System.out.print("Enter the tenth Number: ");
        double n10 = getDouble(scan);
        double avg = getAvg(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
        double med = getMed (n1,n2,n3,n4,n5,n6,n7,n8,n9,n10);
        print(avg, med);
    }
    public static double getDouble (Scanner scan){// method to make sure input is dub
        while (true){
            if (scan.hasNextDouble()){
                    return scan.nextDouble();//return input dub
                }
            System.out.println("That wasn't an option. Try again");//or keep asking for better input
            scan.next();//clear scanner
        }
        
    }
    public static double getAvg (double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double temp = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        return temp;
    }
    public static double getMed (double n1,double n2,double n3,double n4,double n5,double n6,double n7,double n8,double n9,double n10){
        double temp[] = new double [10];
        temp[0]=n1;
        temp[1]=n2;
        temp[2]=n3;
        temp[3]=n4;
        temp[4]=n5;
        temp[5]=n6;
        temp[6]=n7;
        temp[7]=n8;
        temp[8]=n9;
        temp[9]=n10;
        Arrays.sort(temp);
        double temp2= (temp[4]+temp[5])/2;
        return temp2;
    }
    public static void print (double avg, double med){
        System.out.println("The average of the set is "+avg);
        System.out.println("The mean of the set is "+med);
    }
}