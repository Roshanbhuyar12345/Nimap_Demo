package com.collection.set;

import java.util.Comparator;

public class CompairCricketor implements Comparator<Cricketer>{

	@Override
	public int compare(Cricketer o1, Cricketer o2) {

		if(o1.getRun()>o2.getRun())
			return 1;
		else
			return -1;

	}

}
