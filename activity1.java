package activity;

public class activity1 {

	public static void main(String[] args) {
		Car carobj=new Car("Red","Manual",2020, 0);
		System.out.println();
		carobj.displaycharecteristics();
		carobj.accelerate();
		carobj.breake();

	}

}
