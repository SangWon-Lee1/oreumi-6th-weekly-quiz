package Java_Interface;

import java.math.BigDecimal;

public class LargeAppliance extends Product{
    LargeAppliance(String name, int price, int weight) {
        super(name, new BigDecimal(price), weight);
    }
}