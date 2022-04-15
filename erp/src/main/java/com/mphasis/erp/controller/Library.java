package com.mphasis.erp.controller;


	import javax.persistence.Column;
import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name ="Library")
	public class Library {

		@Id
		@GeneratedValue
		@Column(name ="pin")
		private int pin;
		@Column(name ="uname")
		private String uname;
		public int getPin() {
			return pin;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public String getUname() {
			return uname;
		}
		public void setUname(String uname) {
			this.uname = uname;
		}
		
		
	}



