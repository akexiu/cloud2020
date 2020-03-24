package snowflake02;

public class LongUtils {

    public static void main(String[] args) {

        long a = 5L;
        System.out.println("a="+toBinary(a));
        a = a << 20;
        System.out.println("a="+toBinary(a) + "\r\n");

        long b = 8L;
        System.out.println("b="+toBinary(b));
        b = b << 10;
        System.out.println("b="+toBinary(b) + "\r\n");

        long c = 10L;
        System.out.println("c="+toBinary(c) + "\r\n");

        System.out.println("三个数字位移后合并的结果：");
        long d = a | b | c;
        System.out.println("d=" + toBinary(d));

    }

    public static String toBinary(long num){
        String binary = Long.toBinaryString(num);
        while (binary.length()<64){
            binary = "0" + binary;
        }
        return binary;
    }

}


