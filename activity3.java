package activity;

public class activity3 {

	public static void main(String[] args) {

		double seconds = 1000000000;
		double Earthseconds = 43562625;
        double mercuryseconds = 0.312457676;
		double venusseconds = 1.523525;
		double marsseconds = 12.6525256;
		double jupiterseconds = 1324.653;
		double saturnseconds = 2345.5233;
        double urenusseconds = 3241.42345;
		double neptuneseconds = 43.323323;
		
		System.out.println("Age on mercury:" + seconds/Earthseconds/mercuryseconds);
		System.out.println("Age on venus:" + seconds/Earthseconds/venusseconds);

		System.out.println("Age on mars:" + seconds/Earthseconds/marsseconds);

		System.out.println("Age on jupiter:" + seconds/Earthseconds/jupiterseconds);

		System.out.println("Age on saturn:" + seconds/Earthseconds/saturnseconds);

		System.out.println("Age on urenus:" + seconds/Earthseconds/urenusseconds);

		System.out.println("Age on neptune:" + seconds/Earthseconds/neptuneseconds);

		

	}

}
