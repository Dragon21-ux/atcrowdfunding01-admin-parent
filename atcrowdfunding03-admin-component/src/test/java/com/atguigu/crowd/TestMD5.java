package com.atguigu.crowd;

import com.atguigu.crowd.util.CrowdUtil;
import org.junit.Test;

public class TestMD5 {
    @Test
    public void mdTest(){
        String resouorce = "123123";
        String md5 = CrowdUtil.md5(resouorce);
        System.out.println(md5);
    }
}
