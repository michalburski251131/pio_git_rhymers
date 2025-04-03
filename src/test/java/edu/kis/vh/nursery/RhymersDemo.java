package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {
    private static final int MAX_COUNT = 15;
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);
    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        countInElements(rhymers);
        countInRandomElements(rhymers);
        printRhymerContents(rhymers);
        printTotalRejected(rhymers);
    }

    private static void printTotalRejected(DefaultCountingOutRhymer[] rhymers) {
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }

    private static void printRhymerContents(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
    }

    private static void countInRandomElements(DefaultCountingOutRhymer[] rhymers) {
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < MAX_COUNT; i++)
            rhymers[3].countIn(rn.nextInt(20));
    }

    private static void countInElements(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < MAX_COUNT; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

}