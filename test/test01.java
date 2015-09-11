import java.util.Scanner;
public class test01 {
	public static void main (String[] args){
		Scanner myScanner = new Scanner (System.in);
		String a = new String ("a");
		int m = 1;
		int i = 1;
		int n = 1;
		while(true){
		System.out.println("Enter an integer between 1 and 15");
		if (myScanner.hasNextInt()){
		 int nStars = myScanner.nextInt();
		 if (nStars > 0 && nStars < 16){
		 						for(n = 1; n <= nStars; n++){
			System.out.print('*');
			}
		for ( i = 1; i <= nStars; i++){
			System.out.println();
			for(m = 1; m <= i; m++){
			System.out.print('*');
			}
		}
		 }
		else {
			System.out.println("You did not enter a valid integer");
		}
		System.out.println();
		System.out.println("Enter Y or y to go again");
		a = myScanner.next();
				if ((a.equals("y")) || (a.equals("Y"))){
		}
		else{
			break;
		}
		 }
		else {
			break;
		}
	//	System.out.println("Enter Y or y to go again");
	//	String a = new String ("a");
	//	a = myScanner.next();
	//	if ((a.equals("y")) || (a.equals("Y"))){
	//	}
	//	else{
	//		break;
	//	}
		}

}
}