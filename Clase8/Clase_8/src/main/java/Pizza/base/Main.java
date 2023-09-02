package Pizza.base;

import Pizza.especialidades.Pizza_Italiana;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("Pizza Margherita", 10.99);
        pizza.addTopping(new Topping("Tomato sauce", 1.99));
        pizza.addTopping(new Topping("Mozzarella", 2.99));
        pizza.addTopping(new Topping("Basil", 0.99));
        pizza.addTopping(new Topping("Oregano", 0.99));
        pizza.prepare();
        pizza.getPrice();

    }
}