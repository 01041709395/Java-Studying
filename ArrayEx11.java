public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0; i < numArr.length; i++) { //길이가 10개인 배열을 생성하고 0과 9사이의 임의의 값으로 초기화 한다.
            numArr[i] = (int) (Math.random()*10);
            System.out.print(numArr[i]);
        }
        System.out.println();

        for (int i=0; i<numArr.length; i++) { // 그리고 이 배열에 저장된 각 숫자가 몇번 반복해서 나타나는지 세어서 배열 counter에 담은 다음 화면에 출력한다.
            counter[numArr[i]]++;
        }
        for (int i=0; i< numArr.length; i++) {
            System.out.println(i+"의 개수 : "+counter[i]);
        }
    }
}
