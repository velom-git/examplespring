package Gek;

import org.springframework.beans.factory.annotation.Autowired;

public class Raid {

    @Autowired
    void fightVSRaid(Dwarf dwarf, Elf elf){  // он создаёт дварфа и эльфа с пустыми филдами? как использовать созданных?
        dwarf.beat();
        elf.run();
        elf.beat();
    }

    @Autowired  //так можно?
    void finish(){  // это метод вызывать какой-то аннотацией или вручную? как настроить порядок вызова методов? они срабатывают при создании бина
        System.out.println("GG");
    }
}
