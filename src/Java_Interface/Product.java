package Java_Interface;

import java.math.BigDecimal;

public class Product implements Promotion{
    String name;
    BigDecimal price;
    int weight;

    Product (String name, BigDecimal price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public BigDecimal getDiscountAmount() {
        BigDecimal discountAmount = switch (name) {
            case "beauty" -> new BigDecimal("2000");
            case "grocery" -> new BigDecimal("10000");
            default -> BigDecimal.ZERO;
        };
        return discountAmount;
    }

    BigDecimal getPrice() {
        return price.subtract(getDiscountAmount());
    }

    int getWeight() {
        return weight;
    }
}