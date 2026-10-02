import java.util.Scanner;

public class print2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int row = sc.nextInt();

        System.out.print("Enter the col : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("print element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
