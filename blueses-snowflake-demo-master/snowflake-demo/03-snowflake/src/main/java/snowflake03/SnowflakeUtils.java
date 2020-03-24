package snowflake03;

public class SnowflakeUtils {

    /** 定义起始时间 2015-01-01 00:00:00 */
    private static final long START_TIME = 1420041600000L;
    /** 上次生成ID的时间截 */
    private static long LAST_TIME_STAMP = -1L;



    public static long genId(){
        long now = System.currentTimeMillis();

        //如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过这个时候应当抛出异常
        if (now < LAST_TIME_STAMP) {
            throw new RuntimeException(String.format("系统时间错误！ %d 毫秒内拒绝生成雪花ID！", START_TIME - now));
        }

        //上次生成ID的时间截
        LAST_TIME_STAMP = now;

        long timePart = now - START_TIME;

        return 0;
    }
}


