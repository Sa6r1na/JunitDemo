package com.lingbei.Test;

import com.lingbei.util.MessageUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

   String message = "Hello World!";
   MessageUtil messageUtil = new MessageUtil(message);

//   @Test(timeout=1000)
    @Test
    public void testPrintMessage(){
       assertEquals(message,messageUtil.printMessage());
   }
}
