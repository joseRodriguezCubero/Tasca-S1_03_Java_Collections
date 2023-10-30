package n2exercici1;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>, Comparator<Restaurant>{

    private String name;

    private int puntuacion;

    public Restaurant(String name, int puntuacion) {
        this.name = name;
        this.puntuacion = puntuacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, puntuacion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Restaurant other = (Restaurant) obj;
        return Objects.equals(name, other.name) && puntuacion == other.puntuacion;
    }

    @Override
    public String toString() {
        return "Restaurant [name=" + name + ", puntuacion=" + puntuacion + "]";
    }
    @Override
    public int compareTo(Restaurant o) {
        return o.puntuacion - puntuacion;
    }
    @Override
    public int compare(Restaurant o1, Restaurant o2) {

        String name1= o1.getName();
        String name2= o2.getName();

        return name1.compareToIgnoreCase(name2);
    }









}