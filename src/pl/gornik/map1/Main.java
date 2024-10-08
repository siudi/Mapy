package pl.gornik.map1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> shoppingList = new HashMap<>();
        shoppingList.put("mleko",5);
        shoppingList.put("cukier",1);
        shoppingList.put("bułki",6);
        shoppingList.put("makaron",3);
        shoppingList.put("woda",12);
        shoppingList.put("olej",2);

        Set<String> keys = shoppingList.keySet();
        System.out.println("Zestaw kluczy " + keys);

        Collection<Integer> values = shoppingList.values();
        System.out.println("Zestaw wartości mapy " + values);

        List<Integer> list = new ArrayList<>();
        for(String key : keys ) {
            list.add(shoppingList.get(key));
        }
        System.out.println("Lista wartości " + list);

        for(Map.Entry<String, Integer> entry : shoppingList.entrySet()){
            System.out.println("Klucz: "+ entry.getKey() + " |||  Wartość: " + entry.getValue());
        }

    }
}