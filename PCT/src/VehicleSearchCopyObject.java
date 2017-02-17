
public class VehicleSearchCopyObject {

	public static void main(String[] args){
	System.out.println("Copy constructor");
	
	VehicleClass vehicle1 =new VehicleClass();
	vehicle1.setDoors(4);
	
	System.out.println("Vehicle 1 information on Door: " + vehicle1.getDoors());
	
	VehicleClass vehicle2 = new VehicleClass(vehicle1);
	vehicle2.setDoors(5);
	
	System.out.println("Vehicle 1 information on Door: " + vehicle1.getDoors());
	System.out.println("Vehicle 2 information on Door: " + vehicle2.getDoors());
	
	//Object is copied and created new object
	VehicleClass vehicle3 = new VehicleClass(vehicle1);
	vehicle3.setDoors(6);
	System.out.println("Vehicle 3 information on Door: " + vehicle3.getDoors());
	
	
	VehicleClass vehicle4 =new VehicleClass();
	//Object must be shared
	vehicle4 = vehicle3;
		
	vehicle4.setDoors(3);
	System.out.println("Vehicle 3 information on Door: " + vehicle3.getDoors());
	
	System.out.println("Vehicle 4 information on Door: " + vehicle4.getDoors());
	
	
	}
}

class VehicleClass {

	private int doors;
	
	public VehicleClass()
	{
		
	}

	public VehicleClass(VehicleClass vehicle) {

		this.doors = vehicle.doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getDoors() {
		return this.doors;
	}

}