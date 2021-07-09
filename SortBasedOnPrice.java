package p1;

import java.util.Comparator;


public class SortBasedOnPrice implements Comparator<ElectronicDevice>{

	@Override
	public int compare(ElectronicDevice a1, ElectronicDevice a2) {
		return a1.getPrice()-(a2.getPrice());
	}

	
	
}