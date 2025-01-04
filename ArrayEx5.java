public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0; // 총점을 저장하기 위한 변수
        float average = 0f; // 평균을 저장하기 위한 변수

        int[] score = {100,88,100,100,90};

        for (int i=0; i<score.length; i++) { // 배열 길이 score.length로 정의
            sum += score[i]; //배열에 있는 모든 값들을 sum 변수에 저장
        }
        average = sum / (float)score.length; // 정확한 값을 위해 float로 형 변환 후 나누기

        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+average);
    }
}
