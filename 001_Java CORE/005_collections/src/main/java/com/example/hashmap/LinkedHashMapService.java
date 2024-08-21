package com.example.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapService {
    private static final String SEPARATOR = "------------------";

    public void workWithLinkedHashMap() {
        System.out.println("-----------------------\n    LinkedHashMap:    \n-----------------------");
        showMru();
        showLru();

    }

    //"Most Recently Used" (MRU) or "First-In-First-Out" (FIFO) cache
    private void showMru() {
        System.out.println("MRU:");
        Map<String, String> cache = new LinkedHashMap<>(3, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                // Only remove if the cache exceeds the capacity
                return size() > 3;
            }
        };
        // Adding elements
        cache.put("k1", "V1");
        cache.put("k2", "V2");
        cache.put("k3", "V3");
        System.out.println("Cache after initial puts: \n" + cache);

        // Access the elements to change the order based on access
        cache.get("k1");  // Access k2 to make it MRU
        System.out.println("Cache after accessing keys 1: \n" + cache);

        // Adding a new element to cause eviction
        cache.put("k4", "V4");
        System.out.println("Cache after adding key 4: \n" + cache);
        System.out.println(SEPARATOR);
    }

    // Least Recently Used (LRU)
    private void showLru() {
        System.out.println("LRU:");
        Map<String, String> lruCache = new LinkedHashMap<>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                return size() > 3; // Set capacity to 3 to observe eviction clearly
            }
        };

        // Adding elements
        lruCache.put("a", "A");
        lruCache.put("b", "B");
        lruCache.put("c", "C");
        System.out.println("Cache after initial puts: \n" + lruCache);

        // Accessing element 'a' makes it the most recently used
        lruCache.get("a");
        System.out.println("Cache after accessing key 'a': \n" + lruCache);

        // Adding new elements to cause eviction of the least recently used element
        lruCache.put("d", "D");
        lruCache.put("e", "E");

        System.out.println("Cache after adding keys 'd' and 'e': \n" + lruCache);

        // Adding one more element to force another eviction
        lruCache.put("f", "F");
        System.out.println("Cache after adding key 'f': \n" + lruCache);
        System.out.println(SEPARATOR);
    }
}
