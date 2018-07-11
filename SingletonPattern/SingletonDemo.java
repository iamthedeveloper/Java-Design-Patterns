package SingletonPattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonDemo {

	public static void CreateInstance() {
		SingletonPattern instanceOne = SingletonPattern.getSingletonInstance();
		SingletonPattern instanceTwo = SingletonPattern.getSingletonInstance();
		System.out.println("instanceOne " + instanceOne.hashCode());
		System.out.println("instanceTwo " + instanceTwo.hashCode());
	}

	public static void main(String[] args) {
		SingletonPattern patternDemoOne = SingletonPattern.getSingletonInstance();
		SingletonPattern patternDemoTwo = SingletonPattern.getSingletonInstance();
		System.out.println(String.format("patternDemoOne --> hashcode : %d", patternDemoOne.hashCode()));
		System.out.println(String.format("patternDemoTwo --> hashcode : %d", patternDemoTwo.hashCode()));

		try {
			Class clazz = Class.forName("SingletonPattern.SingletonPattern");
			Constructor construcotr = clazz.getDeclaredConstructor();
			construcotr.setAccessible(true);
			SingletonPattern singlepattern = (SingletonPattern) construcotr.newInstance();
			System.out.println(String.format("singlepattern --> hashcode : %d", patternDemoTwo.hashCode()));
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			System.err.println(e.getMessage());
		}

		// Serialization
		SingletonPattern singletonSer = null;
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/singleton.ser"));
			oos.writeObject(patternDemoOne);

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/singleton.ser"));
			singletonSer = (SingletonPattern) ois.readObject();

			System.out.println(String.format("Singleton Serilized %d", singletonSer.hashCode()));
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(String.format("%s", e.getMessage()));
		}

		// Clone
		SingletonPattern singletonClone;
		try {
			singletonClone = (SingletonPattern) patternDemoOne.Clone();
			System.out.println("singletonClone Clone : " + singletonClone.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Executors service Test for MultiThreaded ENV
		ExecutorService executors = Executors.newFixedThreadPool(3);
		executors.submit(SingletonDemo::CreateInstance);
		executors.submit(SingletonDemo::CreateInstance);
		executors.submit(SingletonDemo::CreateInstance);

		executors.shutdown();

	}
}
