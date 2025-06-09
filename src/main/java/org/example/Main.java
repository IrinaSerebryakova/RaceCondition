package org.example;

/**
 * Класс воспроизводит ситуацию RaceCondition, демонстрирует непредсказуемое поведение.
 * Создаются 2 потока, которые изменяют общий ресурс.
 * Результат работы будет всегда разным.
 * @throws InterruptedException, если выполнение потока было прервано.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
      NoAtomicOperation noAtomicOperation = new NoAtomicOperation();

      Thread thread1 = new Thread(new RaceCondition(noAtomicOperation));
      Thread thread2 = new Thread(new RaceCondition(noAtomicOperation));

      thread1.start();
      thread2.start();

      thread1.join();
      thread2.join();

        System.out.println("Результат работы: " + noAtomicOperation.getA());
    }
}
