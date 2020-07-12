package ua.kiev.minaeva;

import org.junit.Assert;
import org.junit.Test;

public class TestTest2 {

    private static Test2 test2 = new Test2();

    @Test
    public void test2_186254837_49() {
        int[] input = {1,8,6,2,5,4,8,3,7};
        int result = test2.test(input);
        Assert.assertEquals(49, result);
    }

    @Test
    public void test2_816254837_56() {
        int[] input = {8,1,6,2,5,4,8,3,7};
        int result = test2.test(input);
        Assert.assertEquals(56, result);
    }

    @Test
    public void test2_1111111155_9() {
        int[] input = {1,1,1,1,1,1,1,1,5,5};
        int result = test2.test(input);
        Assert.assertEquals(9, result);
    }

    @Test
    public void test2_11155_5() {
        int[] input = {1,1,1,5,5};
        int result = test2.test(input);
        Assert.assertEquals(5, result);
    }

    @Test
    public void test2_111515_10() {
        int[] input = {1,1,1,5,1,5};
        int result = test2.test(input);
        Assert.assertEquals(10, result);
    }

    @Test
    public void test2_1115115_15() {
        int[] input = {1,1,1,5,1,1,5};
        int result = test2.test(input);
        Assert.assertEquals(15, result);
    }

    @Test
    public void test2_1115116_15() {
        int[] input = {1,1,1,5,1,1,6};
        int result = test2.test(input);
        Assert.assertEquals(15, result);
    }

    @Test(expected = RuntimeException.class)
    public void test2_negative_exception() {
        int[] input = {1,1,1,5,1,1,-6};
        test2.test(input);
    }

    @Test(expected = RuntimeException.class)
    public void test2_shortArray_exception() {
        int[] input = {1};
        test2.test(input);
    }

    @Test(expected = RuntimeException.class)
    public void test2_null_exception() {
        test2.test(null);
    }

}
