package n1exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        List<Integer> list2 = new ArrayList<Integer>(list1);

        Collections.reverse(list1);
        list2.addAll(list1);

        System.out.println(list1);
        System.out.println(list2);


        for (ListIterator<Integer> it = list1.listIterator(); it.hasNext(); ) {
            int t = it.next();
            list2.add(t);
        }
        System.out.println(list2);
    }

}