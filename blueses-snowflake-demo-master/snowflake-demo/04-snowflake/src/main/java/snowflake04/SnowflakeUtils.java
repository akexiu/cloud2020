package snowflake04;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.Random;

public class SnowflakeUtils {

    /** 定义起始时间 2015-01-01 00:00:00 */
    private static final long START_TIME = 1420041600000L;
    /** 上次生成ID的时间截 */
    private static long LAST_TIME_STAMP = -1L;

    /** 定义数据id和机器id */
    private static final long DATA_ID = getDataId();
    private static final long WORK_ID = getWorkId();


    public synchronized static long genId(){
        long now = System.currentTimeMillis();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (now < LAST_TIME_STAMP) {
            throw new RuntimeException(String.format("系统时间错误！ %d 毫秒内拒绝生成雪花ID！", START_TIME - now));
        }


        //上次生成ID的时间截
        LAST_TIME_STAMP = now;

        //时间部分
        long timePart = now - START_TIME;



        return 0;
    }


    /**
     * 获取字符串s的字节数组，然后将数组的元素相加，对（max+1）取余
     */
    private static int getHostId(String s, int max){
        byte[] bytes = s.getBytes();
        int sums = 0;
        for(int b : bytes){
            sums += b;
        }
        return sums % (max+1);
    }

    /**
     * 根据 host address 取余，发生异常就获取 0到31之间的随机数
     */
    public static int getWorkId(){
        try {
            return getHostId(Inet4Address.getLocalHost().getHostAddress(), 31);
        } catch (UnknownHostException e) {
            return new Random().nextInt(32);
        }
    }

    /**
     * 根据 host name 取余，发生异常就获取 0到31之间的随机数
     */
    public static int getDataId() {
        try {
            return getHostId(Inet4Address.getLocalHost().getHostName(), 31);
        } catch (UnknownHostException e) {
            return new Random().nextInt(32);
        }
    }


    public static void main(String[] args) {
        System.out.println(genId());
    }
}


