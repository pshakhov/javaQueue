import java.util.Comparator;

/**
 * Имплементируем компаратор
 * для посетителей.
 */
class CustomersComparator implements Comparator<Customers> {
    @Override
    public int compare(final Customers c1, final Customers c2) {

        if (c2.getAge() > c1.getRetiredAge()) {
            return 1;
        }
        if (c2.getAge() < c1.getRetiredAge()) {
            return -1;
        }

        return 0;
    }
}