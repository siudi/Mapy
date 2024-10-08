package pl.gornik.map2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Integer>> subjects = new HashMap<>();
        addGrades(subjects,"matematyka",5);
        addGrades(subjects,"polski",3);
        addGrades(subjects,"fizyka",2);
        addGrades(subjects,"matematyka",1);
        addGrades(subjects,"fizyka",3);
        addGrades(subjects,"matematyka",2);

        for(Map.Entry<String,List<Integer>> sub : subjects.entrySet()){
            System.out.println(sub.getKey() + " - " + sub.getValue());
        }

        int srednia = 0;
        int iloscOcen = 0;
        for(Map.Entry<String, List<Integer>> abc : subjects.entrySet()){
            for(int grade : abc.getValue()){
                srednia += grade;
                iloscOcen++;
            }
        }
        System.out.println("Średnia " + srednia/iloscOcen);

    }



    public static void addGrades(Map<String, List<Integer>> subjects,String subject, int grade){
        if(subjects.containsKey(subject)){
            subjects.get(subject).add(grade);
        }
        else {
            subjects.put(subject,new ArrayList<>(Arrays.asList(grade)));
        }
    }
}
