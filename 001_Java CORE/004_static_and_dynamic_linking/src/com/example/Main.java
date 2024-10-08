import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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



public class Collection {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Set<String> strings = new HashSet<>();
        arrayList.add("first");
        arrayList.add("second");
        arrayList.add("third");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.add(1, "new second");
        System.out.println(arrayList);
        Map<Integer, String> stringHashTable = new Hashtable<>();
        Map<String, Integer> stringMap = new HashMap<>();
        String string = "BLAKE";
        String string2 = "KING";
        System.out.println(string.hashCode());
        System.out.println(string2.hashCode());
        System.out.println(hash(string));
        System.out.println(hash(string2));
        System.out.println(getIndex(hash(string), 16));
        System.out.println(getIndex(hash(string2), 16));
        stringMap.put("BLAKE", 10);
        stringMap.put("KING", 100);
        System.out.println(stringMap.entrySet());
        System.out.println(stringMap.get("BLAKE"));
        List<String> linkedList = new LinkedList<>();
        linkedList.add("pedik");
        linkedList.add("loh");
        System.out.println(linkedList.get(1));
    }

    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static int getIndex(int hash, int arraySize){
        return  (arraySize - 1) & hash;
    }

}