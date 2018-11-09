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

     /**
      * Возраст посетителя 1.
      */
     private static final int HP_AGE = 16;
     /**
      * Возраст посетителя 2.
      */
     private static final int SH_AGE = 80;
     /**
      * Возраст посетителя 3.
      */
     private static final int AD_AGE = 115;

     /**
      * Возраст посетителя 4.
      */
     private static final int GH_AGE = 17;
     /**
      * Возраст посетителя 5.
      */
     private static final int MM_AGE = 66;
     /**
      * Возраст посетителя 6.
      */
     private static final int HR_AGE = 95;

     /**
      * Основной/главный метод.
      *
      * @param args .
      */
         public static void main(final String[] args) {

             new CustomersPriorityQueue();

             /** Создаем очередь с приоритетами
              * с компаратором.*/
             PriorityQueue<Customers> customers = new
                     PriorityQueue<>(new CustomersComparator());

             customers.add(new Customers("Harry Potter", 'm', HP_AGE));
             customers.add(new Customers("Horace Slughorn", 'm', SH_AGE));
             customers.add(new Customers("Albus Dumbledore", 'm', AD_AGE));

             customers.add(new Customers("Hermione Granger", 'f', GH_AGE));
             customers.add(new Customers("Minerva McGonagall", 'f', MM_AGE));
             customers.add(new Customers("Rolanda Hooch", 'f', HR_AGE));

             while (!customers.isEmpty()) {
                 //System.out.println(customers.remove().getName());
                 Customers cur = customers.poll();
                 System.out.println(cur.getName() + " " + cur.getAge());

             }
         }
     }