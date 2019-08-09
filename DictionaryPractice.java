package Hackerrank.ThirtyDaysofCode;

import java.util.HashMap;
import java.util.Map;
public class DictionaryPractice {
    public static void main(String[] args) {
        Map<String,String> englSpanDictionary = new HashMap<String, String>();
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        shoppingList.put("Ham",true);
        shoppingList.put("Bread",Boolean.TRUE);
        shoppingList.put("Oreos",Boolean.TRUE);
        shoppingList.put("Eggs",Boolean.FALSE);
        shoppingList.put("Sugar",false);
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));
        System.out.println(shoppingList.toString());
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());
        shoppingList.remove("Eggs");
    }
}
