package singleton;

public class Singleton_lazy {
	private static Singleton_lazy instance = null;

	private Singleton_lazy() {

	}

	public static Singleton_lazy getinstance() {
		if (instance == null) {
			instance = new Singleton_lazy();
		}
		return instance;

	}

}
