import java.util.Scanner;
import java.lang.Math;
public class coinflip{
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
	    while(true){
	        System.out.println("Enter the number of coins you would like to flip(0-100)");
	    int num = getInt(scan);
	    if (num < 1){
	        int j=flip();
	        System.out.println("There were "+j+" heads");
	    }
	    else if (num < 101){
	        flip(num);
	    }
	    if (num > 100){
	        break;
	    }
	    }
	}
	public static int flip(){
		int j = (int)(Math.random()+.5);
		int count =0;
		if(j == 1){
			System.out.println("heads "+j);
			count++;
		}
		else if (j==0){
			System.out.println("tails "+j);
		}
		return count;
	}
	public static void flip(int n){
	    int j =0;
		for (int i = 0; i < n; i ++){
		    j=j+flip();
			
		}
		System.out.println("there were "+j+" heads and "+(n-j)+"tails.");
	}
    public static int getInt (Scanner scan){
        while (true){
            if (scan.hasNextInt()){
                    return scan.nextInt();
                }
            System.out.println("That wasn't an option. Try again");
            scan.next();//clear scanner
        }
        
    }
}