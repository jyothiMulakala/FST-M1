package activity;

public class Car {

String color ;
String transmission ;
int make ;
int tyres ;
int doors;
 Car(String color, String transmission ,int tyres, int doors ){
	
	this.color=color ;
	this.transmission=transmission;
	this.make=make;
	this.tyres=4 ;
	this.doors=4;


	}

   public void displaycharecteristics () {
	System.out.println("colour:"+ color);
	System.out.println("Transmission:"+transmission);
	System.out.println("year of making:" + make);

	System.out.println("no of tyres"+tyres );

	System.out.println("no of doors"+doors );
}

public void accelerate () {
	System.out.println("car is moving forward ");
	
}
 public void breake() {
	System.out.println("Car is stopped");
	
}
}

