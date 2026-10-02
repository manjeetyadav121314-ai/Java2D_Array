import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int row = sc.nextInt();

        System.out.print("Enter the column : ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int[][] transpose = new int[col][row];

        System.out.println("Enter the element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("transpose print");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {
                arr[j][i] = arr[i][j];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
