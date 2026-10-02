import java.util.Scanner;

public class sumRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int row = sc.nextInt();

        System.out.print( "Enter the col : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the element");
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++) {
            int sum = 0;
            for(int j=0; j<col; j++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Row " + i + " Sum : " + sum);
        }
        sc.close();
    }
}
