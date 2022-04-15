
	package com.mphasis.erp.controller;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name ="Admin")
	public class Admin {

		@Id
		@GeneratedValue
		@Column(name ="aname")
		private String AdminName;
		@Column(name ="pin")
		private int pin;
		public String getAdminName() {
			return AdminName;
		}
		public void setAdminName(String adminName) {
			AdminName = adminName;
		}
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		
		
}

