import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성
        int N = sc.nextInt(); // 사용자로부터 정수 입력 받음
        int i; // 반복문을 위한 변수 선언

        for (i = 1; i <= 9; i++) { // 1부터 8까지 반복
            System.out.println( N +" * "+ i +" = "+ N * i); // N에 i를 곱한 결과 출력
        }
    }
}