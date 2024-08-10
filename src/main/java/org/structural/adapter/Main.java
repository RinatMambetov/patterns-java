package org.structural.adapter;

/*
Адаптер — это структурный паттерн, который позволяет подружить несовместимые объекты.
 */

public class Main {
    public static void main(String[] args) {
        RoundPeg roundPeg = new RoundPeg(2);
        RoundHole roundHole = new RoundHole(2);

        if (roundHole.fits(roundPeg)) {
            System.out.println("RoundHole fits RoundPeg");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(3);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("RoundHole fits smallSquarePegAdapter");
        }
        if (roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("RoundHole fits largeSquarePegAdapter");
        }
    }
}
