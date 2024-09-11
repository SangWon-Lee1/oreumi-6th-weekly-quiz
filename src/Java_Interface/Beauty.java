package Java_Interface;

import java.math.BigDecimal;

public class Beauty extends Product{
    Beauty(String name, int price, int weight) {
        super(name, new BigDecimal(price), weight);
    }
}