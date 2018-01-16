
public interface InterPrueba {
	void print();
	default void print2() {
		System.out.println("Default");
	}
}
