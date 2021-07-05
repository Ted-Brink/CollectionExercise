package se.lexicon.tedBrink;

import java.util.*;

public class List {

    public static void main(String[] args) {        //Ex.1
        ArrayList<String> days = new ArrayList<String>();
        days.addAll(Arrays.asList("måndag", "tisdag", "onsdag", "torsdag", "fredag", "lördag", "söndag"));
        System.out.println("days = " + days);

        Iterator<String> iterator = days.iterator();    //Ex.2
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println(days);

        ArrayList<String> nyDays = new ArrayList<String>();     //Ex.3
        nyDays.addAll(Arrays.asList("måndag", "tisdag", "onsdag", "fredag", "lördag", "söndag"));
        nyDays.add(4,"TORSDAG");
        System.out.println("nyDays = " + nyDays);

        ArrayList<String> delList = new ArrayList<String>();    //Ex.4
        delList.addAll(nyDays.subList(0,3));
        System.out.println("delList = " + delList);

        HashSet<String> daySet = new HashSet<String>();         //Ex.5
        daySet.addAll(Arrays.asList("måndag", "tisdag", "onsdag", "torsdag", "fredag", "lördag", "söndag"));
        System.out.println("daySet = " + daySet);

        ArrayList<String> nyDagar = new ArrayList<String>(daySet);  //Ex.6
        System.out.println("Converted hashset = " + nyDagar);

              



        HashSet<String> names = new HashSet<String>();              //Ex.8
        names.addAll(Arrays.asList("Olle", "Adam", "Sixten","Xerekes", "Östen", "Andreas","Britta"));
        ArrayList<String> arrName = new ArrayList<String>(names);
        Collections.sort(arrName);
        System.out.println("arrName = " + arrName);














    }}