import java.util.Scanner;
public class MineSweeper {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the board (between 2-30): ");
        int n = getInt(scan);
        System.out.print("Enter the number of bombs: ");
        int m = getInt(scan);
        int[][] arr = new int[n][n];
        System.out.println("An M will be printed in each cell with a bomb.");
        for(int i = 0; i < m ; i++){
            int x = (int)(Math.random()*n);
            int y = (int)(Math.random()*n);
            if(arr[x][y] == m){
                i = i - 1;
            }
            else{
            arr[x][y] = 9;
            if(x!=n-1){
                if(arr[x+1][y]!=9){
            arr[x+1][y]++;
                }
            if(y!=0){
                if(arr[x+1][y-1]!=9){
            arr[x+1][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr[x+1][y+1]!=9){
            arr[x+1][y+1]++;
                }
            }
            }
            if(y!=0){
                if(arr[x][y-1]!=9){
            arr[x][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr[x][y+1]!=9){
            arr[x][y+1]++;
                }
            }
            if(x!=0){
                if(arr[x-1][y]!=9){
            arr[x-1][y]++;
                }
            if(y!=0){
                if(arr[x-1][y-1]!=9){
            arr[x-1][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr[x-1][y+1]!=9){
            arr[x-1][y+1]++;
                }
            }
            }
            if(arr[x][y] > 6 && arr[x][y] != 9){
                arr[x][y] = 6;
            }
            if (x < n-1){
            if (arr[x+1][y] > 6 && arr[x+1][y] != 9){
                arr[x+1][y] = 6;
            }
            }
            if (x != 0){
                if(arr[x-1][y] > 6 && arr[x-1][y] != 9){
                    arr[x-1][y] =6;
                }
            }if (y < n-1){
            if (arr[x][y+1] > 6 && arr[x][y+1] != 9){
                arr[x][y+1] = 6;
            }
            }
            if (y != 0){
                if(arr[x][y-1] > 6 && arr[x][y-1] != 9){
                    arr[x][y-1] =6;
                }
            }
            }

        }
        for(int i = 0; i<n; i++){// rays
            for(int x = 0; x<n; x++){//columns
                if (arr[i][x] == 9){
                    System.out.print(" M"); //show the mines as M
                }
                else{
                System.out.print(" "+arr[i][x]);//print out numbers
                }
            }
            System.out.println();//print out the next line
        }
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
}