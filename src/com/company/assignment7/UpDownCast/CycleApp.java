package com.company.assignment7.UpDownCast;

import java.util.ArrayList;
import java.util.List;

public class CycleApp {

    public static void main(String[] args) {
        List<Cycle> cycles = new ArrayList<>();
        Cycle unicycle = new Unicycle();
        Cycle biycycle = new Bicycle();
        Cycle tricycle = new Tricycle();

        cycles.addAll(List.of(unicycle, biycycle, tricycle));

        for(Cycle cycle : cycles) {
            //cycle.balance();
            if(cycle instanceof BalanceCycle) {
                ((BalanceCycle) cycle).balance();
            }

            System.out.println(cycle.getName());
            System.out.println(cycle.getWheelCount());
            System.out.println();

        }
    }
}
