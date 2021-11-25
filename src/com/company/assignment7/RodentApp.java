package com.company.assignment7;

import java.util.ArrayList;
import java.util.List;

public class RodentApp {
    public static void main(String[] args) {
        List<Rodent> rodentGroup = new ArrayList<>();

        Rodent mouse = new Mouse();
        Rodent gerbil = new Gerbil();
        Rodent hamster = new Hamster();

        mouse.setName("mouse");
        gerbil.setName("gerbil");
        hamster.setName("hamster");


        rodentGroup.addAll(List.of(mouse, gerbil, hamster));
        for(Rodent rodent : rodentGroup) {
            System.out.println(rodent.name);
            rodent.eat();
            rodent.run();
            rodent.dig();
        }
    }
}
