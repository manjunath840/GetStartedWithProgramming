package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OnlyEvenNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(22);
        list.add(66);
        list.add(99);
        list.add(11);

        for (Integer i : list) {

            if ((i % 2) == 0) {
                System.out.println("Number is even number");
            } else {
                System.out.println("number is Odd Number");
            }


        }


    }

}

