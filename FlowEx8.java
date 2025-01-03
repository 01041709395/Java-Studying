import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요. (011231-1111222) -> ");

        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine(); // 입력받은 주민번호 저장

        char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender에 저장(배열에서 성별을 의미하는 값)

        switch (gender) {
            case '1': case '3':
                System.out.println("당신은 남자입니다.");
                break;
            case '2': case '4':
                System.out.println("당신은 여자입니다.");
                break;
            default :
                System.out.println("유효하지 않는 주민번호 입니다.");
        }
    }
}
