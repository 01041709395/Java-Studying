public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i=0; i< arr.length; i++)
            arr[i] = i + 1; // 배열 arr에 1~5저장

            System.out.println("[변경전]");
            System.out.println("arr.length:"+arr.length);
            for(int i=0; i<arr.length; i++)
                System.out.println("arr["+i+"]: +arr[i]");

            int[] tmp = new int[arr.length*2];
    }
}
