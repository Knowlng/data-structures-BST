
import java.util.Comparator;


public class CmpBook implements Comparator {

    @Override
	public int compare(Object x, Object y) {
	Book o1 = (Book) x;
	Book o2 = (Book) y;
	return ((Comparable)o1).compareTo(o2);
//		return o1.getId() - o2.getId();
	}
}
