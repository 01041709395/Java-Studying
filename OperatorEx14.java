public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';
        for(int i=0; i<26; i++) {
            System.out.println(c++); //'a'부터 26개 문자 출력
        }
        System.out.println(); // 줄바꿈을 한다.

        c = 'A';
        for(int i=0; i<26; i++) {
            System.out.println(c++);
        }
        System.out.println(); //대문자와 소문자 간의 코드값 차이는 10진수로 32이다.

        c='0';
        for(int i=0; i<10; i++) {
            System.out.println(c++);
        }
        System.out.println();
    }
}
