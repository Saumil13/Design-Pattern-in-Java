public class CarFactory {

	public static ICar GetInstance(CarType carType) {
		ICar car = null;
		switch (carType) {
		case SmallCar:
			car = new SmallCar();
			break;

		case LuxuryCar:
			car = new LuxuryCar();
			break;

		default:
			// throw some exception
			break;
		}
		return car;
	}
}
