package com.epam.mjc.collections.set;


import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet <Integer> set = new HashSet<Integer>();
        for (int c : sourceList) {
            set.add(c);
            if (c % 2 != 0 ) {
                
                set.add(2*c);
            } else {
                while (c % 2 == 0) {
                    c /= 2;
                    set.add(c);
                }
            }
        }
        return set;
    }
    
}
