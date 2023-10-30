package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {


        ArrayList<Month> months = new ArrayList<Month>();

        Month enero = new Month("Enero");
        months.add(enero);

        Month febrero = new Month("Febrero");
        months.add(febrero);

        Month marzo = new Month("Marzo");
        months.add(marzo);

        Month abril = new Month("Abril");
        months.add(abril);

        Month mayo = new Month("Mayo");
        months.add(mayo);

        Month junio = new Month("Junio");
        months.add(junio);

        Month julio = new Month("Julio");
        months.add(julio);

        Month septiembre = new Month("Septiembre");
        months.add(septiembre);

        Month octubre = new Month("Octubre");
        months.add(octubre);

        Month noviembre = new Month("Noviembre");
        months.add(noviembre);

        Month diciembre = new Month("Diciembre");
        months.add(diciembre);

        System.out.println(months);

        Month agosto = new Month("Agosto");
        months.add(7, agosto);

        System.out.println(months);

        HashSet <Month> months2 = new HashSet<Month>(months);

        Month agosto2 = new Month("Agosto");

        months2.add(agosto2);



        for (Month i : months2) {
            System.out.print(i.getMonthName()+ ", ");
        }

        System.out.println();

        Iterator<Month> it = months2.iterator();

        while (it.hasNext()) {
            String name = it.next().getMonthName();
            System.out.print(name + ", ");
        }


    }


}