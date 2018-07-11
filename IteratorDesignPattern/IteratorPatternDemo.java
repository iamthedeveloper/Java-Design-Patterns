package IteratorDesignPattern;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		ListRepository listRepository = new ListRepository();
		for (IIterator itr = listRepository.getIterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
