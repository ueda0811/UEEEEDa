package Baggage_System;

public class Man {

	private String name;

	private int number;

	private Adress adress;  //住所になってた（直す）
	
	public Man(String name, int number, Adress adress){
		this.name = name;
		this.number = number;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}


	public int getNumber() {
		return number;
	}


	public Adress getAdress() {
		return adress;
	}


}
