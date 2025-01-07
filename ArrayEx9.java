import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4,-1,3,6,11}; // 불연속적인 값들의 배열
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {
            int tmp = (int)(Math.random() * code.length); // tmp에 0,1,2,3,4중 하나가 저장된다
            arr[i] = code[tmp];
            arr[0] = code[4];
            arr[0] = 11;
        }
        System.out.println(Arrays.toString(arr));
    }
}
