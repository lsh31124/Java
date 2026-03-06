package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번쨰 숫자 입력");
        int num1 = sc.nextInt();

        System.out.print("두 번쨰 숫자 입력");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("모두 숫자의 합:" + sum);
    }
}
