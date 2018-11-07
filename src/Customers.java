/**
 * Класс посетителя.
 * @version   05 Nov 2018
 * @author    Shakhov Pavel
 */

public final class Customers {
    /** Предельный рабочий возраст для М.*/
    public static final int TOP_MALE_AGE = 64;
    /** Предельный рабочий возраст для Ж.*/
    public static final int TOP_FEMALE_AGE = 59;

    /** Имя посетителя.*/
    private String name;
    /** Пол посетителя.*/
    private char sex;
    /** Возраст посетителя.*/
    private int age;

    /** Геттер имени посетителя.
     *  @return */
    public String getName() {
        return name;
    }

    /** Сеттер имени посетителя.
     * @param n .*/
    public void setName(final String n) {
        this.name = name;
    }

    /** Геттер пола посетителя.
     * @return */
    public char getSex() {
        return sex;
    }

    /** Сеттер пола посетителя.
     * @param s .*/
    public void setSex(final char s) {
        this.sex = sex;
    }

    /** Геттер возраста посетителя.
     * @return */
    public int getAge() {
        return age;
    }

    /** Сеттер пола посетителя.
     * @param a .*/
    public void setAge(final int a) {
        this.age = age;
    }

    public Customers(final String n, final char s, final int a) {
        this.name = n;
        this.sex = s;
        this.age = a;
    }

    /** Геттер возраста посетителя.
     * @return */
    public boolean isRetired() {
        if (sex == 'm') {
            return age > TOP_MALE_AGE;
        } else if (sex == 'f') {
            return age > TOP_FEMALE_AGE;
        }
        throw new IllegalArgumentException("Incorrect sex or its register!");
    }

    /** Вовзращает максимальный
     * рабочий возраст для пола.
     * @return */
    public int topAge() {
        if (sex == 'm') {
            return TOP_MALE_AGE;
        } else if (sex == 'f') {
            return TOP_FEMALE_AGE;
        }
        throw new IllegalArgumentException("Incorrect sex or its register!");
    }
}