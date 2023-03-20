#finding minimum and maximum element in 2d array
import java.util.Scanner;
public class MinMaxArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the rows");
        int row = sc.nextInt();

        System.out.println("enter the columns");
        int coln = sc.nextInt();

        int arr[][] = new int[row][coln];

        System.out.println("enter the array");
        for(int i=0;i<row;i++) {
            for (int j = 0; j < coln; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        int min = arr[0][0];
        for(int i=0;i<row;i++) {
            for (int j = 0; j < coln; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
#this is printing statement
        System.out.println("max elenent is: "+max);
        System.out.println("min element is : "+min);
    }
}
