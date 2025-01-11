public class FlowEx15 {
    public static void main(String[] args) { //변수 i의 값이 1부터 10까지 변하는 동안, 다양한 연산자를 활용해 짝수 홀수 제곱 역순 순환 반복 구하는 방법
        System.out.println("i \t 2*i \t 2*i-1 \t i*i \t 11-i \t i%3 \t i/3" );
        System.out.println("-----------------------------------------------");

        for(int i=1; i<=10; i++)
            System.out.printf("%d \t %d \t %d \t %d \t %d \t %d \t %d%n",i,2*i,2*i-1,i*i,11-i,i%3,i/3);
    }
}
