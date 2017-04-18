import java.util.ArrayList;

/**
 * Created by sodobescu on 4/10/2017.
 */
public class ArrayProcesser
{
	public ArrayProcesser() {
	}
	public boolean contains1or4(ArrayList<Integer> array) {
		return array.contains(1 | 4);
	}
	public boolean contains1or2After1(ArrayList<Integer> array) {
		boolean flag = false;
		for (int i = 0; i < array.size(); i++) {
			if (i == 1) {
				flag=array.subList(i+1, array.size()).contains(1 | 2);
			}
		}
		return flag;
	}
	public int countEvenNumbers(ArrayList<Integer> array) {
		int count = 0;
		for (Integer i : array) {
			if (i % 2 == 0) count++;
		}
		return count;
	}
}
