package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RaceConditionTest {

    @Test
    void shouldIncrementValueWhenMethodRunWasCalled() throws InterruptedException {
        NoAtomicOperation operation = new NoAtomicOperation();

        Thread thread = new Thread(new RaceCondition(operation));

        thread.start();
        thread.join();

        Assertions.assertEquals(1000, operation.getA());
    }
}