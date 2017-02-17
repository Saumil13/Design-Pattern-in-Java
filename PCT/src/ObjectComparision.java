
public class ObjectComparision {

	public static void main(String[] args){
		
		// Create three objects from the Vehicle class
				Vehicle v1 = new Vehicle(), v2 = new Vehicle(), v3 = new Vehicle();
				String vecStr1, vecStr2, vecStr3;
				
			    System.out.println("Initial information of v1 is as follows:\n========================================");
				v1.showInfo();
					
			    System.out.println("Initial information of v2 is as follows:\n========================================");
				v2.showInfo();

			    System.out.println("Initial information of v3 is as follows:\n========================================");
				v3.showInfo();

				// Modify the vehicles information
				v1.setNumOfDoors(3);
				v1.setPrice(18000);
				v1.setMaxSpeed(260);

				v2.setNumOfDoors(3);
				v2.setPrice(18000);
				v2.setMaxSpeed(260);

				
				v3.setNumOfDoors(4);
				v3.setPrice(20000);
				v3.setMaxSpeed(300);

			    System.out.println("Information of v1 after modifications is as follows:\n====================================================");
				v1.showInfo();
					
			    System.out.println("Information of v2 after modifications is as follows:\n====================================================");
				v2.showInfo();

			    System.out.println("Information of v3 after modifications is as follows:\n====================================================");
				v3.showInfo();
			    
				
				vecStr1 = v1.toString();
				vecStr2 = v2.toString();
				vecStr3 = v3.toString();
				
				// Show the content of these strings
				System.out.println("vecStr1 is: " + vecStr1);
				System.out.println("vecStr2 is: " + vecStr2);
				System.out.println("vecStr3 is: " + vecStr3);
				System.out.println();
				// Now, compare these objects 
				
				if (vecStr1.contentEquals(vecStr2)) 		
				{
					System.out.println("v1 and v2 are identical vehicles");
				}
				else
				{
					System.out.println("v1 and v2 are NOT identical vehicles");
				}
				
				if (vecStr1.contentEquals(vecStr3)) {
					System.out.println("v1 and v3 are identical vehicles");
				}
				else
				{
					System.out.println("v1 and v3 are NOT identical vehicles");
				}

	}
}

class Vehicle
{
	// _________________________________
	// Attributes of Vehicle
	// _________________________________

	private int numOfDoors;
	private double price;
	private int maxSpeed;


	// _________________________________
	// Constructor of Vehicle
	// _________________________________


	public Vehicle()
	{
	     // Initialize the attributes of vehicle when it is created.
	    System.out.println("Creating Object ......"); 
		numOfDoors = 4;
		price = 10000;
		maxSpeed = 280;
	}
	
	
	// _________________________________
	// Other Methods of Vehicle
	// _________________________________

	public int getNumOfDoors()
	{
	     // Returns the number of doors of the vehicle
	     
		return numOfDoors;
	}

	public void setNumOfDoors(int nd)
	{
	     // Sets the number of doors of the vehicle
	     
		if(nd > 2 && nd < 6)	// protect against any unreasonable changes 
			numOfDoors = nd;
	    else 
	    	System.out.println("Strange number of doors! No change will be performed.");
	}

	
	public double getPrice()
	{
	     // Returns the price of the vehicle
	     
		return price;
	}

	
	public void setPrice(double pr)
	{
	     // Sets the price of the vehicle if it is within the expected range
	    if (pr > 800 && pr < 600000) 
	    	price = pr;
	    else 
	    	System.out.println("Unreasonable price; no change will be performed.");
	}

	
	public int getMaxSpeed()
	{
	     // Returns the maximum speed of the vehicle
	     
		return maxSpeed;
	}

	public void setMaxSpeed(int mx)
	{
	     // Sets the maximum speed of the vehicle if within an expected range
	    if (mx > 80 && mx < 400) 
	    	maxSpeed = mx;
	    else 
	    	System.out.println("Unexpected maximum speed; no change will be performed.");
	}


	public void showInfo()
	{
	    // Displays vehicle information
	    System.out.println("The vehicle has " + numOfDoors + " doors, " + 
			       "maximum speed of " + maxSpeed + " KM/hr and its price is " + price + "$.\n\n");

	}

	//public String toString()
	//{
	//	return (numOfDoors + " " + maxSpeed + " " + price);
	//}
	
}	// end of Vehicle class
