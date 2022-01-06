package tr.com.kafein._01_interfaces.diamond2;

abstract class BaseClass {
	public void foo() {
		System.out.println("BaseClass's foo");
	}
}

interface BaseInterface {
	default void foo() {
		System.out.println("BaseInterface's foo");
	}
}

public class DiamondProblem extends BaseClass implements BaseInterface {

	public static void main(String[] args) {

		DiamondProblem diamond = new DiamondProblem();
		diamond.foo();
	}
}
