package n1exercici1;

import java.util.Objects;

public class Month {

    private String name;

    public Month(String monthName) {
        this.name = monthName;
    }

    public String getMonthName() {
        return name;
    }



    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Month other = (Month) obj;
        return Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "[nombre del mes =" + name + "]";
    }



}