package singleton;

class Singleton {
	private Singleton() {

	}

	public static final Singleton INSTANCE = new Singleton();

}
