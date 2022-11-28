package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            Integer keyLength = entry.getKey().length();
            map.putIfAbsent(keyLength, new HashSet<>());
            Set<String> set = new HashSet<>(map.get(keyLength));
            set.add(entry.getKey());
            map.put(keyLength, set);
        }

        return map;
    }
}
