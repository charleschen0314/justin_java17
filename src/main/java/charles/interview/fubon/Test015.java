package charles.interview.fubon;

class Base{
	static abstract void doIt();
}

abstract class ABs1{
	static void doIt() {};
}

class Base1{
	static abstract class ABs1 extends Base {};
}

abstract class Base3{
	abstract void doIt();
}

public class Test015 {

	public static void main(String[] args) {
		

	}

}
