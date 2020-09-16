package com.xworkz.military.dto;

public class MilitaryDTO {

	String CountryName;
	String MilitaryType;
	String Equipment;
	int Price;
	int Quantity;
	int DeliveryYear;
	
	
	public MilitaryDTO() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public MilitaryDTO(String countryName, String militaryType, String equipment, int price, int quantity,
			int deliveryYear) {
		super();
		CountryName = countryName;
		MilitaryType = militaryType;
		Equipment = equipment;
		Price = price;
		Quantity = quantity;
		DeliveryYear = deliveryYear;
		
	}

	public final String getCountryName() {
		return CountryName;
	}

	public final void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public final String getMilitaryType() {
		return MilitaryType;
	}

	public final void setMilitaryType(String militaryType) {
		MilitaryType = militaryType;
	}

	public final String getEquipment() {
		return Equipment;
	}

	public final void setEquipment(String equipment) {
		Equipment = equipment;
	}

	public final int getPrice() {
		return Price;
	}

	public final void setPrice(int price) {
		Price = price;
	}

	public final int getQuantity() {
		return Quantity;
	}

	public final void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public final int getDeliveryYear() {
		return DeliveryYear;
	}

	public final void setDeliveryYear(int deliveryYear) {
		DeliveryYear = deliveryYear;
	}

	

	@Override
	public String toString() {
		return "MilitaryDTO [CountryName=" + CountryName + ", MilitaryType=" + MilitaryType + ", Equipment=" + Equipment
				+ ", Price=" + Price + ", Quantity=" + Quantity + ", DeliveryYear=" + DeliveryYear+ "]";
	}

	

	
	
	
	
}
