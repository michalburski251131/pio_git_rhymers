package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int MAX_STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_INDICATOR= -1;
    private static final int INVALID_STACK_VALUE = -1;
    private final int[] numbers = new int[MAX_STACK_CAPACITY];
    public int total = EMPTY_STACK_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_STACK_CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INVALID_STACK_VALUE;
        return numbers[total--];
    }

}
