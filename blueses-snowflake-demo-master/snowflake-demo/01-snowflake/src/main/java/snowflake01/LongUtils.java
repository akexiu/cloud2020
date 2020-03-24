package snowflake01;

public class LongUtils {

    public static void main(String[] args) {

        //整型转为64位二进制形式
        toBinary(Long.MAX_VALUE);
        toBinary(0L);
        toBinary(Long.MIN_VALUE);

        //将二进制数字转为对应的long类型数字
        toLong("10101010101");

    }

    public static void toBinary(long num){
        String binary = Long.toBinaryString(num);
        while (binary.length()<64){
            binary = "0" + binary;
        }
        System.out.println(binary);
    }

    public static void toLong(String num){
        System.out.println(Long.valueOf(num,2));
    }
}


