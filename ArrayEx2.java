import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
       /* int[] iArr3 = new int[]{100,95,80,70,60};*/
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr = {'a','b','c','d'};

        for (int i=0; i<iArr1.length; i++) {
            iArr1[i] = i + 1; // 1부터 10까지의 숫자를 순서대로 배열에 넣는다.
        for (int j=0; j<iArr2.length; j++) {
            iArr2[j] = (int)(Math.random()*10) + 1; // 1부터 10까지의 값을 랜덤으로 배열에 저장
        }
        for(int k=0; k<iArr1.length; k++) {
            System.out.print(iArr1[k]+",");
        }
        System.out.println();
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
        }
    }
}
