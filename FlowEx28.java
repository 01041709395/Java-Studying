import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1; // math.random을 이용해서 1~100사이의 임의의 수를 answer에 저장
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요 -> ");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 적은 수로 다시 시도해보세요.");
            } else if(input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        } while (input!=answer);
        System.out.println("정답입니다.");
    }
}
