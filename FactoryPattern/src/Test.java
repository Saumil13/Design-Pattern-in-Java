public class Test {
	public static void main(String[] args) {

		// Get the instance of the luxury car
		ICar car = null;
		car = CarFactory.GetInstance(CarType.LuxuryCar);
		car.CarDescription();

		// Get the instance of the small car
		car = CarFactory.GetInstance(CarType.SmallCar);
		car.CarDescription();

	}
}
