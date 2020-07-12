package ua.kiev.minaeva;

import org.junit.Assert;
import org.junit.Test;

public class TestTest3 {

    private static Test3 test3 = new Test3();

    @Test
    public void test3_horse_rose_2() {
        int result = test3.test("horse","rose");
        Assert.assertEquals(2, result);
    }

    @Test
    public void test3_CONNECT_CONEHEAD_4() {
        int result = test3.test("CONNECT","CONEHEAD");
        Assert.assertEquals(4, result);
    }

    @Test
    public void test3_POLYNOMIAL_EXPONENTIAL_6() {
        int result = test3.test("POLYNOMIAL","EXPONENTIAL");
        Assert.assertEquals(6, result);
    }

    @Test
    public void test3_дагестан_арестант_3() {
        int result = test3.test("дагестан","арестант");
        Assert.assertEquals(3, result);
    }

    @Test
    public void test3_loft_sun_4() {
        int result = test3.test("loft","sun");
        Assert.assertEquals(4, result);
    }

    @Test
    public void test3_sun_loft_4() {
        int result = test3.test("sun", "loft");
        Assert.assertEquals(4, result);
    }

    @Test(expected = RuntimeException.class)
    public void test3_1stnull_exception() {
        test3.test(null, "word");
    }

    @Test(expected = RuntimeException.class)
    public void test3_2ndnull_exception() {
        test3.test("word", null);
    }

}
