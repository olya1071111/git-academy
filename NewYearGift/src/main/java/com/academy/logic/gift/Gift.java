package com.academy.logic.gift;

import com.academy.sort.SortByName;
import com.academy.candy.Candy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Gift implements IGift {

    List<Candy> candies = new ArrayList<Candy>();

    public Gift() {
    }

    public Gift(List<Candy> candies) {
        this.candies = candies;
    }

    public List<Candy> getCandy() {
        return this.candies;
    }

    @Override
    public void addCandy(Candy candy) {
        candies.add(candy);
    }


    @Override
    public int getGiftWeight() {
        int result = 0;
        for (Candy candy : this.candies) {
            if (candies != null) {
                result += candy.getWeight();
            } else {
                break;
            }
        }
        return result;
    }

    public List<Candy> sortByName() {
        Collections.sort(candies, new SortByName());
        return candies;
    }

    public List<Candy> findCandyBySugar(double sugar1, double sugar2) {
        List<Candy> result = new ArrayList<>();
        for (Candy candy : this.candies) {
            if ((candy.getSugar() >=sugar1)&&(candy.getSugar()<=sugar2)) {
                result.add(candy);
            } else {
                break;
            }
        }
        return result;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(candies, gift.candies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candies);
    }
}
