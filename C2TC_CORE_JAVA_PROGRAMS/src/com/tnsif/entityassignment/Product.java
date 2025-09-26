package com.tnsif.entityassignment;

public class Product {
	
	private int PId;
	private String PName;
	private String PPrice;
	
	public int getPId() {
		return PId;
	}
	public void setPId(int PId) {
		this.PId = PId;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String PName) {
		this.PName = PName;
	}
	public String getPPrice() {
		return PPrice;
	}
	public void setPPrice(String PPrice) {
		this.PPrice = PPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + PId + ", cname=" + PName + ", city=" + PPrice + "]";
	}
	


}
