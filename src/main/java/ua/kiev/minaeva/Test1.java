package ua.kiev.minaeva;

public class Test1 {

    public int test(int n) {
        if (n < 1) throw new RuntimeException("number should be positive");
        int sum = 0;
        int step = 0;
        while (sum <= n) {
            sum += ++step;
        }
        return --step;
    }

}
