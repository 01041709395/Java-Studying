public class ArrayEx8 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성

            for (int i=0; i < ball.length; i++) // 배열의 각 요소에 1~45 값 저장
                ball[i] = i+1; // ball[0]에 1이 저장된다.

            int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
            int j = 0; // 임의의 값을 얻어서 지정할 변수

            for(int i=0; i<6; i++) { // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 섞기
                j = (int)(Math.random() * 45);
                temp = ball[i];
                ball[i] = ball[j];
                ball[j] = temp;
            }

            for (int i=0; i<6; i++) // 배열 ball의 앞에서부터 6개 요소 출력
                System.out.printf("ball[%d]=%d%n",i,ball[i]);
    }
}
