package n2exercici1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Restaurant> restaurants = new HashSet<Restaurant>();

        Restaurant Restaurante1 = new Restaurant("manolo", 5);
        Restaurant Restaurante2 = new Restaurant("manolo", 4);
        Restaurant Restaurante3 = new Restaurant("Celta", 5);
        Restaurant Restaurante4 = new Restaurant("Celta", 3);
        Restaurant Restaurante5 = new Restaurant("Celta", 5);
        Restaurant Restaurante6 = new Restaurant("manolo", 5);

        restaurants.add(Restaurante1);
        restaurants.add(Restaurante2);
        restaurants.add(Restaurante3);
        restaurants.add(Restaurante4);
        restaurants.add(Restaurante5);
        restaurants.add(Restaurante6);


        for(Restaurant nombre:restaurants) {
            System.out.println(nombre.toString());
        }


    }

}