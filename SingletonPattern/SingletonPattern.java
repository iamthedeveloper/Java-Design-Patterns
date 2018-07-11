package SingletonPattern;

import java.io.Serializable;

public class SingletonPattern implements Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1577114125552822108L;
	private static volatile SingletonPattern singletonPattern = null;

	private SingletonPattern() {

	}

	public static SingletonPattern getSingletonInstance() {
		if (null == singletonPattern)
			synchronized (SingletonPattern.class) {
				if (null == singletonPattern)
					singletonPattern = new SingletonPattern();
			}
		return singletonPattern;
	}

	public Object readResolve() {
		return singletonPattern;
	}

	public Object Clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
