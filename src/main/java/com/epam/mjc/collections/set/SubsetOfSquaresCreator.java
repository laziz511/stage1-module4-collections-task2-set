package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();

        for (Integer number : sourceList) {
            int square = number * number;
            if (square >= lowerBound && square <= upperBound) {
                set.add(square);
            }
        }

        return set;
    }
}
