package Java_Interface;

import java.math.BigDecimal;

public class Grocery extends Product{
    Grocery(String name, int price, int weight) {
        super(name, new BigDecimal(price), weight);
    }
}