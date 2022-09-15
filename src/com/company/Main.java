package com.company;

public class Main {


    public static void main(String[] args) {
        Competitor first =  new Competitor("First", new FactorialTask(25));
        Competitor second =  new Competitor("Second", new FactorialTask(25));
        Competitor third =  new Competitor("Third", new FactorialTask(25));
        Competitor fourth =  new Competitor("Fourth", new FactorialTask(25));
        Competitor fifth =  new Competitor("Fifth", new FactorialTask(25));

        Thread one = new Thread(first);
        Thread two = new Thread(second);
        Thread three = new Thread(third);
        Thread four = new Thread(fourth);
        Thread five = new Thread(fifth);

        one.start();
        two.start();
        three.start();
        four.start();
        five.start();

    }
}