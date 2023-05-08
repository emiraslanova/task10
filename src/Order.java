
import java.util.ArrayList;
import java.util.List;

public class Order {

    //sifaris qebul etmek
    // verilen sifarislerin ne oldugunu gormek
    //verilen sifarislerin hesabini hesablamaq

          public static ArrayList<Meal> meals=new ArrayList<>();
          public static ArrayList<Drink> drinks=new ArrayList<>();
          public static ArrayList<Sifaris> sifarisler=new ArrayList<>();

          public static void sifarisverirem(){
              Sifaris s=new Sifaris(Order.meals.get(1));
              Order.sifarisler.add(s);
              Sifaris d = new Sifaris(Order.drinks.get(0));
              Order.sifarisler.add(d);
              System.out.println(Order.sifarisler);


          }

}



