package com.example;

import com.example.arraylist.ArrayListService;
import com.example.hashmap.HashMapService;
import com.example.hashmap.LinkedHashMapService;
import com.example.linkedlist.LinkedListService;
import com.example.vector.VectorService;

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

        LinkedListService linkedListService = new LinkedListService();
        linkedListService.workWithLinkedList();

        VectorService vectorService = new VectorService();
        vectorService.workWithVector();

        LinkedHashMapService linkedHashMapService = new LinkedHashMapService();
        linkedHashMapService.workWithLinkedHashMap();
    }
}