package org.aks.mapstruct;

public class CarDto {

	private String make;
	private int seatCount;
	private String type;
	
	public CarDto(String make, int count , String type) {
		this.make = make;
		this.seatCount = count;
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
