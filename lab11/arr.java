import java.util.Scanner;
import java.util.Arrays;
public class arr{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int a[] = new int[3]{1, 2, 3};
        int[] b = new int[10];
        int[] c = new int[30];
        int[] temp = new int[20];
       // for (int i = 0; i < 20; i++){
         //   a[i] =(int) (Math.random()*100);
        //}
       /* for (int j = 0; j < 10; j++){
            b[j]=(int)(Math.random()*100);
        }
        temp = sort(a);
        a= temp;
        System.out.println(Arrays.toString(a));
        temp = sort(b);
        b = temp;
        System.out.println(Arrays.toString(b));
        for (int i = 0; i < 10; i ++){
            c[i]=a[i];
            c[i+10]=a[i+10];
            c[i+20]=b[i];
        }
        temp = sort(c);
        c = temp;
        System.out.println(Arrays.toString(c));
        */
    }
    public static int[] sort (int[] a){
        //Arrays.sort(a);
        int temp;
        for (int i = 1; i < a.length; i++){
            for (int j = 1; j < a.length; j++){
                if (a[j] < a[j-1]){
                    temp = a[j];
                    a[j]= a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        return a;
    }
}