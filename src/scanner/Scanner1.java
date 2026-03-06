package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력");
        String str = sc.nextLine(); //문자열(엔터 칠 떄까지의 글자) 입력받기

        System.out.print("정수를 입력");
        int intValue = sc.nextInt(); // 정수(숫자) 입력받기

        System.out.print("실수 입력");
        double doubleValue = sc.nextDouble(); //실수 입력받기

        System.out.println("입력한 글자:" + str + " 숫자:" + intValue + " 실수:" + doubleValue);

    }
}
