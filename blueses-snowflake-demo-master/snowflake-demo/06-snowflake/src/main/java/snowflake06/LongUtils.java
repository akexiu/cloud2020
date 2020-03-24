package snowflake06;

public class LongUtils {

    public static void main(String[] args) {
        /*System.out.println("-1L 的64位二进制形式：");
        toBinary(-1L);*/


        /*System.out.println(-1L);
        toBinary(-1L);

        System.out.println(-1L<<1);
        toBinary(-1L<<1);

        System.out.println(-1L<<2);
        toBinary(-1L<<2);

        System.out.println(-1L<<3);
        toBinary(-1L<<3);*/


        /*toBinary(3L);
        System.out.println(~3L);
        toBinary(~3L);

        System.out.println();

        toBinary(-9L);
        System.out.println(~(-9L));
        toBinary(~(-9L));*/


        /*System.out.println(~(-1L<<5));
        System.out.println(~(-1L<<12));*/


        toBinary(15L);
        toBinary(5L);
        toBinary(15L & 5L);
        toBinary(15L & 16L);
        toBinary(15L & 17L);
    }



    public static void toBinary(long num){
        String res = Long.toBinaryString(num);
        while (res.length()<64) {
            res = "0" + res;
        }
        System.out.println(res);
    }

}
