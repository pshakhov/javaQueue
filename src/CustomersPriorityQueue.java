import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Реализовать очередь на почту,
 * учитывать возраст покупателей,
 * если пенсионер,
 * обслуживать без очереди.
 *
 * @version 1.0 04 Nov 2018
 * @author Pavel Shakhov
 * @param
 */

 /** Класс очереди с приоритетами
  * для посетителей.*/
 public final class CustomersPriorityQueue {

     /** Возраст посетителя 1.*/
     private static final int HP_AGE = 16;
     /** Возраст посетителя 2.*/
     private static final int SH_AGE = 80;
     /** Возраст посетителя 3.*/
     private static final int AD_AGE = 115;

     /** Возраст посетителя 4.*/
     private static final int GH_AGE = 17;
     /** Возраст посетителя 5.*/
     private static final int MM_AGE = 66;
     /** Возраст посетителя 6.*/
     private static final int HR_AGE = 95;

     /** Имплементируем компаратор
      * для посетителей.*/
     private class CustomersComparator implements Comparator<Customers> {
         @Override
         public int compare(final Customers c1, final Customers c2) {
             int a1 = c1.getAge();
             int a2 = c2.getAge();
             if (c1.isRetired()) {
                 a1 = Customers.TOP_FEMALE_AGE;
             }
             if (c2.isRetired()) {
                 a2 = Customers.TOP_FEMALE_AGE;
             }
             if (a1 > a2) {
                 return 1;
             }
             if (a1 < a2) {
                 return -1;
             }
             return 0;
         }
     }

     /** Основной/главный метод.
      * @param args .*/
     public static void main(final String[] args) { }
     /** Создаем очередь с приоритетами
      * с компаратором.*/
     private PriorityQueue<Customers> customers = new
             PriorityQueue<>(new CustomersComparator());

     /** Метод добавления
      * посетителя в очередь.
      * @param c .*/
     public void add(final Customers c) {
         customers.add(new Customers("Harry Potter", 'm', HP_AGE));
         customers.add(new Customers("Horace Slughorn", 'm', SH_AGE));
         customers.add(new Customers("Albus Dumbledore", 'm', AD_AGE));

         customers.add(new Customers("Hermione Granger", 'f', GH_AGE));
         customers.add(new Customers("Minerva McGonagall", 'f', MM_AGE));
         customers.add(new Customers("Rolanda Hooch", 'f', HR_AGE));

      System.out.println(customers);
     }

     /** Метод вызова посетителя
      * с удалением предыдущего.
      * @return */
     //public Customers next() {
     //    return customers.remove();
     //}

     public Customers next() {
         return customers.poll();
     }

     public boolean isEmpty() {
         return customers.isEmpty();
     }
 }