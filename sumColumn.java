import java.util.Scanner;

public class sumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int row = sc.nextInt();

        System.out.print("Enter the column : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum : " + sum);
        }
        sc.close();
    }
}
