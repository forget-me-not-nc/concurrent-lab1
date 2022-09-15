package com.company;

/**
 * Created by IntelliJ IDEA.
 * lab1.Task
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 15.09.2022|18:03
 * @Version Task: 1.0
 */

public class FactorialTask implements ITask {

    int param;

    FactorialTask(int param) {
        this.param = param;
    }

    @Override
    public Object solve() throws InterruptedException {
        return factorial(param);
    }

    private long factorial(int n) throws InterruptedException {
        if (n == 0)
            return 1;
        else
            Thread.sleep(100);
            return(n * factorial(n - 1));
    }
}