package ru.job4j.stream;

public class Hero {

    private String name;
    private int level;
    private double straight;
    private double agility;
    private double intelligence;
    private boolean ultimate;
    private String gender;

    public Hero() {
    }

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
    }

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

    static class Builder {
        private String name;
        private int level;
        private double straight;
        private double agility;
        private double intelligence;
        private boolean activated;
        private String gender;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildLevel(int level) {
            this.level = level;
            return this;
        }

        Builder buildStraight(double straight) {
            this.straight = straight;
            return this;
        }

        Builder buildAgility(double agility) {
            this.agility = agility;
            return this;
        }

        Builder buildIntelligence(double intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        Builder buildUltimate(boolean ultimate) {
            this.activated = ultimate;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

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