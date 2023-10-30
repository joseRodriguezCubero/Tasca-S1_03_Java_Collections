package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import n2exercici1.Restaurant;

public class Main {

    public static void main(String[] args) {

        ArrayList<Restaurant> restaurants =  new ArrayList<Restaurant>();


        Restaurant Restaurante2 = new Restaurant("manolo", 4);
        Restaurant Restaurante3 = new Restaurant("Celta", 5);
        Restaurant Restaurante4 = new Restaurant("Reinols", 3);
        Restaurant Restaurante5 = new Restaurant("Celta", 6);
        Restaurant Restaurante6 = new Restaurant("Lancaster", 8);
        Restaurant Restaurante1 = new Restaurant("manolo", 5);


        restaurants.add(Restaurante2);
        restaurants.add(Restaurante3);
        restaurants.add(Restaurante4);
        restaurants.add(Restaurante5);
        restaurants.add(Restaurante6);
        restaurants.add(Restaurante1);



        Collections.sort(restaurants, new Comparator<Restaurant>() {	// ordenados por nombre y puntuacion.
            public int compare(Restaurant rest1, Restaurant rest2) {
                int comparison = -1;
                comparison = rest1.getName().compareToIgnoreCase(rest2.getName());

                if(comparison == 0)
                    comparison = rest2.getPuntuacion()-rest1.getPuntuacion();

                return comparison;
            }
        });

        for(Restaurant orden:restaurants) {
            System.out.println(orden.toString());
        }




    }

}