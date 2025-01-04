public class FlowEx30 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) { // 숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내는 예제
            if(sum > 100)
                break;
            ++i; // i의 값을 1씩 계속 증가시켜 sum에 저장 , sum 값이 100을 넘으면 if 조건식이 참이므로 break 문 수행
            sum += i; // end of while 반복문 벗어남
        }
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
