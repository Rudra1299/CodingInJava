package com.company.assignment7.UpDownCast;

public class Unicycle extends BalanceCycle{

    public Unicycle() {
        super();
        System.out.println("This is an Unicycle");
        this.setName("unicyle");
        this.setWheetCount(1);
    }

    @Override
    public void drive() {
        System.out.println("You are riding an Unicycle");
    }

    public void balance() {
        System.out.println("You need to balance this cycle");
    }
}
