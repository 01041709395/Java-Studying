public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        System.out.println(abc);
        System.out.println(num);

        char[] result = new char[abc.length+num.length]; //배열 abc,num을 붙여서 하나의 배열(result)로 선언
        System.arraycopy(abc,0,result,0,abc.length);
        System.arraycopy(num,0,result,abc.length,num.length);
        System.out.println(result);

        System.arraycopy(abc,0,num,0,abc.length); //배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이 만큼 복사
        System.out.println(num);

        System.arraycopy(abc,0,num,6,3); //number의 인덱스 6위치에 3개를 복사
        System.out.println(num);
    }
}
