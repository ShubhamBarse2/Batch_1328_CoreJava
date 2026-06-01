package Classes_ObjectRefCode;

public class MainClass {

	public static void main(String[] args) {

		Car bmw = new Car();
		System.out.println("------------------------------");
		System.out.println("Car Informations ... !");

		System.out.println("Car Name -> " + (bmw.carName = "BMW A3"));
		System.out.println("Car Model Year -> " + (bmw.carModelYr = 2023));
		System.out.println("Car Number -> " + (bmw.carNo = "MH1456DF54"));
		System.out.println("Car Engine Number " + (bmw.engineNo = 2345679876543L));

		System.out.println("------------------------------");
		Car alto = new Car();
		System.out.println("Car Informations ... !");
		System.out.println("Car Name -> " + (alto.carName = "Alto 800"));
		System.out.println("Car Model Year -> " + (alto.carModelYr = 2013));
		System.out.println("Car Number -> " + (alto.carNo = "MH12DF2354"));
		System.out.println("Car Engine Number " + (alto.engineNo = 9876543234343L));
		System.out.println("------------------------------");
		Car audi = new Car();
		System.out.println("Car Informations ... !");
		System.out.println("Car Name -> " + (audi.carName = "Audi Q3"));
		System.out.println("Car Model Year -> " + (audi.carModelYr = 2025));
		System.out.println("Car Number -> " + (audi.carNo = "MH01AS5445"));
		System.out.println("Car Engine Number " + (audi.engineNo = 34567898765l));
		System.out.println("------------------------------");
		Car s_Square = new Car();
		System.out.println("Car Informations ... !");
		System.out.println("Car Name -> " + (s_Square.carName = "WWW"));
		System.out.println("Car Model Year -> " + (s_Square.carModelYr = 2026));
		System.out.println("Car Number -> " + (s_Square.carNo = "MH24RT4567"));
		System.out.println("Car Engine Number " + (s_Square.engineNo = 9876679876543L));

	}

}
