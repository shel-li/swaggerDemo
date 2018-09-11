package demo.com.test;

import org.junit.Test;

public class MediaTest {

    @Test
    public void test() {
        String weiboStr = "12345,";
        String[] weiboIds = weiboStr.split(",");
        if(null != weiboIds && weiboIds.length>0){
            System.out.println(weiboIds.length+"===="+weiboIds[0]);
        }
    }

}
