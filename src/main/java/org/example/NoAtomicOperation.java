package org.example;

/**
 * Класс не атомической операции с общим ресурсом.
 */
public class NoAtomicOperation {
    private int a = 0;

    /**
     * Неатомарная операция
     */
   public void increment(){
       a++;
   }

   public int getA(){
       return a;
   }
}
