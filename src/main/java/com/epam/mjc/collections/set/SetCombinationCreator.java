package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
    	Set<String> mySet = new HashSet<>();
    	for (Iterator<String> iterator = firstSet.iterator(); iterator.hasNext();) {
			String stringFromFirst = iterator.next();
			if (secondSet.contains(stringFromFirst) & !thirdSet.contains(stringFromFirst)) {
				mySet.add(stringFromFirst);
			}
		}
    	for (Iterator<String> iterator = thirdSet.iterator(); iterator.hasNext();) {
			String stringFromThird = iterator.next();
			if (!firstSet.contains(stringFromThird) && !secondSet.contains(stringFromThird)) {
				mySet.add(stringFromThird);
			}
		}
    	return mySet;
    }
}
