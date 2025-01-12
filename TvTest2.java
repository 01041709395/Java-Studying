class TVA {
    String color;
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { ++ channel;}
    void channelDown() { -- channel;}
}


public class TvTest2 {
    public static void main(String[] args) {
        TVA t1= new TVA();
        TVA t2 = new TVA();
        System.out.println("t1의 채널 번호는" + t1.channel +"입니다.");
        System.out.println("t2의 채널 번호는" + t2.channel +"입니다.");

        t1.channel=7;
        System.out.println("t1의 channel값을 7로 변경했습니다.");

        System.out.println("t1의 채널 번호는" + t1.channel + "입니다.");
        System.out.println("t2의 채널 번호는" + t2.channel + "입니다.");
    }
}
