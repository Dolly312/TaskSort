package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class SortClass{

	public static void main(String[] args) {
		
		
		List<ElectronicDevice> dlist = new ArrayList<>();
		dlist.add(new Moble(10,112,1234, 14200,3,"Vivo" ));
		dlist.add(new Moble(20,1132,1234, 148900,4 ,"Vivo6"));
		dlist.add(new Moble(30,182,1234, 156200,2,"Oppo" ));
		dlist.add(new Moble(40,172,1234, 19200,5,"Apple"));
		
		List<ElectronicDevice> priceBasedList = new ArrayList<>();
		priceBasedList.addAll(dlist);
		
		Collections.sort(priceBasedList, new SortBasedOnPrice());
		
		doPrint(priceBasedList," Sort Data Based on Price ");
		
		
		List<ElectronicDevice> ratingBasedList = new ArrayList<>();
		ratingBasedList.addAll(dlist);
		
		Collections.sort(ratingBasedList, new SortBasedonRating());
		
		doPrint(ratingBasedList," Sort Data Based on Rating ");
		
		
	}
	
	public static void doPrint(Collection<ElectronicDevice> collection,String tagLine)
	{
		System.out.println("\n\n ============"+tagLine+"=========================\n");
		for (ElectronicDevice device : collection) {
			System.out.println(device);
		}
	}
}
