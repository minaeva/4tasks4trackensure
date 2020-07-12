package ua.kiev.minaeva;

import org.junit.Assert;
import org.junit.Test;

public class TestTest1 {

    private static Test1 test1 = new Test1();

    @Test
    public void test1_5_2() {
        int result = test1.test(5);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test1_1_1() {
        Test1 test1 = new Test1();
        int result = test1.test(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test1_10_4() {
        Test1 test1 = new Test1();
        int result = test1.test(10);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test1_11_4() {
        Test1 test1 = new Test1();
        int result = test1.test(11);
        Assert.assertEquals(4, result);
    }

    @Test
    public void test1_15_5() {
        Test1 test1 = new Test1();
        int result = test1.test(15);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test1_20_5() {
        Test1 test1 = new Test1();
        int result = test1.test(20);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test1_21_6() {
        Test1 test1 = new Test1();
        int result = test1.test(21);
        Assert.assertEquals(6, result);
    }

    @Test(expected = RuntimeException.class)
    public void test1_0_exception() {
        test1.test(0);
    }

    @Test(expected = RuntimeException.class)
    public void test1_negative_exception() {
        test1.test(-5);
    }

}
