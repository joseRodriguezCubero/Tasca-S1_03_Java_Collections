package n1exercici3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        File archive = null;
        FileReader fr = null;
        BufferedReader br = null;
        HashMap<String, String> countries = new HashMap<String, String>();

        try {
            archive = new File(
                    "src/main/java/n1exercici3/countries.txt");
            fr = new FileReader(archive);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String line;

            while ((line = br.readLine()) != null) {

                String[] parts = line.split("\s");
                if (parts.length == 2) {
                    countries.put(parts[1], parts[0]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        Random random = new Random();
        Object[] values = countries.values().toArray();

        String name = Entrada.leerString("Introduzca su nombre");
        byte score = 0;
        String answer;


        for (int i = 0; i < 10; i++) {

            //utilizar Collections.shuffle( values to array y luego imprimir los primeros 10 elementos recorriendolos con un for.
            Object randomValue = values[random.nextInt(values.length)];
            answer = Entrada.leerString("Introduzca la capital de " + randomValue);
            if (countries.getOrDefault(answer,answer).equalsIgnoreCase(randomValue.toString())) {
                System.out.println("Respuesta Correcta!");
                score++;
            }


        }

        try {
            File myObj = new File(
                    "src/main/java/n1exercici3/clasificacio.txt");
            if (myObj.createNewFile()) {
                System.out.println("Archivo clasificaccio.txt creado: " + myObj.getName());
            } else {
                System.out.println("El archivo clasificaccio.txt ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un Error.");
            e.printStackTrace();
        }

        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter(
                    "src/main/java/n1exercici3/clasificacio.txt");
            pw = new PrintWriter(fichero);

            pw.println("nombre: " + name);
            pw.println("Puntuación: " + score);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

}