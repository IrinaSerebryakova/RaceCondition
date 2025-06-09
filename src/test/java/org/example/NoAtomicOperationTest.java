package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NoAtomicOperationTest {

    @Test
    void shouldIncrementNumber() {
        NoAtomicOperation operation = new NoAtomicOperation();
        operation.increment();
        Assertions.assertEquals(1, operation.getA());
    }

    @Test
    void shouldReturnCurrentValue() {
        NoAtomicOperation operation = new NoAtomicOperation();
        Assertions.assertEquals(0, operation.getA());
    }

}