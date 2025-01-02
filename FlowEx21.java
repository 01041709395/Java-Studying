public class FlowEx21 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) { // 1부터 5까지 1씩 증가해서 출력
            for(int j=1; j<=5; j++) {
                if(i==j) {
                    System.out.printf("[%d,%d]",i,j); // 만약 i변수와 j변수 수가 동일하다면 값을 출력
                }else {
                    System.out.printf("*"," "); // 아닌 경우 별을 출력
                }
            }
            System.out.println();
        }
    }
}
