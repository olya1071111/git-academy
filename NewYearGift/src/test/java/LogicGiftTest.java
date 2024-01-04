import com.academy.candy.Bounty;
import com.academy.candy.Candy;
import com.academy.candy.Mars;
import com.academy.candy.Nuts;
import com.academy.logic.gift.Gift;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class LogicGiftTest {

    private Gift gift;

    @Before
    public void init() {
        gift = new Gift();
        gift.addCandy(new Bounty());
        gift.addCandy(new Mars());
        gift.addCandy(new Nuts());
    }


    @Test
    public void givenGift_whenGiftNotNull_thenСalculationWeight() {

        double expected = 43;

        double actual = gift.getGiftWeight();

        Assert.assertEquals(expected, actual, 1e-15);

    }

    @Test
    public void givenAmountOfSugar_whenSpecifiedRangeOfSugar_thenReturnCandies() {

       List<Candy> expected = new ArrayList<Candy>();

       expected.add(new Bounty());

       List<Candy> actual = gift.findCandyBySugar(5, 7);

       Assert.assertArrayEquals(expected.toArray(),actual.toArray());

       // assertEquals(new HashSet<Candy>(expected), new HashSet<Candy>(actual));

    }

   }
