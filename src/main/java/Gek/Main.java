package Gek;  //почему не работает в основной директории

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// почему работает без аннотаций
public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(Dwarf.class, Elf.class, Raid.class); // всё же что сюда пихать? классы с бинами или конфиг класс

    public static void main(String[] args) {
        Dwarf dwarfTta = context.getBean("dwarf", Dwarf.class);  // так вообще делают? накой тогда спринг
/*      @Value(value = "400")
        dwarfTta.health;  как это используется если значения приходят от вне типо считываем с клавы*/
        dwarfTta.setHealth(300);
        dwarfTta.setLevel(4);
        dwarfTta.setName("Tta");
        System.out.println(dwarfTta);

        Elf elfBty = context.getBean("elf", Elf.class);  // как использовать конструктор с параметрами (300,3,"Аавы")
        elfBty.setHealth(300);
        elfBty.setLevel(4);
        elfBty.setName("Bty");
        System.out.println(elfBty);

        Elf elfHtr = getElf();
        elfHtr.setHealth(200);
        elfHtr.setLevel(2);
        elfHtr.setName("Htr");
        System.out.println(elfHtr);

        Dwarf dwarfGut = context.getBean("dwarf", Dwarf.class);  // так вообще делают? накой тогда спринг
        dwarfGut.setHealth(400);
        dwarfGut.setLevel(5);
        dwarfGut.setName("Gut");
        System.out.println(dwarfGut);

        System.out.println(dwarfTta);



    }

    //@Bean  зачем так создают
    static Elf getElf() {
        return new Elf();
    }
}
