package n3exercici1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import n1exercici3.Entrada;

public class Main {

    public static void main(String[] args) {

        TreeSet<Persona> entryAlfOrd = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getName();
                String name2 = p2.getName();
                return name1.compareToIgnoreCase(name2);
            }

        });

        try {
            String archCSV = "src/main/java/n3exercici1/students.csv";
            CSVReader csvReader = new CSVReader(new FileReader(archCSV));
            String[] fila = null;
            while((fila = csvReader.readNext()) != null) {
                String name = fila[0];
                String surname = fila[1];
                String dni = fila[2];

                entryAlfOrd.add(new Persona(name, surname, dni));
            }

            csvReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

        boolean exit = false;

        do {
            switch (menu()) {
                case 1:
                    insertPerson(entryAlfOrd);
                    break;
                case 2:
                    shortByName(entryAlfOrd);
                    break;
                case 3:
                    shortReverseByName(entryAlfOrd);
                    break;
                case 4:
                    shortBySurname(entryAlfOrd);
                    break;
                case 5:
                    shortReverseBySurname(entryAlfOrd);
                    break;
                case 6:
                    shortByDni(entryAlfOrd);
                    break;
                case 7:
                    ShortReverseByDni(entryAlfOrd);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación");
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    public static byte menu() {

        byte option;
        final byte MIN = 0;
        final byte MAX = 7;

        do {
            option = Entrada.leerByte("\nMENú PRINCIPAL" + "\n1. Introducir Persona"
                    + "\n2. Mostrar las personas ordenadas por nombre (A-Z)."
                    + "\n3. Mostrar las personas ordenadas por nombre (Z-A)."
                    + "\n4. Mostrar las personas ordenadas por apellido (A-Z)."
                    + "\n5. Mostrar las personas ordenadas por apellido (Z-A)."
                    + "\n6. Mostrar las personas ordenadas por dni (1-9)."
                    + "\n7. Mostrar las personas ordenadas por dni (9-1)." + "\n0. Salir de la apliación.\n");

            if (option < MIN || option > MAX) {
                System.out.println("Escoge una opcion válida.");
            }
        } while (option < MIN || option > MAX);
        return option;
    }

    public static void insertPerson(TreeSet<Persona> entryAlfOrd) {
        String name = Entrada.leerString("Introduzca el nombre de la persona");
        String surname = Entrada.leerString("Introduzca los apellidos de la persona");
        String dni = Entrada.leerString("Introduzca el dni de la persona");

        Persona addedPerson = new Persona(name, surname, dni);
        if (entryAlfOrd.contains(addedPerson)) {
            System.out.println("La persona introducida ya se encuentra en la aplicación");
        } else {
            entryAlfOrd.add(addedPerson);
            System.out.println("Persona introducida correctamente");
        }
    }

    public static void shortByName(TreeSet<Persona> enrtyAlfOrd) {
        for (Persona p : enrtyAlfOrd) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }
    }

    public static void shortReverseByName(TreeSet<Persona> entryAffOrd) {
        TreeSet<Persona> shortByReverseName = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getName();
                String name2 = p2.getName();
                return name2.compareToIgnoreCase(name1);
            }
        });

        shortByReverseName.addAll(entryAffOrd);

        System.out.println("_Nombre_ ____Apellidos_____ ___DNI___");

        for (Persona p : shortByReverseName) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }

    }

    public static void shortBySurname(TreeSet<Persona> entryAlfOrd) {

        TreeSet<Persona> shortBySurname = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getSurname();
                String name2 = p2.getSurname();
                return name1.compareToIgnoreCase(name2);
            }
        });

        shortBySurname.addAll(entryAlfOrd);

        System.out.println("_Nombre_ ____Apellidos_____ ___DNI___");

        for (Persona p : shortBySurname) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }

    }

    public static void shortReverseBySurname(TreeSet<Persona> entryAlfOrd) {
        TreeSet<Persona> shortReverseBySurname = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getSurname();
                String name2 = p2.getSurname();
                return name2.compareToIgnoreCase(name1);
            }
        });

        shortReverseBySurname.addAll(entryAlfOrd);

        System.out.println("_Nombre_ ____Apellidos_____ ___DNI___");

        for (Persona p : shortReverseBySurname) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }

    }

    public static void shortByDni(TreeSet<Persona> entryAlfOrd) {
        TreeSet<Persona> shortByDni = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getDni();
                String name2 = p2.getDni();
                return name1.compareToIgnoreCase(name2);
            }
        });

        shortByDni.addAll(entryAlfOrd);

        System.out.println("_Nombre_ ____Apellidos_____ ___DNI___");

        for (Persona p : shortByDni) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }
    }

    public static void ShortReverseByDni(TreeSet<Persona> entryAlfOrd) {
        TreeSet<Persona> shortReverseByDni = new TreeSet<Persona>(new Comparator<Persona>() {

            public int compare(Persona p1, Persona p2) {
                String name1 = p1.getDni();
                String name2 = p2.getDni();
                return name2.compareToIgnoreCase(name1);
            }
        });

        shortReverseByDni.addAll(entryAlfOrd);

        System.out.println("_Nombre_ ____Apellidos_____ ___DNI___");

        for (Persona p : shortReverseByDni) {
            System.out.println(p.getName() + " - " + p.getSurname() + " - " + p.getDni());
        }

    }

}