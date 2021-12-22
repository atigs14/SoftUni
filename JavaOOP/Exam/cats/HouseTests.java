package cats;

import org.junit.Test;
import static org.junit.Assert.*;

public class HouseTests {

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldFailWhenNameIsNull(){
            new House(null, 20);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldFailWhenNameIsWhiteSpacess(){
        new House("             ", 15);
    }

    @Test
    public void testIfNameIsCorrect(){
        House house = new House("test", 10);
        assertEquals("test", house.getName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCapacityErrorUnder0(){
        new House("test", -2);
    }

    @Test
    public void testCapacityShouldSetCorrectly(){
        new House("test", 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMaxCapacityError(){
        House house = new House("test", 0);
        house.addCat(new Cat("Johny"));
    }

    @Test
    public void testShouldIncreaseCatCount(){
        House house = new House("test", 5);
        house.addCat(new Cat("Johny"));
        assertEquals(1, house.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldFailIfNoFishIn(){
        House house = new House("test", 0);
        house.removeCat("Johny");
    }

    @Test
    public void testRemoveHouseShouldChangeCapacity(){
        House house = new House("test", 5);
        house.addCat(new Cat("Johny"));
        house.removeCat("Johny");
        assertEquals(0, house.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldFailIfNoFishInWhenTryingToSell(){
        House house = new House("test", 0);
        house.catForSale("Johny");
    }

    @Test
    public void testShouldFeedCatAndSetHungryToFalse(){
        House house = new House("test", 1);
        Cat cat = new Cat("Johny");
        house.addCat(cat);
        house.catForSale("Johny");
        assertFalse(cat.isHungry());
    }

    @Test
    public void testStatistics(){
        House house = new House("test", 14);
        house.addCat(new Cat("Johny"));
        house.addCat(new Cat("Molly"));

        String expected = "The cat Johny, Molly is in the house test!";
        assertEquals(expected, house.statistics());
    }

}
