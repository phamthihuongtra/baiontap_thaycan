package SoNguyenTo;

import java.util.Scanner;

public class songuyento {
    public  static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i<= n /2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so nguyen to n");
         int n = scanner.nextInt();
         if(isPrime(n)) {
             System.out.println(n+"la so nguyen to!");
         }else {
             System.out.println(n+"khong la so nguyen to!");
         }
         scanner.close();
    }
}