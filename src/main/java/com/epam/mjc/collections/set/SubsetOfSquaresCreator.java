package com.epam.mjc.collections.set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
    	TreeSet<Integer> resultTreeSet = new TreeSet<>();
    	for (Iterator<Integer> iterator = sourceList.iterator(); iterator.hasNext();) {
			Integer intFromSourceList = (Integer) iterator.next();
			resultTreeSet.add(intFromSourceList * intFromSourceList);
		}
    	Set<Integer> result = resultTreeSet.subSet(lowerBound, true, upperBound, true);
    	return result;
    }
}
