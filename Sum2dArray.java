import java.util.Scanner;

public class Sum2dArray {
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
        int sum = 0;
        int countEven = 0;
        int countOdd = 0;
        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum = sum + arr[i][j];
                if (arr[i][j] % 2 == 0) {
                    countEven = countEven + 1;
                } else {
                    countOdd = countOdd + 1;
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Sum of all element : " + sum);
        System.out.println("Count of Even number : " + countEven);
        System.out.println("Count of odd number : " + countOdd);
        System.out.println("Largest number : " + max);
        System.out.println("Smallest number : " + min);

        sc.close();
    }
}
