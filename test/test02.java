import java.util.Scanner;
public class test02{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
  int f = (n%5);
  int t = (n%3);
  if (f == 0 || t == 0){
  System.out.println(true) ;
  }
  else {
  System.out.println(false);
  }
  
}
}