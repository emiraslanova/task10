import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        addtomenu();
        showallprice();
        Order.sifarisverirem();
    }

        public static void showallprice () {
            for (Sifaris s : Order.sifarisler) {
                System.out.println(s.sifarismeal.getName() + " - Azn" + s.sifarismeal.getPrice());
            }
            for (Sifaris s : Order.sifarisler) {
                System.out.println(s.sifarisdrink.getName() + " -Azn " + s.sifarisdrink.getPrice());
            }
        }
        public static void addtomenu () {
            Meal burger = new Meal("Burger", 10.0);
            Meal pizza = new Meal("Pizza", 12.0);
            Order.meals.add(burger);
            Order.meals.add(pizza);
            System.out.println(Order.meals);

            Drink coke = new Drink("Coke", 2.0);
            Drink beer = new Drink("Beer", 5.0);
            Order.drinks.add(coke);
            Order.drinks.add(beer);
            System.out.println(Order.drinks);

    }
}

