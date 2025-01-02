public class FlowEx22 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50}; // 10부터 50까지 배열 생성
        int sum = 0; // sum 변수 초기화

        for(int i=0; i<arr.length; i++)  //i보다 배열의 length 클수록 하나씩 순서대로 읽어서 저장
            System.out.printf("%d",arr[i]);
        System.out.println();

        for(int tmp : arr) { // 배열또는 컬렉션의 요소 타입 이어야하며 배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀서 변수에 저장
            System.out.printf("%d",tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum="+sum);
    }
}
