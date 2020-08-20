package com.xworkz.military.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="military_info")
public class MilitaryEntity implements Serializable{

		@javax.persistence.Id
		@GenericGenerator(name="xworkz", strategy="increment")
		@GeneratedValue(generator = "xworkz")
		@Column(name="M_Id")
		int Id;
		@Column(name="Country_Name")
		String CountryName;
		@Column(name="Military_Type")
		String MilitaryType;
		@Column(name="Euqipment")
		String Equipment;
		@Column(name="Price")
		int Price;
		@Column(name="Quantity")
		int Quantity;
		@Column(name="Delivery_Year")
		int DeliveryYear;

		public final int getId() {
			return Id;
		}

		public final void setId(int id) {
			Id = id;
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
			return "MilitaryEntity [Id=" + Id + ", CountryName=" + CountryName + ", MilitaryType=" + MilitaryType
					+ ", Equipment=" + Equipment + ", Price=" + Price + ", Quantity=" + Quantity + ", DeliveryYear="
					+ DeliveryYear + "]";
		}
		
		
	
	
}
