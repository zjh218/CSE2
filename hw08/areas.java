import java.util.Scanner;
public class areas{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        while(true){ //initialize continuance loop
        System.out.println("Enter 1 for a circle, 2 for a rectangle, or 3 for a trapezoid, or any other number to exit.");//assign numbers to shapes
        int shape = getInt(scan);
        int total = 0; //get area variable
        if (shape==1){//if it's a circle
            System.out.println("Enter the Radius of the circle :");
            int a = getInt(scan);
             total = area(a);//give one parameter
            System.out.println("Your chosen shape was a circle,");
        }
        else if (shape ==2){//if it's a rectangle
            System.out.println("Enter the Width of the rectangle: ");
            int a = getInt(scan);
            System.out.println("Enter the Height of the rectangle: ");
            int b = getInt(scan);
             total = area(a,b);//give two parameters
            System.out.println("Your chosen shape was a rectangle,");
        }
        else if (shape ==3){//if it's a trapezoid
            System.out.println("Enther a side of the trapezoid: ");
            int a = getInt(scan);
            System.out.println("Enter the other side of the trapezoid: ");
            int b = getInt(scan);
            System.out.println("Enter the height of the trapezoid: ");
            int c = getInt(scan);
             total = area(a,b,c);// give there parameters
            System.out.println("Your chosen shape was a trapezoid,");
        }
        if (shape == 1 || shape == 2 || shape == 3){
            System.out.println(" and the total area is "+total);// print ouf 
            System.out.println("");
        }
        System.out.println("Continue? (Y/y): ");//ask if want to continue
        String cont = getString(scan);//get response
        if (!cont.equals("y") || !cont.equals("Y")){
            break;// if not yes, stop.
        }
        }
    }
    public static int area(int a){
        return (int)(a*a*Math.PI);//calculate area of a circle
    }
    public static int area(int a, int b){
        return (a*b);//area of a rectangle
    }
    public static int area(int a, int b, int c){
        return (((a+b)*c)/2);// area of a trapezoid
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
    public static String getString (Scanner scan){//just to get continuance input
        return scan.next();
    }
}