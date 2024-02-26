package DeleteElement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Nhập vị trí phần tử cần xóa: ");
        int indexToRemove = scanner.nextInt();

        for (int i = indexToRemove; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Mảng sau khi xóa:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
