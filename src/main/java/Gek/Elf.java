package Gek;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Elf extends Character implements UsualHero {


    public Elf(int level, int health, String name) {
        this.level = level;
        this.health = health;
        this.name = name;
    }

    public Elf() {} //почему ему нужен пустой конструктор?

    public void voice() {
        System.out.println("Elf tells");
    }

    public void beat() {
        System.out.println("Elf beats");
    }

    public void run() {
        System.out.println("Elf runs");
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "level=" + level +
                ", health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
}
