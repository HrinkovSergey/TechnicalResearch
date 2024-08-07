package com.example;

import com.example.arraylist.ArrayListService;
import com.example.hashmap.HashMapService;

import java.util.*;

/*
                                      Iterable - have -> Iterator                             Map<----------
                                         ۸                                                     ۸            :
                                         |                                                     |            :
                                     Collection                                             SortedMap    HashMap
                                         ۸                                                     ۸            ۸
                      -------------------|-------------------------                            :            :
                     |                 Queue                       |                        TreeMap    LinkedHashMap
                     |                  ۸  ۸                       |
                     |                  |  :                       |
                    List            Deque  PriorityQueue          Set
                     ۸                ۸                           ۸ ۸
                     :-ArrayList      :                           | :---HashSet
                     :-LinkedList-----:-ArrayDeque                | :---LinkedHashSet
                     :-Vector                                     |
                                                                SortedSet
                                                                  ۸
                                                                  :
                                                                TreeSet
 */

/*
        Хеш-табли́ца — это структура данных, реализующая интерфейс ассоциативного массива, а именно, она позволяет
хранить пары (ключ, значение) и выполнять три операции: операцию добавления новой пары, операцию поиска и операцию
удаления пары по ключу.
*/


public class Main {
    public static void main(String[] args) {
        ArrayListService arrayListService = new ArrayListService();
        arrayListService.workWithArrayList();
        HashMapService hashMapService = new HashMapService();
        hashMapService.workWithHashMap();

//        System.out.println("-----------------------\n    ArrayList:    \n-----------------------");
//        workWithArrayList();
//        System.out.println("-----------------------\n    HashMap:    \n-----------------------");
//        workWithHashMap();




//        Map<Integer, String> stringHashTable = new Hashtable<>();
//        Map<String, Integer> stringMap = new HashMap<>();
//        String string = "BLAKE";
//        String string2 = "KING";
//        System.out.println(string.hashCode());
//        System.out.println(string2.hashCode());
//        System.out.println(hash(string));
//        System.out.println(hash(string2));
//        System.out.println(getIndex(hash(string), 16));
//        System.out.println(getIndex(hash(string2), 16));
//        stringMap.put("BLAKE", 10);
//        stringMap.put("KING", 100);
//        System.out.println(stringMap.entrySet());
//        System.out.println(stringMap.get("BLAKE"));
//        List<String> linkedList = new LinkedList<>();
//        linkedList.add("pedik");
//        linkedList.add("loh");
//        System.out.println(linkedList.get(1));
    }


    private static void log(List<String> arrayList) {
        System.out.println("arrayList: " + arrayList);
        System.out.println("size: " + arrayList.size());
    }


}