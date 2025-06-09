package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


class MainTest {
    @Test
    void shouldReturnTrueWhenRaceConditionWasHappend() throws InterruptedException {
        NoAtomicOperation noAtomicOperation = new NoAtomicOperation();

        Thread thread1 = new Thread(new RaceCondition(noAtomicOperation));
        Thread thread2 = new Thread(new RaceCondition(noAtomicOperation));

        thread1.start();
        thread2.start();

        assertNotEquals(2000, noAtomicOperation.getA());
    }
}