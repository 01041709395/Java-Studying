public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79,88,91,33,100,55,98};

        int max = score[0]; //배열의 첫번째 값으로 최대값을 초기화
        int min = score[0]; //배열의 첫번째 값으로 최소값을 초기화

        for(int i=1; i<score.length; i++) { // 배열의 두번째 요소부터 비교
            if(score[i]>max) { // 배열에 담긴 값이 max에 저장된 값보다 크다면, 이 값을 max에 저장
                max = score[i];
            } else if(score[i]<min) { //배열에 담긴 값이 min에 저장된 값보다 작다면, 이 값을 min에 저장
                min = score[i];
            }
        }
        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
    }
}
