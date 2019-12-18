package Baggage_System;

public class Main {

	public static void main(String[] args) {
		Bag bag = new Bag(new RequestInfo(123), new State(false,false,true), new Man("Taro",123456789,new Adress(1,1)), new Man("Jiro",987654321,new Adress(2,2)));
	EncedData encedData = new EncedData();
	String str = encedData.encData(bag);
	System.out.println(str);

	}

}
