public class FlowEx31 {
    public static void main(String[] args) {
        for(int i=0; i <= 10; i++) {
            if(i%3==0) // 1과 10 사이의 숫자를 출력하되 그 중에서 3의 배수만 제외 (true가 되는 문장)
                continue;
            System.out.println(i);
        }
    }
}
