class TwoWheeler extends Vehicle
{
	private boolean kickStartAvailable;
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}



	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}



	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		//TwoWheeler Constructor 
		this.kickStartAvailable=kickStartAvailable;
	}

