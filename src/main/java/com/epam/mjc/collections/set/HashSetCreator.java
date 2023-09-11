package com.epam.mjc.collections.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
    	HashSet<Integer> mySet = new HashSet<>();
    	for (Iterator<Integer> iterator = sourceList.iterator(); iterator.hasNext();) {
			int nextInt = (Integer) iterator.next();
			if (nextInt != 0 && nextInt % 2 == 0) {
				while (nextInt >= 1) {
					if (nextInt % 2 == 0) {
						mySet.add(nextInt);
						nextInt /= 2; 
					} else {
						mySet.add(nextInt);
						break;
					}
				} 
			} else if(nextInt != 0) {
				mySet.add(nextInt);
				mySet.add(nextInt * 2);
			}
		}
    	return mySet;
    }
}
