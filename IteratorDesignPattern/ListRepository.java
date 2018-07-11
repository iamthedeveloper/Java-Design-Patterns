package IteratorDesignPattern;

public class ListRepository implements IContainer {

	String listProgrmLangs[] = { "Java", "C++", "Python", "Spark" };

	@Override
	public IIterator getIterator() {
		return new ListIterator();
	}

	private class ListIterator implements IIterator {
		int index;

		@Override
		public boolean hasNext() {
			return index < listProgrmLangs.length ? true : false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return listProgrmLangs[index++];
			}
			return null;
		}

	}
}
