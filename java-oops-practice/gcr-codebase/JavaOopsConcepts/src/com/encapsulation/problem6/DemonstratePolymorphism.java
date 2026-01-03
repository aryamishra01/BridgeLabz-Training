package com.encapsulation.problem6;

public class DemonstratePolymorphism {

	public static void main(String[] args) {

        System.out.println("====== Online Food Delivery System ======\n");

        // Polymorphism
        FoodItem item1 = new VegItem("Paneer Butter Masala", 180, 2);
        FoodItem item2 = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(item1);
        processOrder(item2);
    }

    // Polymorphic method
    public static void processOrder(FoodItem item) {

        System.out.println("----------------------------------");
        item.getItemDetails();

        double total = item.calculateTotalPrice();

        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            double discount = d.applyDiscount();

            System.out.println(d.getDiscountDetails());
            System.out.println("Discount Amount : ₹" + discount);

            total -= discount;
        }

        item.placeOrder();

        System.out.println("Final Payable Amount: ₹" + total);
        System.out.println("Order Status: Confirmed");
    }
}
