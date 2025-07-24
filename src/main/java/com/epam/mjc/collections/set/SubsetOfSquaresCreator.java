package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set <Integer> set = new HashSet<Integer>();
        for (int x : sourceList) {
            if (x * x >= lowerBound & x * x <= upperBound) {
                set.add(x*x);
            }
        }
    
    return set;
    }
   
}
