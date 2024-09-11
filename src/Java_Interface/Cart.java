package Java_Interface;

import java.math.BigDecimal;

public class Cart {
    Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int totalWeight = 0;
        BigDecimal totalPrice = BigDecimal.ZERO;
        int deliveryFee;
        for (Product product : products) {
            totalWeight += product.getWeight();
        }
        if (totalWeight < 3) {
            deliveryFee = 1000;
        } else if (totalWeight >= 3 && totalWeight < 10) {
            deliveryFee = 5000;
        } else {
            deliveryFee = 10000;
        }

        for (Product product : products) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        if (totalPrice.compareTo(new BigDecimal("30000")) >= 0 && totalPrice.compareTo(new BigDecimal("100000")) < 0) {
            deliveryFee -= 1000;
        } else if (totalPrice.compareTo(new BigDecimal("100000")) >= 0){
            deliveryFee = 0;
        }
        return deliveryFee;
    }
}