package n3exercici1;

import java.util.Objects;

public class Persona {

    private String name;
    private String surname;
    private String dni;

    public Persona(String name, String surname, String dni) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        return Objects.equals(dni, other.dni) && Objects.equals(name, other.name)
                && Objects.equals(surname, other.surname);
    }

    @Override
    public String toString() {
        return "Persona [name=" + name + ", surname=" + surname + ", dni=" + dni + "]";
    }

}