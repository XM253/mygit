package com.xm.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     *  什么时候会用到异常测试？
     *  我们期望结果为一个异常的时候
     *  比如我们传入某些不合法的参数，程序抛出异常
     *  也就是说我们预期的结果就是异常
     */

    // 这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }

    // 这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
