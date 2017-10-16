package bloomberg.practice;
class Base{
	public Base() {
        doSomething();
    }

    public void doSomething() {
        System.out.println("do something acceptable");
    }
    public void doSomething1() {
        System.out.println("yolo1-base");
    }
}
	
class Zoom{
	public Zoom(Derived b) {
		b = new Derived();
		b.doSomething1();
	}
}
public class Derived extends Base{
	 public void doSomething() {
	        System.out.println("yolo");
	        Zoom zoom = new Zoom(this);
	    }
	 public void doSomething1() {
	        System.out.println("yolo1");
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Derived();
/*		base.doSomething1();
		Derived derived = new Derived();
		Base b1 = new Base();
		b1.doSomething();
		b1.doSomething1();
		derived.doSomething();
		derived.doSomething1();

*/
	}

}
