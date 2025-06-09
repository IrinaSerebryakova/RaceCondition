package org.example;

/**
 * Вспомогательный класс для демонстрации состояния гонки
 */
public class RaceCondition implements Runnable{
   private final NoAtomicOperation noAtomicOperation;

    public RaceCondition(NoAtomicOperation noAtomicOperation) {
        this.noAtomicOperation = noAtomicOperation;
    }

    /**
     * Метод выполняется при запуске потока.
     * Если потоков несколько, вызывает состояние гонки.
     */
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            noAtomicOperation.increment();
        }
    }
}