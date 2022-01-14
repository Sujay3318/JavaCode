package com.test;

import java.util.Comparator;

public class IdComparator implements Comparator<student> {

	public int compare(student o1, student o2) {
		if (o1.getsId() == o2.getsId()) {
			return 0;
		} else if (o1.getsId() > o2.getsId()) {
			return 1;
		} else if (o1.getsId() < o2.getsId()) {
			return -1;
		}
		return 0;
	}

}
