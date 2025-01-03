public class FlowEx26 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while((sum += ++i) <= 100) { //i를 1씩 증가시켜서 sum에 계속 더해 나간다 그리고 sum의 값이 100보다 작은지 확인
            System.out.printf("%d - %d%n",i,sum);
        }
    }
}
