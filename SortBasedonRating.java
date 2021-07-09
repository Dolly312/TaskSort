package p1;
import java.util.Comparator;


public class SortBasedonRating implements Comparator<ElectronicDevice>{

	@Override
	public int compare(ElectronicDevice a1, ElectronicDevice a2) {
		return a1.getRating()-(a2.getRating());
	}
}