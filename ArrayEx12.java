public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"suzi","hyuna","yesom"};

        for(int i=0; i< names.length; i++) { // names 요소 읽기
            System.out.println("names["+i+"]:"+names[i]);

        String tmp = names[2]; // 배열 names의 3번째 요소를 string tmp에 저장
        System.out.println("tmp:"+tmp);
        names[0] = "yesom"; // 배열 names의 첫번째 요소를 yesom으로 변경
        for(String str : names) // 향상된 for문
            System.out.println(str);
        }
    }
}
