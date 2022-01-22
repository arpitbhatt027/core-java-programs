class Singleton {
	private static Singleton instance = null;
	public String s;

	private Singleton() {
		s = "Assigned value in constructor ";
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
			System.out.println("New instance created");
		} else {
			System.out.println("returning existing instance");
			return instance;
		}
		return instance;
	}
}
class SingletonDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		System.out.println("s1 - " + s1.s);
		System.out.println("s2 - " + s2.s);
		System.out.println("s3 - " + s3.s);
	}
}
