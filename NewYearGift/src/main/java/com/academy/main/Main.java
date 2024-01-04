package com.academy.main;

import com.academy.candy.*;
import com.academy.logic.gift.Gift;
import com.academy.printer.Printer;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Gift();

        Candy bounty = new Bounty();
        Candy mars = new Mars();
        Candy snickers = new Snickers();
        Candy twix = new Twix();
        Candy nuts = new Nuts();

        gift.addCandy(snickers);
        gift.addCandy(bounty);
        gift.addCandy(mars);
        gift.addCandy(twix);
        gift.addCandy(nuts);

        System.out.println("A New Year's gift contains:");
        Printer.printGift(gift.getCandy());

        System.out.println("Sort by name candies in the gift:");
        Printer.printGift(gift.sortByName());

        System.out.println("Candies with a set sugar value:");
        Printer.printGift(gift.findCandyBySugar(7,10));

        Printer.printWeight(gift.getGiftWeight());


    }
}
