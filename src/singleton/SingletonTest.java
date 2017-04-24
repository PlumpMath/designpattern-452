package singleton;

import org.junit.Test;

public class SingletonTest {
	@Test
	public void testSingle() {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

	@Test
	public void testSingleton() {
		Singleton singleton1 = Singleton.INSTANCE;
		Singleton singleton2 = Singleton.INSTANCE;
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());

	}

}
