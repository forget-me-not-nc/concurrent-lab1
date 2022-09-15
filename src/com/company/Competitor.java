package com.company;

/**
 * Created by IntelliJ IDEA.
 * lab1.Competitor
 *
 * @Author: Palijchuk Nazar
 * @DateTime: 15.09.2022|18:01
 * @Version Competitor: 1.0
 */

public class Competitor implements Runnable {

    String name;
    ITask task;

    Competitor(String name, ITask task)
    {
        this.name = name;
        this.task = task;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " got answer: " + task.solve());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}