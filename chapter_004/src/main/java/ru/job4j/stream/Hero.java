package ru.job4j.stream;

/**
 * Класс демонстрирует работу шаблона Строитель,
 * который используется для построения Stream.
 *
 * @author Iuriy Gaydarzhi.
 * @since 11.10.2021
 */
public class Hero {

    private String name;
    private int level;
    private double straight;
    private double agility;
    private double intelligence;
    private boolean ultimate;
    private String gender;

    /**
     * Конструктор.
     */
    public Hero() {
    }

    /**
     * Основной метод, демонстрирующий работу шаблона Строитель.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {

        Hero hero = new Builder()
                .buildLevel(30)
                .buildName("Ursa")
                .buildAgility(50)
                .buildStraight(65)
                .buildIntelligence(40)
                .buildUltimate(true)
                .buildGender("Male").build();
        System.out.println(hero);

        Hero hero2 = new Builder()
                .buildLevel(28)
                .buildName("Mirna")
                .buildAgility(55)
                .buildStraight(40)
                .buildIntelligence(45)
                .buildUltimate(false)
                .buildGender("Female").build();
        System.out.println(hero2);
    }

    /**
     * Переопределенный метод.
     *
     * @return Строку в консоль.
     */
    @Override
    public String toString() {
        return "Hero{"
                + "Name = '"
                + name + '\''
                + ", Level = " + level
                + ", Straight = " + straight
                + ", Agility = " + agility
                + ", Intelligence = " + intelligence
                + ", Ultimate = " + ultimate
                + ", Gender = '" + gender + '\''
                + '}';
    }

    /**
     * Вложенный класс. Вызываем метод Строителя.
     */
    static class Builder {
        private String name;
        private int level;
        private double straight;
        private double agility;
        private double intelligence;
        private boolean activated;
        private String gender;

        /**
         * Метод, инициализирует поле name.
         *
         * @param name Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Метод, инициализирует поле level.
         *
         * @param level Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildLevel(int level) {
            this.level = level;
            return this;
        }

        /**
         * Метод, инициализирует поле straight.
         *
         * @param straight Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildStraight(double straight) {
            this.straight = straight;
            return this;
        }

        /**
         * Метод, инициализирует поле agility.
         *
         * @param agility Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildAgility(double agility) {
            this.agility = agility;
            return this;
        }

        /**
         * Метод, инициализирует поле agility.
         *
         * @param intelligence Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildIntelligence(double intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        /**
         * Метод, инициализирует поле agility.
         *
         * @param ultimate Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildUltimate(boolean ultimate) {
            this.activated = ultimate;
            return this;
        }

        /**
         * Метод, инициализирует поле agility.
         *
         * @param gender Входящий аргумент.
         * @return Поле класса.
         */
        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        /**
         * Метод, который построит готовый объект.
         *
         * @return Возвращает экземпляр.
         */
        Hero build() {
            Hero hero = new Hero();
            hero.name = name;
            hero.level = level;
            hero.straight = straight;
            hero.agility = agility;
            hero.intelligence = intelligence;
            hero.ultimate = activated;
            hero.gender = gender;
            return hero;
        }
    }
}